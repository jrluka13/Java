package com.company;

public class Logic {

    public static void makeResult(int a){

        int arr[] = new int[a];
        for (int i = a/2; i < arr.length; i++) {
            int b = i;
            arr[i] = i;
            while (i!=b+2)
            {

                i++;
                i++;


            }
            i--;

        }

        for (int i = a/2; i < arr.length; i++) {
            if(arr[i]==0)
                continue;
            if(arr[i] == a )
                break;
            if(arr[i]!=0) {

                System.out.println(arr[i] + " " + arr[i + 2]);
            }
        }

    }


}
