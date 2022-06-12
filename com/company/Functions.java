package com.company;


import java.util.Scanner;

public class Functions {
    //name
    /*
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();

        printMyName(name);//call kiya function ko

     */
    /*public static int calculateSum(int a,int b){
        int sum=a+b;
        return sum;
    }

     */
    public static int calculateProduct(int a,int b){
        int product=a*b;
        return product;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int product = calculateProduct(a,b);
        System.out.println(product);
    }
}
