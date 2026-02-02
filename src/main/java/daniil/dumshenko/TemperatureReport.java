package daniil.dumshenko;

import java.util.Arrays;
import java.util.Scanner;

public class TemperatureReport {
    private double averageTempFormatted;
  private int minTemp;
  private int maxTemp;
  private int countOfDaysWithTemp25;

  public void temperatureReport() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Day 1: ");
    int day1Temp = scanner.nextInt();

    System.out.print("Day 2: ");
    int day2Temp = scanner.nextInt();

    System.out.print("Day 3: ");
    int day3Temp = scanner.nextInt();

    System.out.print("Day 4: ");
    int day4Temp = scanner.nextInt();

    System.out.print("Day 5: ");
    int day5Temp = scanner.nextInt();

    System.out.print("Day 6: ");
    int day6Temp = scanner.nextInt();

    System.out.print("Day 7: ");
    int day7Temp = scanner.nextInt();

      double averageTemp = (double) (day1Temp + day2Temp + day3Temp + day4Temp + day5Temp + day6Temp + day7Temp) / 7;
    averageTempFormatted = Double.parseDouble(String.format("%.1f", averageTemp));

    int[] temps = {day1Temp, day2Temp, day3Temp, day4Temp, day5Temp, day6Temp, day7Temp};

    minTemp = Arrays.stream(temps).min().orElse(Integer.MAX_VALUE);
    maxTemp = Arrays.stream(temps).max().orElse(Integer.MIN_VALUE);

    countOfDaysWithTemp25 = (int) Arrays.stream(temps).filter(e -> e > 25).count();
  }

  @Override
  public String toString() {
    return "TemperatureReport{:"
        + "\nAverageTemp="
        + averageTempFormatted
        + "\nMinimumTemp="
        + minTemp
        + "\nMaximumTemp="
        + maxTemp
        + "\nCountOfDaysWithTempHigherThan25="
        + countOfDaysWithTemp25
        + '}';
  }
}
