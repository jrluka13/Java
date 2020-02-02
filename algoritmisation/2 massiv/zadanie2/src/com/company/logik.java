package com.company;

public class logik {

    public static String result(int[][] matrix ){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {


            builder.append("Element: "+matrix[i][i]+"\n");


        }
        return builder.toString();
    }


}
