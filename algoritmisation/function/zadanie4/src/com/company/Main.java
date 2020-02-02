package com.company;

import java.util.Scanner;

public class Main {
    public static void Show(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int [][] arr = new int [size][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        Show(logic.makeResult(arr));






    }
}
