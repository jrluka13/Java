package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder strt= new StringBuilder(str);

        System.out.print(Logic.makeResult(strt));
    }
}
