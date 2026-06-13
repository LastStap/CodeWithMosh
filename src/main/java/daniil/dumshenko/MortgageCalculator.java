package daniil.dumshenko;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

  public String calculateMortgage() {
    final int monthsInYear = 12;
    final int percent = 100;
    int principal = 0;
    double monthlyInterest = 0;
    int periodInMonths = 0;

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Principal ($1k - $1m): ");
      principal = scanner.nextInt();

      if (principal >= 100 && principal <= 1_000_000) {
        break;
      } else {
        System.out.println("Enter a value between 1000 and 1 000 000");
      }
    }

    while (true) {
      System.out.print("Annual Interest Rate: ");
      double annualInterest = scanner.nextDouble();

      if (annualInterest > 0 && annualInterest <= 30) {
        monthlyInterest = (annualInterest / percent / monthsInYear);
        break;
      } else {
        System.out.println("Enter a value that greater than 0 and less than or equal to 30");
      }
    }

    while (true) {
      System.out.print("Period (Years): ");
      int period = scanner.nextInt();

      if (period >= 1 && period <= 30) {
        periodInMonths = period * monthsInYear;
        break;
      } else {
        System.out.println("Enter a value between 1 and 30");
      }
    }

    double result =
        principal
            * ((monthlyInterest * (Math.pow((1 + monthlyInterest), periodInMonths)))
                / ((Math.pow((1 + monthlyInterest), (periodInMonths))) - 1));
    NumberFormat currency = NumberFormat.getCurrencyInstance();

    return currency.format(result);
  }
}
