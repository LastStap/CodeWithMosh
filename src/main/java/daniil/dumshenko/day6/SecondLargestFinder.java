package daniil.dumshenko.day6;

public final class SecondLargestFinder {
  private SecondLargestFinder() {}

  public static int find(int[] values) {
    if (values == null || values.length < 2) {
      throw new IllegalArgumentException("At least two values are required.");
    }
    Integer largest = null;
    Integer secondLargest = null;
    for (int value : values) {
      if (largest == null || value > largest) {
        secondLargest = largest;
        largest = value;
      } else if (value != largest && (secondLargest == null || value > secondLargest)) {
        secondLargest = value;
      }
    }
    if (secondLargest == null) {
      throw new IllegalArgumentException("No second distinct value exists.");
    }
    return secondLargest;
  }

  public static void main(String[] args) {
    System.out.println(find(new int[] {5, 1, 9, 3, 7}));
  }
}
