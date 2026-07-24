package daniil.dumshenko.day8;

import junit.framework.TestCase;

public class Day8MortgageCalculatorTest extends TestCase {
  public void testPaymentAndSchedule() {
    double payment = MortgageCalculator.calculatePayment(100_000, 6, 30);
    assertEquals(599.55, payment, 0.01);

    double[] schedule = MortgageCalculator.paymentSchedule(100_000, 6, 30);
    assertEquals(360, schedule.length);
    assertTrue(schedule[0] < 100_000);
    assertEquals(0.0, schedule[359], 0.01);
  }

  public void testInvalidLoanValues() {
    assertInvalid(() -> MortgageCalculator.calculatePayment(999, 6, 30));
    assertInvalid(() -> MortgageCalculator.calculatePayment(100_000, 0, 30));
    assertInvalid(() -> MortgageCalculator.calculatePayment(100_000, 6, 31));
    assertInvalid(() -> MortgageCalculator.remainingBalance(100_000, 6, 30, 361));
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
