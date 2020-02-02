package com.company;

public class Logical {

    public static int ready_num(int num) {
        String str = Integer.toString(num);
        int arr[] = new int[str.length()];
        char charnum[] = str.toCharArray();
        int sum_num = 0;

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int)charnum[i] - 48;
            sum_num+=1;
        }

        return sum_num;
    }

    public static int summa_chet(int num) {
        String str = Integer.toString(num);
        int arr[] = new int[str.length()];
        char charnum[] = str.toCharArray();
        int sum = 0;

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int)charnum[i] - 48;
            if(arr[i]%2==0) {
                sum+=arr[i];
            }


        }

        return sum;
    }

    public static int proverka(int num){
        String str = Integer.toString(num);
        int arr[] = new int[str.length()];
        char charnum[] = str.toCharArray();
        String str_1 = "";

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int)charnum[i] - 48;
        }
        int num_kon = 0;


        for (int i = 0; i <arr.length ; i++) {
            str_1 += arr[i];

        }
        num_kon = new Integer(str_1);


        return num_kon;

    }

    public static void result(int n) {
        System.out.print("summ all of nums : ");
        int sum = 0;
        for (int i = 0; i <10000; i++) {
            if(n==ready_num(i)){
                if(i%2!=0){
                    if(i == proverka(i)){
                        sum+=i;
                    }
                }

            }
        }
        System.out.println(sum);
        int sum_1 = 0;
        sum_1 = summa_chet(sum);
        System.out.print("summ of chet nums : " + sum_1);


    }


}


