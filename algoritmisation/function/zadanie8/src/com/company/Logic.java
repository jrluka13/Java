package com.company;

public class Logic {
    public static void sum(int[] arr) {
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int k = 1; k < arr.length; k++) {
            if (k == 1 || k == 2 || k == 3) {
                sum += k;

            }
            if (k == 3 || k == 4 || k == 5) {
                sum1 += k;

            }
            if (k == 4 || k == 5 || k == 6) {
                sum2 += k;

            }
        }
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);


    }
}
