package daniil.dumshenko;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public String calculateMortgage () {
        final int monthsInYear = 12;
        final int percent = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        double annualInterest = scanner.nextDouble();
        double monthlyInterest = (annualInterest / percent / monthsInYear);

        System.out.print("Period (Years): ");
        int period = scanner.nextInt();
        int periodInMonths = period * monthsInYear;

        double result = principal * ((monthlyInterest * (Math.pow((1 + monthlyInterest), periodInMonths)) ) / ((Math.pow((1 + monthlyInterest) , (periodInMonths))) - 1 ));
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        return currency.format(result);
    };
}
