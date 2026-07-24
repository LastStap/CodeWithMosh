package daniil.dumshenko.day6;

public class LoopExperiments {
  public static void main(String[] args) {
    System.out.println("for: " + sumWithFor(5));
    System.out.println("while: " + sumWithWhile(5));
    System.out.println("do-while: " + sumWithDoWhile(5));

    int[] values = {2, -1, 4, 0, 8};
    int positiveSum = 0;
    for (int value : values) {
      if (value < 0) {
        continue;
      }
      if (value == 0) {
        break;
      }
      positiveSum += value;
    }
    System.out.println("Sum before sentinel: " + positiveSum);
  }

  static int sumWithFor(int limit) {
    int sum = 0;
    for (int i = 1; i <= limit; i++) {
      sum += i;
    }
    return sum;
  }

  static int sumWithWhile(int limit) {
    int sum = 0;
    int i = 1;
    while (i <= limit) {
      sum += i++;
    }
    return sum;
  }

  static int sumWithDoWhile(int limit) {
    if (limit < 1) {
      return 0;
    }
    int sum = 0;
    int i = 1;
    do {
      sum += i++;
    } while (i <= limit);
    return sum;
  }
}
