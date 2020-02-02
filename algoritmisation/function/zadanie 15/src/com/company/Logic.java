package com.company;

import java.util.Random;

public class Logic {

    public static int ready_num(int num) {
        String str = Integer.toString(num);
        int arr[] = new int[str.length()];
        char charnum[] = str.toCharArray();
        int sum_num = 0;

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int)charnum[i] - 48;
            sum_num+=1;
        }

        return sum_num;
    }

    public static int proverka(int num){
        String str = Integer.toString(num);
        int arr[] = new int[str.length()];
        char charnum[] = str.toCharArray();
        String str_1 = "";

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int)charnum[i] - 48;
        }
        int num_kon = 0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }


            }
        }


        for (int i = 0; i <arr.length ; i++) {
                str_1 += arr[i];

        }

        num_kon = new Integer(str_1);

        return num_kon;

    }


    public static void result(int n) {
        System.out.print("chisla: ");
        for (int i = 0; i <999999999; i++) {
            if(n==ready_num(i)){
                if(i == proverka(i)){
                    System.out.print(i+ " ");
                }

            }
        }

    }

}
