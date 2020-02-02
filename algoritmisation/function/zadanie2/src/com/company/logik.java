package com.company;

public class logik {

    public static int Nod(int a,int b,int c , int d){

        while (b!=0){
            int t = a%b;
            a=b;
            b= t;
        }

        while(c!=0){
            int y=d%c;
            d=c;
            c = y;
        }

        while (d!=0){
            int u = a%d;
            a=d;
            d=u;

        }
        return a;
    }


}
