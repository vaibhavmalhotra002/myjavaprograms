package com.community;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter temperature in celsius: ");
        float tempC= in.nextFloat();
        float tempF=(tempC * 9/5) + 32;
        System.out.println("Temperature in Farenhiet is:" + tempF);
    }
}
