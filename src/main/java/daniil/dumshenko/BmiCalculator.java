package daniil.dumshenko;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BmiCalculator {
  private static final double NORMAL_MINIMUM = 18.5;
  private static final double OVERWEIGHT_MINIMUM = 25.0;
  private static final double OBESE_MINIMUM = 30.0;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Weight in kilograms: ");
    if (!scanner.hasNextDouble()) {
      System.out.println("Invalid input: weight must be a number.");
      return;
    }
    double weight = scanner.nextDouble();

    System.out.print("Height in meters: ");
    if (!scanner.hasNextDouble()) {
      System.out.println("Invalid input: height must be a number.");
      return;
    }
    double height = scanner.nextDouble();

    if (weight <= 0 || height <= 0) {
      System.out.println("Invalid input: weight and height must be greater than zero.");
      return;
    }

    double bmi = calculate(weight, height);
    System.out.println("BMI: " + new DecimalFormat("0.0#").format(bmi));
    System.out.println("Category: " + categoryFor(bmi));
  }

  static double calculate(double weight, double height) {
    if (weight <= 0 || height <= 0) {
      throw new IllegalArgumentException("Weight and height must be greater than zero.");
    }
    return weight / (height * height);
  }

  static String categoryFor(double bmi) {
    if (bmi < 0) {
      throw new IllegalArgumentException("BMI cannot be negative.");
    } else if (bmi < NORMAL_MINIMUM) {
      return "Underweight";
    } else if (bmi < OVERWEIGHT_MINIMUM) {
      return "Normal";
    } else if (bmi < OBESE_MINIMUM) {
      return "Overweight";
    }
    return "Obese";
  }
}
