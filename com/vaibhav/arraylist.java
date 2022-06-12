    package com.vaibhav;

import java.util.ArrayList;
import java.util.Scanner;

    public class arraylist {
    public static void main(String[] args) {
Scanner in=new Scanner(System.in);
      ArrayList<Integer> list=new ArrayList<>(5);
//        list.add(67);
//        list.add(6347);
//        list.add(687);
//        list.add(687);
//        list.add(7);
//        list.add(6);
//        System.out.println(list);
//
//        list.set(0,99);
//        list.remove(3);
//        System.out.println(list);
        //input
        for (int i = 0; i < 5; i++) {

            list.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {

            System.out.println(list.get(i));
        }
        System.out.println(list);
    }


}

