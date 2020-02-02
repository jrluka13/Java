package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        int arr[][] = new int[10][20];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                arr[i][j] = random.nextInt(15) % 100;
            }
        }


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sum5 = 0;
        for (int i = 0; i < 10; i++) {
            sum5 = 0;
            for (int j = 0; j < 20; j++) {
                if (arr[i][j] == 5) {
                    sum5++;
                    if (sum5 >= 3) {
                        System.out.println(" Stroka " + i);

                        break;
                    }
                }



            }

        }

    }
}
