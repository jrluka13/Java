package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 180-(a+b);
        if (a+b<180 & c==90){
            System.out.println(" Треугольник прямоугольный");
        }else if(a+b<180){
            System.out.println("Треуголиник существует и он не прямоугольный");
        }else
            System.out.println("Треугольника не существует");

    }
}
