package daniil.dumshenko.previousLessons;

import java.util.Scanner;

public class DividedNumbers {
    final String messageForNumber5 = "Fizz";
    final String messageForNumber3 = "Buzz";
    final String messageForNumber3and5 = "FizzBuzz";

    public String dividedNumbers () {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Please, enter Number: ");
    int number = scanner.nextInt();

    if ((number % 5 == 0) && (number % 3 == 0)) {
        return messageForNumber3and5;

    } else if (number % 3 == 0){
        return messageForNumber3;

    } else if (number % 5 == 0 ) {

    } else return String.valueOf(number);
        return messageForNumber5;
    }
    @Override
    public String toString() {
        return dividedNumbers();
    }
}
