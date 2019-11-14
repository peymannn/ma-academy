package Fibonacci;

public class Fibonacci {

    public  int[] calculatorFibonacci(int endNumber) {
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
    private  void showArray(int[] numbers) {
        for (int k = 0; k < numbers.length; k++) {
            System.out.print(numbers[k] + " ");
        }
    }
}