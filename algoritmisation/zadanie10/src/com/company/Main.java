package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i = 1;i<arr.length;i++){
            arr[i] = scanner.nextInt();

        }

        for (int i = 1;i<arr.length;i++){
            if ( i % 2 == 0) {
                arr[i] = 0;
            }
        }
        for(int i =1;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
