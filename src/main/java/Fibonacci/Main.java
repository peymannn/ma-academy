package Fibonacci;

public class Main {
    public static void main(String[] args) {
        int endNumber = 17;
        LoopFibonacci loopObj = new LoopFibonacci();
        RecursiveFibonacci recursiveObj = new RecursiveFibonacci();

        System.out.println("\n" + recursiveObj.recurciveFibonacci(endNumber) + " ");//
        System.out.println( loopObj.calculatorFibonacci(endNumber));
    }

    private static void showArray(int[] numbers) {
        for (int k = 0; k < numbers.length; k++) {
            System.out.print(numbers[k] + " ");
        }
    }


}
