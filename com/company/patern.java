package com.company;
import java.util.*;

public class patern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*
        //inverted half pyramid
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop ->spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

         */
/*
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

 */
        /*
       //Floyd's Triangle
        int number=1;
        //outer loop
        for (int  i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;//number=number+1
            }
            System.out.println();

         */
        /*
        //0-1 traingle

        //outer loop
        for(int i=1;i<=n;i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                int sum = i+j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }

            System.out.println();
        }

         */
/*
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i +" ");
            }
            System.out.println();

 */
        /*
        //palindrome
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //first half numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //2nd half numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
//diamond pattern
         */
        //upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
