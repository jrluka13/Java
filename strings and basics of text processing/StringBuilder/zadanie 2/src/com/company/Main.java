package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder str_1 = new StringBuilder(str);

        System.out.print(Logic.makeResult(str_1));
    }
}
