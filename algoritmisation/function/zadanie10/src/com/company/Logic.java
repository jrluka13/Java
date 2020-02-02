package com.company;

public class Logic {

    public static void mass(int x){

        String c ;
        c = Integer.toString(x);
        char[] arr = c.toCharArray();
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);
        }

    }

}
