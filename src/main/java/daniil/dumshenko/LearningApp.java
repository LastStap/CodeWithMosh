package daniil.dumshenko;

import daniil.dumshenko.day6.DigitSum;
import daniil.dumshenko.day6.PrimeChecker;
import daniil.dumshenko.day7.NumberAnalyzer;
import daniil.dumshenko.day7.NumberStatistics;
import java.util.List;

public final class LearningApp {
  private LearningApp() {}

  public static void main(String[] args) {
    NumberStatistics statistics = NumberAnalyzer.analyze(List.of(4, 7, -2, 9, 0));
    System.out.println("CodeWithMosh days 1-9 demo");
    System.out.println("Digit sum of -321: " + DigitSum.calculate(-321));
    System.out.println("97 is prime: " + PrimeChecker.isPrime(97));
    System.out.printf(
        "NumberAnalyzer: count=%d, min=%d, max=%d, average=%.2f%n",
        statistics.count(), statistics.minimum(), statistics.maximum(), statistics.average());
    System.out.printf("Mortgage payment: %.2f%n", MortgageCalculator.calculatePayment(100_000, 6, 30));
  }
}
