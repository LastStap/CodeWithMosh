package daniil.dumshenko.day7;

import daniil.dumshenko.day7.NumberAnalyzer;
import daniil.dumshenko.day7.NumberStatistics;
import java.util.List;
import junit.framework.TestCase;

public class Day7NumberAnalyzerTest extends TestCase {
  public void testMixedNumbers() {
    NumberStatistics result = NumberAnalyzer.analyze(List.of(5, -2, 8, 8, 0));
    assertEquals(5, result.count());
    assertEquals(-2, result.minimum());
    assertEquals(8, result.maximum());
    assertEquals(3.8, result.average(), 0.0001);
    assertEquals(4, result.evenCount());
    assertEquals(1, result.oddCount());
  }

  public void testSingleNumber() {
    NumberStatistics result = NumberAnalyzer.analyze(List.of(-3));
    assertEquals(-3, result.minimum());
    assertEquals(-3, result.maximum());
    assertEquals(-3.0, result.average());
    assertEquals(0, result.evenCount());
    assertEquals(1, result.oddCount());
  }

  public void testEmptyInputIsRejected() {
    try {
      NumberAnalyzer.analyze(List.of());
      fail("Empty input must be rejected.");
    } catch (IllegalArgumentException expected) {
      assertEquals("At least one number is required.", expected.getMessage());
    }
  }
}
