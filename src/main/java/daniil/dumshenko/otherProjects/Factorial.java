package daniil.dumshenko.otherProjects;

public class Factorial {
    public static int getFactorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * getFactorial(n - 1);
        }
    }
}
