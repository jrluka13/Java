package com.company;

public class Test1 {

    private int a ;
    private int b ;

    public Test1(int a,int b ){
        this.a = a;
        this.b = b;
    }


    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }

    void print(){
        System.out.println("a= " + a + " b= " + b);
    }

    void setA(int a){
        this.a = a;
    }
    void setB(int b){
        this.b = b;
    }

    public int summ(){
        return a+b;
    }

    public int max(){
        if(a>b){
            return a;
        }else
            return b;
    }


}
