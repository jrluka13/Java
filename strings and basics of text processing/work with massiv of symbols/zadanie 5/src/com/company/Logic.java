package com.company;

public class Logic {

    public static String makeResult(String str){

        str = str.trim();
        str = str.replaceAll(" +"," ");

        return str;
    }

}
