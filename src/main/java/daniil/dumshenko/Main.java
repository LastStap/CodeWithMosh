package daniil.dumshenko;

public class Main
{
    public static void main( String[] args ) {
        MortgageCalculator mortgageCalculator = new MortgageCalculator();
        String result = mortgageCalculator.calculateMortgage();
        System.out.println("Mortgage: " + result);
    }
}
