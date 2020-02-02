package com.company;

public class Logic {

    public static boolean makeResult(StringBuilder str){
        StringBuilder strt = new StringBuilder(str);
        str = str.reverse();
        boolean t = false;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i) == strt.charAt(i)){
                t = true;
            }
        }


        return t;
    }

}
