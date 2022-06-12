package com.vaibhav;

public class swap {
    public static void main(String[] args) {
        int a=10;
        int b= 45;

        //swap numbers code
//        int temp = a;
//        a=b;
//        b=temp;
swap(a,b);


    }

    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a +" " + b);
    }

}
