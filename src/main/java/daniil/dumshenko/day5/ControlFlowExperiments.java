package daniil.dumshenko.day5;

public class ControlFlowExperiments {
  public static void main(String[] args) {
    int number = -4;
    System.out.println("Number category: " + categorizeNumber(number));

    int age = 16;
    System.out.println("Age category: " + categorizeAge(age));
    System.out.println("Even: " + (number % 2 == 0));
    System.out.println("In range 10-20: " + isInRange(15));

    boolean isAdmin = false;
    boolean hasValidToken = true;
    boolean hasAccess = isAdmin || hasValidToken;
    System.out.println("Has access: " + hasAccess);
    System.out.println("Token is invalid: " + !hasValidToken);

    String parity = number % 2 == 0 ? "even" : "odd";
    System.out.println("Parity (ternary): " + parity);
    System.out.println("Day of week: " + dayOfWeek(3));
    System.out.println("Grade for 92: " + gradeFor(92));

    int denominator = 0;
    boolean isSafe = denominator != 0 && 100 / denominator > 5;
    System.out.println("Division is safe: " + isSafe);
  }

  static String categorizeNumber(int number) {
    if (number > 0) {
      return "positive";
    } else if (number < 0) {
      return "negative";
    }
    return "zero";
  }

  static String categorizeAge(int age) {
    if (age < 0) {
      return "invalid";
    } else if (age < 13) {
      return "child";
    } else if (age < 18) {
      return "teenager";
    }
    return "adult";
  }

  static boolean isInRange(int number) {
    return number >= 10 && number <= 20;
  }

  static String gradeFor(int score) {
    if (score >= 90) {
      return "A";
    } else if (score >= 75) {
      return "B";
    } else if (score >= 60) {
      return "C";
    }
    return "D";
  }

  static String dayOfWeek(int dayNumber) {
    return switch (dayNumber) {
      case 1 -> "Monday";
      case 2 -> "Tuesday";
      case 3 -> "Wednesday";
      case 4 -> "Thursday";
      case 5 -> "Friday";
      case 6 -> "Saturday";
      case 7 -> "Sunday";
      default -> "Invalid day";
    };
  }
}
