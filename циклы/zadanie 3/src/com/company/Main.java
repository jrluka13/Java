package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int arr[] = new int[a];
        int sum = 0;
        for (int i = 0; i<arr.length; ++i){
            sum+=Math.pow(i,2);

        }*/
       int sum =0;
        for (int i = 0; i <=100 ; i++) {
            sum += Math.pow(i,2);
        }
        System.out.println(sum);


    }
}
