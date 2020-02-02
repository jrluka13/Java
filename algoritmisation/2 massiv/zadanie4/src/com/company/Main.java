package com.company;

public class Main {

    public static void main(String[] args) {
        int s = Inputer.inputInt();
        if (s <= 1 & s % 2 != 0 ) {
            System.out.println("Error");
            return;
        }

        int arr[][] = new int[s][s];

        System.out.print(logik.makeResult(arr));


    }
}
