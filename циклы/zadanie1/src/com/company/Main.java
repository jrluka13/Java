package com.company;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int a = scanner.nextInt();
	    int array [] = new int[a];
	    int sum = 0;
        if (a>=0){
            for (int i = 0; i<array.length;i++ ){
                sum+= i;
            }
            System.out.println(sum);
        }else
            System.out.println("Error");
    }
}
