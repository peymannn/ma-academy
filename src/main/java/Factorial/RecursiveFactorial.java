package Factorial;

public class RecursiveFactorial {

    public int recursiveFactorial(int number) {
        if (number>1)
            return number*recursiveFactorial(number-1);
        else
            return 1;
    }
}