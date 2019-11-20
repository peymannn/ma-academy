package Factorial;

public class LoopFactorial {

      public int findFactorial(int number) {
        int factorialResult = 1;
        for (int i = 1; i <= number; i++)
            factorialResult *= i;
        return factorialResult;
    }
}