package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        int m = scanner.nextInt();
        int n = scanner.nextInt();


        int arr[][] = new int [m][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt() %100;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int k = scanner.nextInt();
        int p = scanner.nextInt();
        System.out.print(logik.strok(arr,k));
        System.out.println();
        System.out.print(logik.stol(arr,p));

    }
}
