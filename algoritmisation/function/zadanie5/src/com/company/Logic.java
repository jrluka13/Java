package com.company;

public class Logic {




    static int[] remove(int[] a, int match){
        int i = 0;
        for(int j = 0; j < a.length; j++){
            if (a[j] != match)
                a[i++] = a[j];
        }
        while (i < a.length){
            a[i++] = 0;
        }
        return a;
    }

    static int max(int a[]){

        int max = 0;
        for (int j = 0; j <a.length ; j++) {
            if(a[j] > max){
                max = j;
            }
        }


        return max;
    }

}
