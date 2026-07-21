package daniil.dumshenko.day6;

public final class MultiplicationTable {
  private MultiplicationTable() {}

  public static String build(int size) {
    if (size < 1) {
      throw new IllegalArgumentException("Table size must be positive.");
    }
    StringBuilder table = new StringBuilder();
    for (int row = 1; row <= size; row++) {
      for (int column = 1; column <= size; column++) {
        table.append(String.format("%4d", row * column));
      }
      if (row < size) {
        table.append(System.lineSeparator());
      }
    }
    return table.toString();
  }

  public static String buildFor(int number) {
    StringBuilder table = new StringBuilder();
    for (int multiplier = 1; multiplier <= 10; multiplier++) {
      table.append(number).append(" x ").append(multiplier).append(" = ")
          .append(number * multiplier);
      if (multiplier < 10) {
        table.append(System.lineSeparator());
      }
    }
    return table.toString();
  }

  public static void main(String[] args) {
    System.out.println(build(10));
    System.out.println(buildFor(5));
  }
}
