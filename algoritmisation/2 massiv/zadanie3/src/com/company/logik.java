package com.company;

import java.util.Scanner;

public class logik {



    public static String strok(int[][] arr , int k) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {

            builder.append(  arr[k-1][i] + " ");



        }

        return builder.toString();
    }

    public static String stol(int[][] arr , int p) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {

            builder.append( arr[i][p-1] + " ");



        }

        return builder.toString();
    }

}
