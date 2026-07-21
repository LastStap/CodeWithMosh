package daniil.dumshenko;

import daniil.dumshenko.day6.DigitSum;
import daniil.dumshenko.day6.FactorialCalculator;
import daniil.dumshenko.day6.PalindromeChecker;
import daniil.dumshenko.day6.PrimeChecker;
import daniil.dumshenko.day6.SecondLargestFinder;
import junit.framework.TestCase;

public class Day6LoopsTest extends TestCase {
  public void testDigitSum() {
    assertEquals(0, DigitSum.calculate(0));
    assertEquals(7, DigitSum.calculate(7));
    assertEquals(15, DigitSum.calculate(12345));
    assertEquals(3, DigitSum.calculate(1002));
    assertEquals(6, DigitSum.calculate(-321));
    assertEquals(47, DigitSum.calculate(Integer.MIN_VALUE));
  }

  public void testFactorialBoundaries() {
    assertEquals(1L, FactorialCalculator.calculate(0));
    assertEquals(120L, FactorialCalculator.calculate(5));
    assertEquals(2_432_902_008_176_640_000L, FactorialCalculator.calculate(20));
    assertInvalid(() -> FactorialCalculator.calculate(-1));
    assertInvalid(() -> FactorialCalculator.calculate(21));
  }

  public void testPalindromes() {
    assertTrue(PalindromeChecker.isPalindrome(0));
    assertTrue(PalindromeChecker.isPalindrome(7));
    assertTrue(PalindromeChecker.isPalindrome(121));
    assertTrue(PalindromeChecker.isPalindrome(1221));
    assertFalse(PalindromeChecker.isPalindrome(123));
    assertFalse(PalindromeChecker.isPalindrome(10));
    assertInvalid(() -> PalindromeChecker.isPalindrome(-121));
  }

  public void testPrimeNumbers() {
    assertFalse(PrimeChecker.isPrime(-5));
    assertFalse(PrimeChecker.isPrime(0));
    assertFalse(PrimeChecker.isPrime(1));
    assertTrue(PrimeChecker.isPrime(2));
    assertTrue(PrimeChecker.isPrime(3));
    assertFalse(PrimeChecker.isPrime(4));
    assertTrue(PrimeChecker.isPrime(17));
    assertFalse(PrimeChecker.isPrime(25));
    assertTrue(PrimeChecker.isPrime(97));
  }

  public void testSecondLargest() {
    assertEquals(7, SecondLargestFinder.find(new int[] {5, 1, 9, 3, 7}));
    assertEquals(7, SecondLargestFinder.find(new int[] {9, 9, 7}));
    assertEquals(-5, SecondLargestFinder.find(new int[] {-5, -1, -10}));
    assertInvalid(() -> SecondLargestFinder.find(new int[] {2, 2, 2}));
    assertInvalid(() -> SecondLargestFinder.find(new int[] {5}));
    assertInvalid(() -> SecondLargestFinder.find(new int[] {}));
  }

  private void assertInvalid(Runnable action) {
    try {
      action.run();
      fail("Expected IllegalArgumentException.");
    } catch (IllegalArgumentException expected) {
      assertNotNull(expected.getMessage());
    }
  }
}
