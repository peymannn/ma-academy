package Factorial;

public class Factorial {
    public static void main(String[] args) {
        int number = 4;
        System.out.println(findFactorial(number));
    }

    public static int findFactorial(int number) {
        int i,factorialResult = 1;
        for (i = 1; i <= number; i++)
            factorialResult *= i;
        return factorialResult;
    }
}