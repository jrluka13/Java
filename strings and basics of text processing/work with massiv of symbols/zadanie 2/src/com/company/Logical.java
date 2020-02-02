package com.company;

import java.util.Arrays;

public class Logical {

    public static String makeResult(char[] str) {
        for (int i = 0; i < str.length-2; i++) {
            if (str[i] == 'w' && str[i + 1] == 'o' && str[i + 2] == 'r' && str[i + 3] == 'd') {
                str = expandStr(str);
                moveNext(str, i);
                str[i] = 'l';
                str[i + 1] = 'e';
                str[i + 2] = 't';
                str[i + 3] = 't';
                str[i + 4] = 'e';
                str[i + 5] = 'r';
            }
        }

        return new String(str);
    }

    public static void moveNext(char[] str, int k) {
        for (int i = str.length-1 ; i != k - 1; i--) {
            str[i] = str[i - 2];
        }
    }

    public static char[] expandStr(char[] str) {
        str = Arrays.copyOf(str, str.length + 2);
        return str;
    }

}
