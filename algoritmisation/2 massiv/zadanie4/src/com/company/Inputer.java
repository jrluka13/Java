package com.company;

import java.util.Scanner;

public class Inputer {
    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }
    public static void inputArr(int [][] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                arr[i][j] = Inputer.inputInt();
            }

        }
    }
}
