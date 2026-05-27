package daniil.dumshenko;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public String mortgageCalculator() {

       int principal = (int) readNumber("Principal", 1000, 1_000_000);
       double annualInterest = readNumber("Annual Interest Rate", 1, 30);
       int period = (int) readNumber("Period (Years)", 1, 30);

        return calculateMortgage(principal, annualInterest, period);
    }

    public String calculateMortgage(int principal, double annualInterest, int period) {
        final int monthsInYear = 12;
        final int percent = 100;
        int periodInMonths = period * monthsInYear;
        double monthlyInterest = (annualInterest / percent / monthsInYear);

        double result = principal * ((monthlyInterest * (Math.pow((1 + monthlyInterest), periodInMonths)) ) / ((Math.pow((1 + monthlyInterest) , (periodInMonths))) - 1 ));
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        return currency.format(result);
    }

    public double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;

        while (true) {
            System.out.print(prompt + ": ");
            value = scanner.nextInt();

            if (value >= min && value <= max) {
                break; } else {
                System.out.println("Value must be between " + min + " and " + max);
            }
        }
        return value;
    }
}
