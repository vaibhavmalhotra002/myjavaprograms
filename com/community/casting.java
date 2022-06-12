package com.community;

import java.util.Scanner;

public class casting {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        //type casting
        int num=(int)(66.75f);
        System.out.println(num);

        //AUTOMATIC type promotion in expressions
//        int a=257;
//        byte b=(byte)(a);
//        System.out.println(b); //257 % 256 = 1

        int count= 1;
        while(count != 5) {
            System.out.println(count);
            count++;
        }
    }
}
