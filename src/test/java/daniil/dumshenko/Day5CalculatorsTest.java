package daniil.dumshenko;

import junit.framework.TestCase;

public class Day5CalculatorsTest extends TestCase {
  public void testFizzBuzzCases() {
    assertEquals("FizzBuzz", FizzBuzz.resultFor(15));
    assertEquals("Fizz", FizzBuzz.resultFor(10));
    assertEquals("Buzz", FizzBuzz.resultFor(9));
    assertEquals("7", FizzBuzz.resultFor(7));
    assertEquals("FizzBuzz", FizzBuzz.resultFor(0));
    assertEquals("FizzBuzz", FizzBuzz.resultFor(-15));
  }

  public void testTaxRateBoundaries() {
    assertEquals(0.0, TaxCalculator.rateFor(0));
    assertEquals(0.0, TaxCalculator.rateFor(10_000));
    assertEquals(0.10, TaxCalculator.rateFor(10_001));
    assertEquals(0.10, TaxCalculator.rateFor(40_000));
    assertEquals(0.20, TaxCalculator.rateFor(40_001));
    assertEquals(0.20, TaxCalculator.rateFor(100_000));
    assertEquals(0.30, TaxCalculator.rateFor(100_001));
  }

  public void testNegativeIncomeIsRejected() {
    try {
      TaxCalculator.rateFor(-1);
      fail("Negative income must be rejected.");
    } catch (IllegalArgumentException expected) {
      assertEquals("Income cannot be negative.", expected.getMessage());
    }
  }

  public void testBmiCategoryBoundaries() {
    assertEquals("Underweight", BmiCalculator.categoryFor(18.49));
    assertEquals("Normal", BmiCalculator.categoryFor(18.5));
    assertEquals("Normal", BmiCalculator.categoryFor(24.99));
    assertEquals("Overweight", BmiCalculator.categoryFor(25));
    assertEquals("Overweight", BmiCalculator.categoryFor(29.99));
    assertEquals("Obese", BmiCalculator.categoryFor(30));
  }

  public void testInvalidBmiInputsAreRejected() {
    try {
      BmiCalculator.calculate(0, 1.8);
      fail("Zero weight must be rejected.");
    } catch (IllegalArgumentException expected) {
      assertEquals("Weight and height must be greater than zero.", expected.getMessage());
    }

    try {
      BmiCalculator.calculate(80, 0);
      fail("Zero height must be rejected.");
    } catch (IllegalArgumentException expected) {
      assertEquals("Weight and height must be greater than zero.", expected.getMessage());
    }
  }
}
