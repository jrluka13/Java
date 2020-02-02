package com.company;

public class Logic {

    public static int makeResult(char[] str){
        int k =0;
        for (int i = 0; i <str.length ; i++) {
            if (Character.isDigit(str[i])){
                int j = i;
                for (; Character.isDigit(str[j]) && j <str.length-1 ; j++) {

                }
                i =j;
                k++;
            }
        }

        return k;
    }

}
