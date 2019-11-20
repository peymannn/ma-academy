package Fibonacci;

public class RecursiveFibonacci {

    public int recurciveFibonacci(int number) {
        if (number < 0)
            throw new IllegalArgumentException();
        else if (number == 1)
            return 1;
        else if (number == 0)
            return 0;
        else
            return recurciveFibonacci(number-1) + recurciveFibonacci(number-2);

    }
}