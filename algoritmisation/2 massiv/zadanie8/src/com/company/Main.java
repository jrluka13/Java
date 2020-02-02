package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 stol ");
        int k = scanner.nextInt();
        System.out.println("2 stol ");
        int p = scanner.nextInt();

        int size = scanner.nextInt();
        if(size<=1)
            return;
        int arr[][] = new int[size][size];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = random.nextInt() % 100;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int swap = 0;

        for (int i = 0; i < arr.length; i++) {
                swap = arr[i][k];
                arr[i][k] = arr[i][p];
                arr[i][p] = swap;
        }




        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
