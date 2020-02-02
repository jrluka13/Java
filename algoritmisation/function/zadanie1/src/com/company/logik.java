package com.company;

public class logik {

    public static int Nod(int a,int b){

        while (b!=0 ){
            int t = a%b;
            a=b;
            b=t;
        }

        return a;
    }

    public static int Nok(int a,int b,int nod){
        return a*b/nod;
    }




}
