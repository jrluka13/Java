package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int arr[] = new int [n];

        for(int i =0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }



        int count2 = 0;
        int count1 = 0;
        int pupular1 =0;
        int popular2 =0;


        for (int i = 0; i < arr.length; i++)            // 5 5 13 13
        {
            pupular1 = arr[i];
            count1 = 1;

            for (int j = i + 1; j < arr.length; j++)
            {
                if (pupular1 == arr[j]) count1++;
            }

            if (count1 > count2)
            {
                popular2 = pupular1;
                count2 = count1;
            }

            else if (count1 == count2)
            {
                popular2 = Math.min(popular2, pupular1);
            }
        }

        System.out.print(popular2);

    }
}
