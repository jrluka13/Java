package com.company;

import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        double arr[] = new double[n];
        double summ = 0;
        System.out.print("masiv : ");
        for (int i = 0; i<arr.length;i++){
            arr[i] = random.nextDouble();
            System.out.print(arr[i] + " ");
        }
        for (int i = 2; i<arr.length; i++){
            if(i%i==0 & i%1==0 ){
                summ += arr[i];

            }
        }
        System.out.println();
        System.out.print("Summa : ");
        System.out.print(summ);
    }
}
