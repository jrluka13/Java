package com.company;

public class Logic {

    public static String makeResult(String str) {
        String[] strArr = str.split("[,. :]");
        String result = " ";
        for (String i : strArr) {
            if (result.length() < i.length()){
                result = i;
            }
        }

        return result;
    }
}
