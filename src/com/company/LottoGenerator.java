package com.company;

import java.util.Random;

public class LottoGenerator {

    public void generateNumbers(){
        Random rand = new Random();
        int[] numbers = new int[8];
        numbers[1] = rand.nextInt(35)+1;
        numbers[2] = rand.nextInt(35)+1;
        numbers[3] = rand.nextInt(35)+1;
        numbers[4] = rand.nextInt(35)+1;
        numbers[5] = rand.nextInt(35)+1;
        numbers[6] = rand.nextInt(35)+1;
        numbers[7] = rand.nextInt(35)+1;

        for (int i = 0; i < numbers.length ; i++) {

            for (int j = 0; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]){
                    numbers[i] = rand.nextInt(35)+1;
                }
            }
        }

        System.out.println
                ("Lottorad: " + numbers[1] + " " + numbers[2] + " " + numbers[3] + " " +  numbers[4]
                        + " " + numbers[5] + " " + numbers[6] + " " + numbers[7]);
    }
}
