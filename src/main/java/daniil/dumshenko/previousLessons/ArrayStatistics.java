package daniil.dumshenko.previousLessons;

import java.util.Arrays;

public class ArrayStatistics {
  public static void main(String[] args) {
    int[] transactions = {120, -45, 300, -80, 50, -20, 700};

    if (transactions.length == 0) {
      System.err.println("Error: Array length is 0");
      return;
    }

    int sum = 0;
    int min = transactions[0];
    int max = transactions[0];
    double average = 0;
    int positiveCount = 0;
    int negativeCount = 0;
    int sumOfIncomes = 0;
    int sumOfExpenses = 0;
    int[] reversedTransactions = new int[transactions.length];

    int j = reversedTransactions.length - 1;

    for (int transaction : transactions) {
      sum += transaction;
      if (transaction < min) {
        min = transaction;
      }
      if (transaction > max) {
        max = transaction;
      }
    }

    for (int transaction : transactions) {
      if (transaction >= 0) {
        positiveCount++;
      } else {
        negativeCount++;
      }
    }

    for (int k : transactions) {
      average += k;
    }
    average = average / transactions.length;

    for (int transaction : transactions) {
      if (transaction >= 0) {
        sumOfIncomes += transaction;
      } else {
        sumOfExpenses += transaction;
      }
    }

    for (int transaction : transactions) {
      reversedTransactions[j] = transaction;
      j--;
    }

    System.out.println("sum = " + sum);
    System.out.println("min = " + min);
    System.out.println("max = " + max);
    System.out.println("average = " + average);
    System.out.println("positiveCount = " + positiveCount);
    System.out.println("negativeCount = " + negativeCount);
    System.out.println("sumOfIncomes = " + sumOfIncomes);
    System.out.println("sumOfExpenses = " + sumOfExpenses);
    System.out.println("reversedTransactions = " + Arrays.toString(reversedTransactions));
    System.out.println("transactions = " + Arrays.toString(transactions));
  }
}
