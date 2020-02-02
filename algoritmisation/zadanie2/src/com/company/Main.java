package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N:");
        int n = scanner.nextInt();
        System.out.println("N]Z:");
        int z = scanner.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n ; i++) {
            arr[i]=i;
        }

        for(int i = 0; i < n; i++) {
            if (arr[i] > z) {
                arr[i] = z;


            }

            System.out.println(arr[i]);
        }


    }
}
