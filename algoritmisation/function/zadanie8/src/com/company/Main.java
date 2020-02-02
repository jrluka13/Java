package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m =7;
        int arr[] = new int[m];
        for (int k = 1; k <m ; k++) {
            arr[k] = k;
            System.out.print(arr[k]);
        }
        System.out.println();
        Logic.sum(arr);

    }
}
