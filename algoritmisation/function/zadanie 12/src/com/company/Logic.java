package com.company;


import java.util.Arrays;
public class Logic {

    public static int[] makeResult(int k, int n) {

        int[] result = new int[0];
        for (int i = 0; i <= n; i++) {

            int num = makeSumOfNums(i);
            if (num == k) {
                result = addToTheArr(result,i);
            }

        }
        return result;

    }

    private static int makeSumOfNums(int num) {
        int sum = 0;
        char[] charnum = Integer.toString(num).toCharArray();
        for (int i = 0; i < charnum.length; i++) {
            sum += (int) charnum[i] - 48 ;

        }
        return sum;
    }
    private static int[] addToTheArr(int[] result, int value) {
        result = Arrays.copyOf(result, result.length + 1);
        result[result.length - 1] = value;
        return result;
    }

    public static void Show(int[] arr) {

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

    }


}
