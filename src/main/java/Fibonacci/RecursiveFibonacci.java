package Fibonacci;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        int endNumber = 17;
        System.out.print(recurciveFibonacci(endNumber) + " ");
    }

    public static int recurciveFibonacci(int endNumber) {
        if (endNumber <= 0)
            return 0;
        else if (endNumber == 1)
            return 1;
        else
            return recurciveFibonacci(endNumber-1) + recurciveFibonacci(endNumber-2);

    }
}