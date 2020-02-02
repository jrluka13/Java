package com.company;

import java.util.Arrays;

public class Logic {

    public static String makeResult( char[] str){

        for (int i = 0; i <str.length ; i++) {
            if(Character.isUpperCase(str[i])){
                if(i!=0){
                    str = expandarr(str);
                    movenext(str,i);
                    str[i] = '_';
                    str[i+1] = Character.toLowerCase(str[i+1]);

                }else
                    str[i] = Character.toLowerCase(str[i]);
            }
        }

        return new String(str);

    }

    public static void movenext(char [] str,int k){
        for (int i = str.length-1; i !=k-1 ; i--) {
            str[i] = str[i-1];
        }
    }



    public static char[] expandarr(char []str){
        str = Arrays.copyOf(str,str.length+1);
        return str;
    }

}
