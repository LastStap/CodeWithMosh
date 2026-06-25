package daniil.dumshenko;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyConverter {
  // training rates
  private static final double EUR_TO_USD = 1.5;
  private static final double EUR_TO_GBP = 0.85;
  private static final double EUR_TO_UAH = 45.0;

  public static void main(String[] args) {
    NumberFormat currencyFormatterEur = NumberFormat.getCurrencyInstance(Locale.GERMANY);
    NumberFormat currencyFormatterGbp = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
    NumberFormat currencyFormatterUah =
        NumberFormat.getCurrencyInstance(Locale.forLanguageTag("uk-UA"));
    NumberFormat currencyFormatterUsd = NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat percentFormatter = NumberFormat.getPercentInstance();

    double amountInEur = 100.0;
    double exampleFee = 0.02;

    double amountInUsd = amountInEur * EUR_TO_USD;
    double amountInGbp = amountInEur * EUR_TO_GBP;
    double amountInUah = amountInEur * EUR_TO_UAH;

    long roundedAmount = Math.round(amountInUsd);

    System.out.println("================================");
    System.out.println("CURRENCY CONVERTER");
    System.out.println("================================");

    System.out.println("Rates type: training rates");
    System.out.println("Base amount: " + currencyFormatterEur.format(amountInEur));

    System.out.println("EUR to USD: " + currencyFormatterUsd.format(amountInUsd));
    System.out.println("EUR to GBP: " + currencyFormatterGbp.format(amountInGbp));
    System.out.println("EUR to UAH: " + currencyFormatterUah.format(amountInUah));

    System.out.println("Example Fee: " + percentFormatter.format(exampleFee));
    System.out.println("Rounded amount: " + roundedAmount);
    System.out.println("================================");
  }
}
