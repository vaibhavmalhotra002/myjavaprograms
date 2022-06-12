package com.vaibhav;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        {
             a=78;
        }
    }

    static void random(int marks){
        int num=90;
        System.out.println(num);
        System.out.println(marks);

    }
}
