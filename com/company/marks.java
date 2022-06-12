package com.company;

import java.util.Scanner;

public class marks {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
                int input;
        System.out.println("Enter marks scored(out of 100)");
        do {
            int marks = sc.nextInt();
            if (marks >= 90) {
                System.out.println("This is good");
            } else if (marks >= 60 && marks <= 89) {
                System.out.println("This is also good");
            } else if (marks >= 0 && marks <= 59) {
                System.out.println("This is good as well");
            } else {
                System.out.println("invalid input!!");
            }
            System.out.println("Want to continue? (if yes press 1 and if no press 0");
            input = sc.nextInt();
        }
        while(input==1);
        }

    }


