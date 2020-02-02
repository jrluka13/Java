package com.company;

public class Logic {

    public static double  mathem(int x,int y , int z , int t){
        double s1;
        s1 = 0.5 * x *y;
        double c = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        double s2;
        double p = (z + c + t)/2;
        s2 = Math.sqrt(p*(p-z)*(p-c)*(p-t));
        double s = s1+s2;
        return s;
     }

}
