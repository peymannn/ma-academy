package Fibonacci;
public class LoopFibonacci {

    public int calculatorFibonacci(int number) {
        int[] numbers = new int[number+1];
        numbers[0] = 0;
        numbers[1] = 1;
        for (int i = 2; i < number+1; i++) {
            numbers[i] = numbers[i-1] + numbers[i-2];
        }
        return numbers[number];
    }

}