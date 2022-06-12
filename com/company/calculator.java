package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Choose operation:\n 1:Addition \n 2:Subtraction \n 3:Multiplication \n 4:Division \n 5:Modulo");
        int opera = sc.nextInt();

        switch (opera) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if (b==0){
                    System.out.println("Invalid Division");
                }
                else {
                    System.out.println(a / b);
                }
                break;
            case 5:
                if (b==0){
                    System.out.println("Invalid Division");
                }
                else {
                System.out.println(a % b);}
                break;
            default:
                System.out.println("Invalid input");
                break;

        }
    }
}
