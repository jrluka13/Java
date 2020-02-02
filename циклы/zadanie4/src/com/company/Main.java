package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int e = scanner.nextInt();
        double a;
        double sum =0;
        for (int n = 0; n<100 ; n++){
            a = 1-Math.pow(2,n) + Math.pow(3,n);
            if (Math.abs(a) >= e){
                sum+= a;
                System.out.println(sum);
            }
        }




    }
}
