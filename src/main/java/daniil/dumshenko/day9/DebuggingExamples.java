package daniil.dumshenko.day9;

public final class DebuggingExamples {
  private DebuggingExamples() {}

  public static int divide(int dividend, int divisor) {
    if (divisor == 0) {
      throw new IllegalArgumentException("Divisor must not be zero.");
    }
    return dividend / divisor;
  }

  public static int inclusiveSum(int limit) {
    if (limit < 0) {
      throw new IllegalArgumentException("Limit must not be negative.");
    }
    int sum = 0;
    for (int number = 0; number <= limit; number++) {
      sum += number;
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println("10 / 2 = " + divide(10, 2));
    System.out.println("Inclusive sum to 5 = " + inclusiveSum(5));
  }
}
