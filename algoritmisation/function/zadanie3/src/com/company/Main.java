package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        logik bob = new logik();
        System.out.println( bob.shest(bob.Str(a),bob.Kvad(a)));


    }
}
