package com.company;

import java.util.Arrays;

public class ArrayHelper {

    public int maxNumber(int[] a){
        int max = Arrays.stream(a).max().getAsInt();
        return max;
    }

    public int minNumber(int[] a){
        int min = Arrays.stream(a).min().getAsInt();
        return min;
    }

    public int sum(int[] a){
        int sum = 0;
        for (int s: a) {
            sum = sum + s;
        }

        return sum;
    }
}
