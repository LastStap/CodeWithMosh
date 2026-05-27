package daniil.dumshenko;

public class Main
{
    public static void main( String[] args ) {
        MortgageCalculator mortgageCalculator = new MortgageCalculator();
        String mortgage = mortgageCalculator.mortgageCalculator();
        System.out.println("Mortgage: " + mortgage);
    }
}
