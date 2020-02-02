package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Logic {

    public static void makeResult(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Diapazon : ");
        int k = scanner.nextInt();

        for (int i = 1; i <k ; i++) {
            double num = sumOfNums(i);
            if(num == i){
                System.out.println(i);
            }
        }

    }

    private static double sumOfNums(int x){
        int sum=0;
        char [] arr = Integer.toString(x).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            sum+= Math.pow((int)arr[i] - 48,arr.length);
        }
        return sum;
    }







}
