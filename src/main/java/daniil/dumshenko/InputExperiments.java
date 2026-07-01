package daniil.dumshenko;

import java.util.Scanner;

public class InputExperiments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ціле число: ");
        System.out.println("Ваше число: " + scanner.nextInt());

        System.out.print("Дробове число: ");
        System.out.println("Ваше дробове число: " + scanner.nextDouble());

        System.out.print("Одне слово: ");
        System.out.println("Ваше слово: " + scanner.next());
        scanner.nextLine();

        System.out.print("Повний рядок: ");
        System.out.println("Ваш рядок: " + scanner.nextLine());

    }
}
