package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int min1 = Math.min(a,b);
        int min2 = Math.min(c,d);


        System.out.println(Math.max(min1,min2));
    }
}
