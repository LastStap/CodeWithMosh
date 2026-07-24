package daniil.dumshenko.day5;

import java.util.Scanner;

public class FizzBuzz {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer: ");

    if (!scanner.hasNextInt()) {
      System.out.println("Invalid input: enter an integer.");
      return;
    }

    System.out.println(resultFor(scanner.nextInt()));
  }

  static String resultFor(int number) {
    if (number % 5 == 0 && number % 3 == 0) {
      return "FizzBuzz";
    } else if (number % 5 == 0) {
      return "Fizz";
    } else if (number % 3 == 0) {
      return "Buzz";
    }
    return String.valueOf(number);
  }
}
