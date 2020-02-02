package com.company;

public class Logic {

    public static StringBuilder makeResult(String str){
        str = str.trim();
        str = str.replaceAll(" +","");
        StringBuilder str1 = new StringBuilder(str);

        for (int i = 0; i <str1.length()-1 ; i++) {
            for (int j = i+1; j <str1.length()-1 ; j++) {
                if(str1.charAt(i) == str1.charAt(j)){
                    str1.delete(j,j+1);
                }
            }
//
        }


        return str1;
    }

}
