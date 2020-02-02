package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int summ = 0;
        int summ1 = 0;
        int summ2 = 0;

        for(int i = 0;i<arr.length;i++){
            arr[i]= scanner.nextInt();
        }

        for (int i = 0; i<arr.length;i++){
            if(arr[i]>0){
                System.out.println();
                summ+=1;



            }else if(arr[i]==0){
                System.out.println();
                summ1+=1;


            }else if(arr[i]<0){
                System.out.println();
                summ2+=1;



            }

        }
        System.out.print("Положительные :" + summ );
        System.out.print("Нулевые :" + summ1);
        System.out.print("Отрицателные :" + summ2);

    }
}

