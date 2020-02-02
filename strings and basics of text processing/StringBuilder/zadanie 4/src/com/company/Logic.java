package com.company;

public class Logic {

    public static String makeResult(String inf) {

        inf = inf.substring(3, inf.length() - 3);
        inf = inf.substring(0, 2) + inf.substring(inf.length() - 1);
        inf = inf.charAt(inf.length() - 1) + inf;

        return inf;
    }

}
