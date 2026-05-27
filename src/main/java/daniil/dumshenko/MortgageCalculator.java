package daniil.dumshenko;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
  final int monthsInYear = 12;
  final int percent = 100;
  private final Scanner scanner = new Scanner(System.in);

  public String mortgageCalculator() {

    int principal = (int) readNumber("Principal", 1000, 1_000_000);
    double annualInterest = readNumber("Annual Interest Rate", 1, 30);
    int period = (int) readNumber("Period (Years)", 1, 30);

    for (int months = 1; months <= period * monthsInYear; months++) {
      double balance = calculateBalance(principal, annualInterest, period, months);
      System.out.println(months + " " + NumberFormat.getCurrencyInstance().format(balance));
    }

    return calculateMortgage(principal, annualInterest, period);
  }

  public String calculateMortgage(int principal, double annualInterest, int period) {
    double monthlyInterest = (annualInterest / percent / monthsInYear);
    int numberOfPayments = period * monthsInYear;

    double result =
        principal
            * ((monthlyInterest * (Math.pow((1 + monthlyInterest), numberOfPayments)))
                / ((Math.pow((1 + monthlyInterest), (numberOfPayments))) - 1));
    NumberFormat currency = NumberFormat.getCurrencyInstance();

    return currency.format(result);
  }

  public double readNumber(String prompt, double min, double max) {
    double value;

    while (true) {
      System.out.print(prompt + ": ");
      if (!scanner.hasNextDouble()) {
        System.out.println("Enter a valid number.");
        scanner.next();
        continue;
      }

      value = scanner.nextDouble();

      if (value >= min && value <= max) {
        break;
      } else {
        System.out.println("Value must be between " + min + " and " + max);
      }
    }
    return value;
  }

  public double calculateBalance(
      int principal, double annualInterest, int period, int numberOfPaymentsMade) {

    double monthlyInterest = (annualInterest / percent / monthsInYear);
    int numberOfPayments = period * monthsInYear;

    return principal
        * (Math.pow(1 + monthlyInterest, numberOfPayments)
            - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
  }
}
