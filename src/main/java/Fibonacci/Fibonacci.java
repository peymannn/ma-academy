package Fibonacci;

import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        int endNumber = 17;
        showArray(calculatorFibonacci(endNumber));
    }

    public static int[] calculatorFibonacci(int endNumber) {
        int i , number;
        int[] numbers = new int[endNumber];
        numbers[0] = 0;
        numbers[1] = 1;
        for (i = 1; i < endNumber-1; i++) {
            number = numbers[i] + numbers[i-1];
           numbers[i+1] = number;
        }
        return numbers;
    }
    private static void showArray(int[] numbers) {
        for (int k = 0; k < numbers.length; k++) {
            System.out.print(numbers[k] + " ");
        }
    }
}