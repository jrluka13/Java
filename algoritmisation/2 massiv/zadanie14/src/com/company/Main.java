package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = random.nextInt(2) % 100;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        int stol;
        int lol;
        for (int i = 0; i < n; i++) {
            lol = 0;
            stol = i;
            for (int j = 0; j < m; j++) {
                //do{
                    if (arr[j][i] == 1) {
                        lol++;
                    }
                //}while ();

                if (lol > stol) {
                    do {
                        arr[j][i] = 0;
                        lol--;
                    }while (lol == stol);

                }
                if (lol < stol) {
                    do {
                        arr[j][i] = 1;
                        lol++;
                    }while (lol==stol);

                }

            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
