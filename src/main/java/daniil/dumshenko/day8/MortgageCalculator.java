package daniil.dumshenko.day8;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {
  private static final int MONTHS_IN_YEAR = 12;
  private static final int PERCENT = 100;
  private static final int MIN_PRINCIPAL = 1_000;
  private static final int MAX_PRINCIPAL = 1_000_000;
  private static final int MIN_YEARS = 1;
  private static final int MAX_YEARS = 30;
  private static final double MAX_ANNUAL_INTEREST = 30;

  private final Scanner scanner;
  private final NumberFormat currency;

  public MortgageCalculator() {
    this(new Scanner(System.in));
  }

  MortgageCalculator(Scanner scanner) {
    this.scanner = scanner;
    this.currency = NumberFormat.getCurrencyInstance(Locale.GERMANY);
  }

  public String calculateMortgage() {
    int principal = readInt("Сума кредиту (€1 тис. - €1 млн): ", MIN_PRINCIPAL, MAX_PRINCIPAL);
    double annualInterest = readDouble("Річна відсоткова ставка: ", 0, MAX_ANNUAL_INTEREST);
    int years = readInt("Строк кредиту (роки): ", MIN_YEARS, MAX_YEARS);
    return currency.format(calculatePayment(principal, annualInterest, years));
  }

  public static double calculatePayment(int principal, double annualInterest, int years) {
    validateLoan(principal, annualInterest, years);
    double monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
    int numberOfPayments = years * MONTHS_IN_YEAR;
    double growth = Math.pow(1 + monthlyInterest, numberOfPayments);
    return principal * monthlyInterest * growth / (growth - 1);
  }

  public static double remainingBalance(
      int principal, double annualInterest, int years, int paymentsMade) {
    validateLoan(principal, annualInterest, years);
    int numberOfPayments = years * MONTHS_IN_YEAR;
    if (paymentsMade < 0 || paymentsMade > numberOfPayments) {
      throw new IllegalArgumentException("Payments made is outside the loan period.");
    }
    double rate = annualInterest / PERCENT / MONTHS_IN_YEAR;
    double totalGrowth = Math.pow(1 + rate, numberOfPayments);
    double paidGrowth = Math.pow(1 + rate, paymentsMade);
    return principal * (totalGrowth - paidGrowth) / (totalGrowth - 1);
  }

  public static double[] paymentSchedule(int principal, double annualInterest, int years) {
    validateLoan(principal, annualInterest, years);
    int payments = years * MONTHS_IN_YEAR;
    double[] balances = new double[payments];
    for (int month = 1; month <= payments; month++) {
      balances[month - 1] = remainingBalance(principal, annualInterest, years, month);
    }
    return balances;
  }

  private int readInt(String prompt, int minimum, int maximum) {
    while (true) {
      System.out.print(prompt);
      if (scanner.hasNextInt()) {
        int value = scanner.nextInt();
        if (value >= minimum && value <= maximum) {
          return value;
        }
      } else {
        scanner.next();
      }
      System.out.printf("Введіть ціле значення від %d до %d.%n", minimum, maximum);
    }
  }

  private double readDouble(String prompt, double minimumExclusive, double maximum) {
    while (true) {
      System.out.print(prompt);
      if (scanner.hasNextDouble()) {
        double value = scanner.nextDouble();
        if (value > minimumExclusive && value <= maximum) {
          return value;
        }
      } else {
        scanner.next();
      }
      System.out.printf("Введіть значення більше %.0f і не більше %.0f.%n", minimumExclusive, maximum);
    }
  }

  private static void validateLoan(int principal, double annualInterest, int years) {
    if (principal < MIN_PRINCIPAL || principal > MAX_PRINCIPAL) {
      throw new IllegalArgumentException("Principal must be between 1000 and 1000000.");
    }
    if (annualInterest <= 0 || annualInterest > MAX_ANNUAL_INTEREST) {
      throw new IllegalArgumentException("Annual interest must be greater than 0 and at most 30.");
    }
    if (years < MIN_YEARS || years > MAX_YEARS) {
      throw new IllegalArgumentException("Years must be between 1 and 30.");
    }
  }
}
