package com.community;

import java.util.Scanner;

public class firstjava {
    public static void main(String[] args) {
//        System.out.println("Please enter");
//        Scanner in= new Scanner(System.in);

        //Even or Odd
        //        double num=in.nextDouble();
//
//        if(num%2==0){
//            System.out.println("Even");
//        }
//        else{
//            System.out.println("Odd");
//        }
//name
//        String name=in.nextLine();
//        System.out.println("Hello "+name+" Welcome to my world");

// Simple Interest
        Scanner in=new Scanner(System.in);
        System.out.println("please enter principal");
        double P=in.nextDouble();
        System.out.println("please enter rate");
        double R=in.nextDouble();
        System.out.println("please enter time");
        double T=in.nextDouble();
        double si=(P*R*T)/100;
        System.out.println(si);


    }
}
