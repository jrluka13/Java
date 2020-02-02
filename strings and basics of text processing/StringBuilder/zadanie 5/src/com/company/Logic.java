package com.company;

public class Logic {

    public static int makeResult(StringBuilder str){
        int k = 0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i) == 'a'){
                k++;
            }
        }
        return k;
    }

}
