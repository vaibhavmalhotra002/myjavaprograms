package com.vaibhav;

import java.util.Arrays;
import java.util.Scanner;

public class multidimension {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //int[][] arr=new int[3][];

//        int [][] arr= {
//                {1, 2, 3},//0th index
//                {4, 5},
//                {6, 7, 8, 9}
//        };
        int[][] arr = new int[3][3];
        //input
        for (int row = 0; row < arr.length; row++) {
            //for ech column in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();


            }

        }

        //output
//        for (int row = 0; row < arr.length; row++) {
//            //for ech column in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]);
//            }
//            System.out.println();
//        }

        //output
//        for (int row = 0; row< arr.length ; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//
//        }
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}

