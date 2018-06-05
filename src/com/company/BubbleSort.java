package com.company;

public class BubbleSort {

    public int[] sortArray(int[] numbers){

        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 1; j < numbers.length ; j++) {
                if(numbers[i] < numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        return numbers;

    }
}
