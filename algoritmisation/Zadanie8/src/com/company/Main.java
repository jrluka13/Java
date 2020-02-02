package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import java.lang.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int arr[] = new int[n];
        int result[] = new int[arr.length - 1];
        int index = 1;
        int min = 0;
        ;
        for( int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
            System.out.print(arr[i] + " ");
        }


        for ( int i=0;i<arr.length;i++){
            if(arr[min]>arr[i]){
                min = i;

            }
                }

        System.arraycopy(arr,0,result,0, n-1);
        System.arraycopy(arr,min,result,min,arr.length - min - 1);

        System.out.println();
        //for (int i = 0;i<arr.length;i++){
        System.out.print(Arrays.toString(result) + " ");
        //}

    }
}
