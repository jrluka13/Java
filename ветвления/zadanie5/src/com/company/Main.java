package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double F;

        if ( x <=3){

            F = Math.pow(x,2) - 3* x  + 9;
            System.out.println(F);

        }else if (x>3){
            F = 1/(Math.pow(x,3)+ 6);
            System.out.println(F);
        }
    }
}
