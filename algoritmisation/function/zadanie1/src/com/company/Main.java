package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("NOD");
        System.out.println(logik.Nod(a,b));
        System.out.println("Nok");
        System.out.println(logik.Nok(a,b,logik.Nod(a,b)));

    }
}
