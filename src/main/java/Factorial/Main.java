package Factorial;

public class Main {
    public static void main(String[] args) {
        int number = 4;
        LoopFactorial loopObj= new LoopFactorial();
        RecursiveFactorial recursiveObj = new RecursiveFactorial();

        System.out.println(recursiveObj.recursiveFactorial(number));

        System.out.println(loopObj.findFactorial(number));
    }


}
