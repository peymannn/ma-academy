package Factorial;

public class LoopFactorial {

      public int findFactorial(int number) {
        int i , factorialResult = 1;
        for (i = 1; i <= number; i++)
            factorialResult *= i;
        return factorialResult;
    }
}