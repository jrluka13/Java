package com.company;

public class Logic {

    public static int makeResult(char[] str){
        int k =0;
        for (int i = 0; i <str.length ; i++) {
            if (Character.isDigit(str[i])){
                k++;
            }
        }

        return k;
    }

}
