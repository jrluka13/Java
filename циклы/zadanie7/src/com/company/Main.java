package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for(int i = n ; i <= m;i++){
            for(int j = n; j <= m;j++ ){
                if(i%j == 0) {
                    if (i / j ==1 ) {
                        break;
                    }
                    System.out.println("i: " + i + " делители: " + j);
                }else
                    continue;
            }
        }


    }
}
