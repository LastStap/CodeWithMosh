package daniil.dumshenko;

import daniil.dumshenko.day10.Money;

public class Main
{
    public static void main( String[] args ) {
        Money salary = new Money(2500, "EUR");
        Money savings = new Money(1000, "EUR");

        System.out.println("Initial state:");
        salary.showAmount();
        savings.showAmount();

        salary.changeAmount(5000);

        System.out.println("After changing salary only:");
        salary.showAmount();
        savings.showAmount();

        Money sameReference = salary;

        sameReference.changeAmount(3000);
        System.out.println("After changing the object through sameReference:");
        salary.showAmount();

        salary = null;
        System.out.println("The object is still reachable through sameReference:");
        sameReference.showAmount();

        sameReference = null;
        System.out.println("The Money object is now unreachable and eligible for garbage collection.");
    }
}
