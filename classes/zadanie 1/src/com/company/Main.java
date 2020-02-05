package com.company;

public class Main {

    public static void main(String[] args) {
        Test1 test = new Test1(4,6);
        test.print();
        test.setA(10);
        test.setB(5);
        System.out.println(test.summ());
        System.out.println(test.max());
    }
}
