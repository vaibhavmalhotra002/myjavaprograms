package com.company;

import java.io.*;

import static java.util.stream.Collectors.joining;


public class tabl3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        for(int i=1;i<=10;i++){
            int result=N*i;
            System.out.println(N+" "+"x"+" "+ i +" "+"="+" "+  result);
        }
    }
}
