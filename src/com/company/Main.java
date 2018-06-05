package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArr =  {10,20,30,40,50};
        ArrayHelper ah = new ArrayHelper();
        System.out.println("största värde: " + ah.maxNumber(intArr));
        System.out.println("minsta värde: " + ah.minNumber(intArr));
        System.out.println("summan: " + ah.sum(intArr));

        LottoGenerator lg = new LottoGenerator();
        lg.generateNumbers();

        int[] unSorted = {5,1,4,2,8,16,2,7,6};
        BubbleSort bs = new BubbleSort();
        bs.sortArray(unSorted);
        for (int i: unSorted) {
            System.out.println(i);
        }

    }

}
