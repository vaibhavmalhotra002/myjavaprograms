package com.vaibhav;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr=new int[5];
//        arr[0]=23;
//        arr[1]=2;
//        arr[2]=3;
//        arr[3]=33;
//        arr[4]=53;
//        System.out.println(arr[2]);
//
//        //input using for loop
//        for(int i=0; i< arr.length;i++){
//            arr[i]=in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));
//        for(int i=0; i< arr.length;i++){
//            System.out.println(arr[i] + " ");
//        }
//        for (int num :arr) {//for every element in the array print the element
//            System.out.println(num + " ");//here num represents element of array
//        }
          //array of objects
        String str[]=new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1]="vaibhav";
        System.out.println(Arrays.toString(str));

    }
}
