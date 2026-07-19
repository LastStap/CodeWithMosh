package daniil.dumshenko;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class TaxCalculator {
  private static final double LOW_INCOME_LIMIT = 10_000;
  private static final double MIDDLE_INCOME_LIMIT = 40_000;
  private static final double HIGH_INCOME_LIMIT = 100_000;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Annual income: ");

    if (!scanner.hasNextDouble()) {
      System.out.println("Invalid input: enter a number.");
      return;
    }

    double income = scanner.nextDouble();
    if (income < 0) {
      System.out.println("Invalid income: value cannot be negative.");
      return;
    }

    double rate = rateFor(income);
    double tax = income * rate;
    NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.GERMANY);
    NumberFormat percent = NumberFormat.getPercentInstance(Locale.GERMANY);

    System.out.println("Tax rate: " + percent.format(rate));
    System.out.println("Tax: " + currency.format(tax));
    System.out.println("Net income: " + currency.format(income - tax));
  }

  static double rateFor(double income) {
    if (income < 0) {
      throw new IllegalArgumentException("Income cannot be negative.");
    } else if (income <= LOW_INCOME_LIMIT) {
      return 0;
    } else if (income <= MIDDLE_INCOME_LIMIT) {
      return 0.10;
    } else if (income <= HIGH_INCOME_LIMIT) {
      return 0.20;
    }
    return 0.30;
  }
}
