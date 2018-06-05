package com.company;

import java.util.Arrays;

public class ArrayHelper {

    public int maxNumber(int[] a){
        int max = Arrays.stream(a).max().getAsInt();
        return max;
    }
}
