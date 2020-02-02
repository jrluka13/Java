package com.company;

public class logik {

    private double c ;
    private double kvad;
    private double square;




    public   double Str(double a)
    {
        double h = a/2;
        double c_0 = Math.sqrt(Math.pow(a,2) - Math.pow(h,2));
        c = c_0*2;
        square  =  0.5 * h * c;
return square;
    }

    public double  Kvad(double a){
        kvad = c*2 + a*2;
return kvad;
    }
    public double shest(double str,double kvad){
        double shesty = str * 2 + kvad ;
        return shesty;
    }





}
