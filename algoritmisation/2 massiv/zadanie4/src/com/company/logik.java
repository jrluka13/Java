package com.company;

public class logik {

    private static void formMatrix(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = j + 1;
            }

        }
    }

    public static int makeResult(int[][] arr) {

        formMatrix(arr);
        for (int i = 0; i < arr.length; i++) {

            if ((i + 1) % 2 == 0) {
                int sch = arr[0][arr[0].length - 1];
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = sch;
                    sch--;
                }
            }

        }
        return ;
    }


}

