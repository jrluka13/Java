package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        String arr = String.valueOf(a);
        String brr = String.valueOf(b);
        for (String retval : arr.split("")){
            System.out.println("Цифры первого числа :" + retval);
        }
        for (String retval : brr.split("")){
            System.out.println("Цифры второго числа :" + retval);
        }
    }

}
