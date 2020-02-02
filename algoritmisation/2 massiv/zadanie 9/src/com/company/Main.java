package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int size = scanner.nextInt();
        int arr[][] = new int[size][size];
        int sum = 0;


        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                arr[i][j] = random.nextInt((32767+32768)) % 100;
            }
        }

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                sum+=arr[j][i];

            }
            System.out.println("Summa " + (i+1) + " " + sum);

        }
        System.out.print("Max : " + Math.max(sum,sum));




        
    }
}
