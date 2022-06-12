package com.vaibhav;

import java.util.Scanner;

public class main {
    //take input of 2 numbers and print the sum
    public static void main(String[] args) {

        Scanner in =new Scanner (System.in);
        System.out.println("Enter first number:");
        int num1=in.nextInt();
        System.out.println("Enter second number:");
        int num2=in.nextInt();
        int sum=num1+num2;
        System.out.println("The SUm is: "+sum);



    }
}
