package com.company;

public class Logic {

    public static void makeResult(String str) {

        int numL = 0;
        int numl = 0;

        for (int i = 0; i <str.length() ; i++) {
            if(Character.isLowerCase(str.charAt(i))){
                numl++;
            }if(Character.isUpperCase(str.charAt(i))){
                numL++;
            }
        }

        System.out.println("Upper: " + numL);
        System.out.println("Lower: " + numl);



    }

}
