package com.company;

import java.util.Random;


public class Main {

    public static void main(String[] args) {


        int arr[]= new int[5];
        int min=  0;
        int max = 0;
        int swap;
        Random random = new Random();


        for (int i = 0; i < arr.length;i++){
            arr[i] = random.nextInt() % 100;
            System.out.print(arr[i] + " ");

            if(arr[min] > arr[i]){
                min = i;


            }
            if (arr[i]>arr[max]){
                max = i;

            }
        }

        swap= arr[min];
        arr[min] = arr[max];
        arr[max] = swap;
        System.out.println();
        for (int i = 0; i<arr.length;i++)
            System.out.print(arr[i] + " ");

    }
}
