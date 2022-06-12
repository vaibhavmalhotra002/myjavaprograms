package com.community;

import java.util.Scanner;

public class switchh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       String fruit=in.next();

        switch (fruit) {
            case "mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println("A red fruit");
            case "orange" -> System.out.println("a round fruit");
            default -> System.out.println("Invalid");
        }
//        int day=in.nextInt();
//
//        switch (day) {
//            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
//            case 6, 7 -> System.out.println("Weekend");
//
//        }


    }

}
