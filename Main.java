package com.company;

public class Main {

        public static void main(String[] args) {
            String result = "";
            int numbers[] = {205, 55, 12, 11, 1, 23, 16};
            sorting(numbers);

            for (int k = 0; k < numbers.length; k++) {
                result = result + numbers[k] + "\n";
            }
            System.out.println(result);

        }

        public static void sorting(int[] numbers) {

            int smallest,i,j;
            for (i = 0; i < numbers.length; i++) {

                for (j = i+1; j < numbers.length-1; j++) {
                    smallest = numbers[i];
                    if (smallest > numbers[j+1]) {
                        numbers[i] = numbers[j+1 ];
                        numbers[j+1]=smallest;
                    }
                }
            }


        }
    }

