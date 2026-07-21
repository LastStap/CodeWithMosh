package daniil.dumshenko.day6;

public final class PalindromeChecker {
  private PalindromeChecker() {}

  public static boolean isPalindrome(int number) {
    if (number < 0) {
      throw new IllegalArgumentException("Number must not be negative.");
    }
    int remaining = number;
    long reversed = 0;
    while (remaining > 0) {
      reversed = reversed * 10 + remaining % 10;
      remaining /= 10;
    }
    return reversed == number;
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome(1221));
  }
}
