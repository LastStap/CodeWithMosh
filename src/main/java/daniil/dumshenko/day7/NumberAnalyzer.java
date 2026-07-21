package daniil.dumshenko.day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class NumberAnalyzer {
  private NumberAnalyzer() {}

  public static NumberStatistics analyze(List<Integer> numbers) {
    if (numbers == null || numbers.isEmpty()) {
      throw new IllegalArgumentException("At least one number is required.");
    }
    int minimum = numbers.getFirst();
    int maximum = numbers.getFirst();
    long sum = 0;
    int evenCount = 0;
    for (int number : numbers) {
      minimum = Math.min(minimum, number);
      maximum = Math.max(maximum, number);
      sum += number;
      if (number % 2 == 0) {
        evenCount++;
      }
    }
    return new NumberStatistics(
        numbers.size(), minimum, maximum, (double) sum / numbers.size(), evenCount,
        numbers.size() - evenCount);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> numbers = new ArrayList<>();
    System.out.println("Enter integers; type 'done' to finish:");
    while (scanner.hasNext()) {
      if (scanner.hasNextInt()) {
        numbers.add(scanner.nextInt());
      } else if ("done".equalsIgnoreCase(scanner.next())) {
        break;
      } else {
        System.out.println("Ignored non-numeric value.");
      }
    }
    if (numbers.isEmpty()) {
      System.out.println("No numbers entered.");
      return;
    }
    NumberStatistics result = analyze(numbers);
    System.out.printf(
        "count=%d, min=%d, max=%d, average=%.2f, even=%d, odd=%d%n",
        result.count(), result.minimum(), result.maximum(), result.average(),
        result.evenCount(), result.oddCount());
  }
}
