package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

            int arr[] = new int [5];
        Random random = new Random ();

            for (int i=0;i<arr.length;i++){
                arr[i] = random.nextInt()% 100;
                System.out.print(arr[i] + " ");

            }
            System.out.println();
            for (int i=0;i<arr.length;i++){
                if(arr[i]>i){
                    System.out.print(arr[i]+ " ");
                }
            }
    }
}
