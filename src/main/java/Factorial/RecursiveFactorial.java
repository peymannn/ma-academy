package Factorial;

public class RecursiveFactorial {
    public static void main(String[] args) {
        int number = 4;
        System.out.println(recursiveFactorial(number));
    }

    public static int recursiveFactorial(int number) {
        if (number>1)
            return number*recursiveFactorial(number-1);
        else
            return 1;
    }
}