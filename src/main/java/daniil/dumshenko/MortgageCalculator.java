package daniil.dumshenko;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
  final int monthsInYear = 12;
  final int percent = 100;
  private final Scanner scanner = new Scanner(System.in);
  NumberFormat currency = NumberFormat.getCurrencyInstance();
  int principal = 0;
  double monthlyInterest = 0;
  int periodInMonths = 0;
  double annualInterest = 0;
  int periodInYears = 0;
  double result = 0;
  String formattedResult;

  public String calculateMortgage() {

    principal = readPrincipal();

    annualInterest = readingAnnualInterestRate();

    periodInMonths = readingPeriodInMonths();

    result = calculateMortgagePayment();

    formattedResult = formatMortgagePayment();

    return formattedResult;
  }

  public int readPrincipal() {
    while (true) {
      System.out.print("Сума кредиту ($1 тис. - $1 млн): "); // "Principal ($1k - $1m): "
      principal = scanner.nextInt();

      if (principal >= 100 && principal <= 1_000_000) {
        break;
      } else {
        System.out.println(
            "Введіть значення від 1000 до 1 000 000"); // "Enter a value between 1000 and 1 000 000"
      }
    }
    return principal;
  }

  public double readingAnnualInterestRate() {
    while (true) {
      System.out.print("Річна відсоткова ставка: "); // "Annual Interest Rate: "
      annualInterest = scanner.nextDouble();

      if (annualInterest > 0 && annualInterest <= 30) {
        monthlyInterest = (annualInterest / percent / monthsInYear);
        break;
      } else {
        System.out.println(
            "Введіть значення більше 0 і не більше 30"); // "Enter a value that greater than 0 and
        // less than or equal to 30"
      }
    }
    return annualInterest;
  }

  public int readingPeriodInMonths() {
    while (true) {
      System.out.print("Строк кредиту (роки): "); // "Period (Years): "
      int periodInYears = scanner.nextInt();

      if (periodInYears >= 1 && periodInYears <= 30) {
        periodInMonths = periodInYears * monthsInYear;
        break;
      } else {
        System.out.println("Введіть значення від 1 до 30"); // "Enter a value between 1 and 30"
      }
    }
    return periodInMonths;
  }

  public double calculateMortgagePayment() {
    return result =
        principal
            * ((monthlyInterest * (Math.pow((1 + monthlyInterest), periodInMonths)))
                / ((Math.pow((1 + monthlyInterest), (periodInMonths))) - 1));
  }

  public String formatMortgagePayment() {
    return currency.format(result);
  }
}
