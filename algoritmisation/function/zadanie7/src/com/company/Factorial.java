package com.company;

public class Factorial {

    public int  fact(int n )
    {

        int result = 1;
        for (int i = 1; i <=n ; i++) {
            if(i%2!=0)
                result *= i;
        }
        return result;
    }


}
