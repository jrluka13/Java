package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int y = 15;
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum2_1=0;
        int sum2_2 = 0;
        int sum3_0 =0;
        int k = 0;

        int arr[][] = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt(10) % 100;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();


                     // SUMMA diogonli
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];


        }

        System.out.println(sum);



                    //rightDiogonal
        for (int i = 0; i < 15; i++) {


            if (sum == y) {
                break;
            }
            if (sum < y) {
                arr[0][0]++;
            }else
                arr[0][0]--;
            sum =0;
            for (int j = 0; j <arr.length ; j++) {

                sum += arr[j][j];

            }

        }
            //// leftDioganal

        for(int i = 0, j = arr [i].length - 1;
            i < arr.length && j >= 0; i++, j--) {
            sum1 += arr[i][j];

        }
        for (int i = 0; i < 15; i++) {


            if (sum1 == y) {
                break;
            }
            if (sum1 < y) {
                arr[2][0]++;
            }else
                arr[2][0]--;
            sum1 =0;
            for(int j = 0, l = arr [j].length - 1;
                j < arr.length && l >= 0; j++, l--) {

                sum1 += arr[j][l];

            }

        }
        //// stroki!!!!
        /// 0 строка
        for (int i = 0; i < 15; i++) {


            if (sum2 == y) {
                break;
            }
            if (sum2 < y) {
                arr[0][1]++;
            }else
                arr[0][1]--;

            for ( k = 0; k <1 ; k++) {
                 sum2=0;
                for (int j = 0; j <arr[k].length ; j++) {
                    sum2+=arr[k][j];


                }
            }

        }

        //1 stroka
        for (int i = 0; i < 15; i++) {


            if (sum2_1 == y) {
                break;
            }
            if (sum2_1 < y) {
                arr[1][1]++;
            }else
                arr[1][1]--;

            for ( k = 1; k <2 ; k++) {
                sum2_1=0;
                for (int j = 0; j <arr[k].length ; j++) {
                    sum2_1+=arr[k][j];


                }
            }

        }
        /// 2 stroka
        for (int i = 0; i < 15; i++) {


            if (sum2_2 == y) {
                break;
            }
            if (sum2_2 < y) {
                arr[2][1]++;
            }else
                arr[2][1]--;

            for ( k = 2; k <3 ; k++) {
                sum2_2=0;
                for (int j = 0; j <arr[k].length ; j++) {
                    sum2_2+=arr[k][j];


                }
            }

        }


        /// Stolbec
        //// stolbik 0
        for (int i = 0; i < 15; i++) {


            if (sum3_0 == y) {
                break;
            }
            if (sum3_0 < y) {
                arr[2][0]++;
            }else
                arr[2][0]--;

            for(int z=0; z<1; z++) {
                sum3_0 = 0;

                for (int s = 0; s < arr[z].length; s++) {
                    sum3_0 += arr[s][z];
                }

            }

        }




            System.out.println();
                        /// Vivod
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Summa right diogonali " + sum);
        System.out.println("Summa left diogonali " + sum1);
            /// stroki 0
        for (int i = 0; i <1 ; i++) {
            sum2=0;
            for (int j = 0; j <arr[i].length ; j++) {
                sum2+=arr[i][j];


            }
            System.out.println("Summa stroki " + (i+1)  + " "+ sum2) ;
        }
        /// stroki 1
        for (int i = 1; i <2 ; i++) {
            sum2_1=0;
            for (int j = 0; j <arr[i].length ; j++) {
                sum2_1+=arr[i][j];


            }
            System.out.println("Summa stroki " + (i+1)  + " "+ sum2_1) ;
        }
        /// stroka 2
        for (int i = 2; i <3 ; i++) {
            sum2_2=0;
            for (int j = 0; j <arr[i].length ; j++) {
                sum2_2+=arr[i][j];


            }
            System.out.println("Summa stroki " + (i+1)  + " "+ sum2_2) ;
        }
                /// stolbik 0
        for(int i=0; i<1; i++) {
            sum3_0 = 0;

            for (int s = 0; s < arr[i].length; s++) {
                sum3_0 += arr[s][i];
            }
            System.out.println("Сумма столбца " + (i+1) + " = " + sum3_0);
        }


    }

}



