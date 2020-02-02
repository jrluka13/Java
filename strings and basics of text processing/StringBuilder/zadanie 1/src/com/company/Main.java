package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str_1 = scanner.nextLine();
        StringBuilder str = new StringBuilder(str_1);

        System.out.print(Logic.makeResult(str));

    }
}
