package com.company;

public class Logic {

    public static void proverka (int a , int b, int c){

        while (b!=0){

            int t = a%b;
            a=b;
            b=t;
        }
        while(c!=0){
            int t = a%c;
            a=c;
            c=t;
        }

        if(a==-1 || a == 1){
            System.out.println("Взаимно простые");
        }
        else
            System.out.println("Не взаимно простые");
    }

}
