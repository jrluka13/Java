package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк ");
        int m = scanner.nextInt();
        System.out.println("Введите кол-во стобцов ");
        int n = scanner.nextInt();
        int matrixa[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrixa[i][j] = random.nextInt() % 100;
            }

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrixa[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------");
        for (int i = 0; i < matrixa[0].length; i++) {
                if ((i+1) % 2 != 0 ){
                    if (matrixa[0][i] > matrixa[matrixa[0].length - 1][i]) {
                        System.out.print(matrixa[i] + "\t");
                    }
                }

            }
            System.out.println();
        }
    }

