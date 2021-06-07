package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /**
     * Resize array
     * @param arr source array
     * @param size size od new array
     * @return resized array
     */
    public static int[] resizeArray(int[] arr,int size){
        int pointInCircle[] =new int[size];
        for (int i = 0; i < Math.min(arr.length,size); i++) {
            pointInCircle[i] = arr[i];
        }
        return pointInCircle;
    }

    /**
     * Filling array
     * @param arr source array
     * @param numberPoint new element in array
     * @return new array whith new element
     */
    public static int[] arrayFill(int arr[],int numberPoint){
    //int array[] = new int[arr.length+1];
    int pointInCircle[] = resizeArray(arr,arr.length+1);
        pointInCircle[arr.length] = numberPoint;

    return pointInCircle;
}
    public static void main(String[] args) {


ArrayPointInCircle arrayPointInCircle = new ArrayPointInCircle(new int [0] );
        final int POINT_COUNT = 2;
        Scanner sc = new Scanner(System.in);

	    FigureReader reader = new FigureReader(sc);
        Circle circle = reader.readCircle();


        for (int i = 0; i < POINT_COUNT; i++) {
            System.out.printf("Enter the %d point\n",i+1);
            Point p = reader.readPoint();
            if (circle.containsPoint(p)){


                arrayPointInCircle.pointInCircle= arrayFill(arrayPointInCircle.getPointInCircle(),i+1);

            }

        }
        System.out.println("Numbers point in a Circle is " + arrayPointInCircle);
        System.out.println();

    }
}
