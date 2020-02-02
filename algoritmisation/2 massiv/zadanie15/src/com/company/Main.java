package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int arr[][] = new int[5][5];
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                arr[i][j] = (int)(Math.random() * 100);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        int max = 0;
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                if(max<arr[i][j])
                    max = arr[i][j];

            }
        }

        System.out.println(max);
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j < 5; j++) {
                if(arr[i][j] % 2 !=0){
                    arr[i][j] = max;
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();

        }    }
}
