package com.company;

public class BubbleSort {

    public int[] sortArray(int[] numbers){

        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 1; j < numbers.length  ; j++) {
                if(numbers[i] < numbers[j-1]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j-1];
                    numbers[j-1] = temp;
                }
            }
        }

        return numbers;

    }
}
