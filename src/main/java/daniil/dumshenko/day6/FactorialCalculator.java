package daniil.dumshenko.day6;

public final class FactorialCalculator {
  public static final int MAX_INPUT = 20;

  private FactorialCalculator() {}

  public static long calculate(int number) {
    if (number < 0 || number > MAX_INPUT) {
      throw new IllegalArgumentException("Factorial input must be between 0 and 20.");
    }
    long result = 1;
    for (int factor = 2; factor <= number; factor++) {
      result *= factor;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(calculate(10));
  }
}
