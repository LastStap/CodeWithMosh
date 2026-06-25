package daniil.dumshenko;

import java.util.Arrays;

public class ArrayExperiments {
  public static void main(String[] args) {
    int[] scores = {78, 92, 64, 100, 85};
    System.out.println(scores[0]);
    System.out.println(scores[2]);
    System.out.println(scores[4]);
    scores[1] = 112;
    System.out.println(scores.length);
    System.out.println(Arrays.toString(scores));

    double[] prices = new double[4];
    prices[0] = 112;
    prices[1] = 78;
    prices[2] = 92;
    prices[3] = 64;
    System.out.println(Arrays.toString(prices));

    System.out.println(scores[4]);

    int[][] matrix = {{1, 2, 3}, {4, 5, 6, 7, 8}, {7, 8}};
    System.out.println(Arrays.deepToString(matrix));
    System.out.println(Arrays.toString(matrix[0]));
    System.out.println(Arrays.toString(matrix[1]));
    System.out.println(Arrays.toString(matrix[2]));

    System.out.println(Math.max(matrix[0].length, matrix[1].length));

    System.out.println(Math.min(matrix[1].length, matrix[2].length));

    System.out.println(Math.round(14.6));
    System.out.println(Math.ceil(14.6));
    System.out.println(Math.floor(14.6));

    System.out.println(Math.random());

    System.out.println(
        (int)
            (Math.random()
                * 100)); // Math.random() виводить число від 0 до 1 і я просто помножив на 100, а
                         // також за допомогою (int) прибрав дробову частину
  }
}
