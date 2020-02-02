package com.company;

public class Logic {

    public static int makeResult(String str) {
        int num =0;

        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i) == '.' || str.charAt(i) == '!' || str.charAt(i) == '?'){
                num++;
            }
        }


        return num;
    }

}
