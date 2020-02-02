package com.company;

public class Logic {

    public static int ready_num(int num) {
        String str = Integer.toString(num);
        int arr[] = new int[str.length()];
        char charnum[] = str.toCharArray();
        int sum_num = 0;

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int)charnum[i] - 48;
            sum_num+=arr[i];
        }

        return sum_num;
    }


//

    public static void result(int n) {

        int k = 0;
        while (n!=0){
                n=n-ready_num(n);
                k++;
            System.out.println(n);
            }


        System.out.print("Popitok " + k);
    }

}
