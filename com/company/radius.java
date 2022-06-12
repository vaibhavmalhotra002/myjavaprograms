package com.company;
import java.util.*;


public class radius {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of Circle:");
        float r=sc.nextFloat();
        double area=3.14*r*r;
        System.out.println("Area of circle is:");
        System.out.println(area);
    }
}
