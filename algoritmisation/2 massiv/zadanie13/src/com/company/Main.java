package com.company;




public class Main {
    private static void swap(int[][] arr, int row1, int col1, int row2,
                             int col2) {
        int tmp = arr[row1][col1];
        arr[row1][col1] = arr[row2][col2];
        arr[row2][col2] = tmp;
    }

    public static void main(String[] args) {
        int arr[][] = new int[5][5];

        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                arr[i][j] = (int)(Math.random()*100);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();


            for (int i = 0; i < arr[0].length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    for (int k = 0; k < arr.length - 1; k++) {
                        if (arr[k][i] > arr[k + 1][i]) {
                            swap(arr, k, i, k + 1, i);
                        }

                    }

                }

            }

        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {

                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
    }
}
