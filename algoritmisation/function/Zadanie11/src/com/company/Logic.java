package com.company;

public class Logic {

    public static void max(int x,int y){

        String c = Integer.toString(x);
        String v = Integer.toString(y);
        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i <c.length() ; i++) {
            max1++;
        }
        for (int i = 0; i <v.length() ; i++) {
            max2++;
        }
        if(max1>max2)
            System.out.println("Number more in 1");
        else
            System.out.println("Number more in 2");



    }

}
