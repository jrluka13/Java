package com.company;

public class Logic {

    public static StringBuilder makeResult(StringBuilder str){

        for (int i = 0; i <str.length() ; i++) {
            str.insert(i+1,str.charAt(i));
            i++;
        }
        return str;
    }

}
