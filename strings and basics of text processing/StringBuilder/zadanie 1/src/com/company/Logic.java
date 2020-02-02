package com.company;

public class Logic {

    public static int makeResult(StringBuilder str){
        int max = 0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i) == ' '){
                int k = 0;
                int j =i;
                for (; j <str.length() && str.charAt(j) == ' ' ; j++) {
                    k++;
                }
                if (max<k){
                    max = k;
                }
                i = j;
            }
        }

        return max;
    }

}
