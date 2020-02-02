package com.company;

public class Logic {

    public static StringBuilder makeResult(StringBuilder str){
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i) == 'a'){
                str.insert(i+1,'b');


            }
        }

        return str;
    }

}
