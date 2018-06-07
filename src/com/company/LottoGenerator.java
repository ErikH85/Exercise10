package com.company;

import java.util.Random;

public class LottoGenerator {

    //ev. lägga på en omslutande loop som pågår fram tills att man är säker på att det inte finns någon dublett
    // loopen behöver ev inte vara omslutande, men det kommer att behövas finnas en while-loop som körs fram tills att
    // vilkoret för inga dubletter är uppfyllt.

    public void generateNumbers(){
        Random rand = new Random();
        int[] numbers = new int[7];

        numbers[0] = rand.nextInt(35)+1;
        numbers[1] = rand.nextInt(35)+1;
        numbers[2] = rand.nextInt(35)+1;
        numbers[3] = rand.nextInt(35)+1;
        numbers[4] = rand.nextInt(35)+1;
        numbers[5] = rand.nextInt(35)+1;
        numbers[6] = rand.nextInt(35)+1;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]){
                    numbers[i] = rand.nextInt(35)+1;
                }
            }
        }

        System.out.println
                ("Lottorad: " + numbers[0] + " " + numbers[1] + " " + numbers[2] + " " +  numbers[3]
                        + " " + numbers[4] + " " + numbers[5] + " " + numbers[6]);
    }
}
