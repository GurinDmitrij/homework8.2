package com.company;

import java.util.Arrays;

public class ArrayPointInCircle {
    int[] pointInCircle;

    public ArrayPointInCircle(int[] pointInCircle) {
        this.pointInCircle = pointInCircle;
    }

    public int[] getPointInCircle() {
        return pointInCircle;
    }



    @Override
    public String toString() {
        return "" + Arrays.toString(pointInCircle) ;
    }
}
