package daniil.dumshenko.day6;

public final class DigitSum {
  private DigitSum() {}

  public static int calculate(int number) {
    long remaining = Math.abs((long) number);
    int sum = 0;
    while (remaining > 0) {
      sum += (int) (remaining % 10);
      remaining /= 10;
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(calculate(-321));
  }
}
