package daniil.dumshenko;

import daniil.dumshenko.day9.DebuggingExamples;
import junit.framework.TestCase;

public class Day9DebuggingExamplesTest extends TestCase {
  public void testCorrectedLogic() {
    assertEquals(5, DebuggingExamples.divide(10, 2));
    assertEquals(15, DebuggingExamples.inclusiveSum(5));
  }

  public void testRuntimeFailureIsReplacedWithValidation() {
    try {
      DebuggingExamples.divide(10, 0);
      fail("Zero divisor must be rejected.");
    } catch (IllegalArgumentException expected) {
      assertEquals("Divisor must not be zero.", expected.getMessage());
    }
  }
}
