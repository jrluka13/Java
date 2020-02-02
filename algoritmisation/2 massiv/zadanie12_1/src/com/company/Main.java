package com.company;

import java.util.Random;
import java.util.*;


public class Main {
    /*private static void swap(int[][] arr, int row1, int col1, int row2,
                             int col2) {
        int tmp = arr[row1][col1];
        arr[row1][col1] = arr[row2][col2];
        arr[row2][col2] = tmp;
    }
*/
    public static void main(String[] args) {

        int[][] matrixSort = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrixSort[i][j] = (int)(Math.random() * 100);
                System.out.print(matrixSort[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        int j = 0;
        int[] stringSort = new int[5];
        for (int i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                stringSort[j] =  matrixSort[i][j];
            }
            Arrays.sort(stringSort);
            for (int k = 0; k < 5; k++) {
                matrixSort[i][k] = stringSort[k];
                System.out.print(matrixSort[i][k] + "\t");
            }
            System.out.println();
        }


    }

}

