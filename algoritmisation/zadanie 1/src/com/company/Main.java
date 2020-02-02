package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int a[] = new int [n];
        for(int i = 0; i <= a.length; i++){
            if (i%k==0){
                System.out.print(i + " ");
            }else continue;
        }
    }
}
