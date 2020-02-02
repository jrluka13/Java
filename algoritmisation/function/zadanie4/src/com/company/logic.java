package com.company;

import java.util.Scanner;

public class logic {

    public static String makeResult(int points[][]) {

        double maxDistance = 0;
        String result = "";
        for (int i = 0; i < points.length; i++) {

            for (int j = 1; j < points.length; j++) {

                double distance = findDistance(points[i][0], points[i][1],
                        points[j][0], points[j][1]);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    result = String.format(
                            "The longest distance between points %s and %s(%s)",
                            i + 1, j + 1, maxDistance);
                }
            }
        }
        return result;

    }

    private static double findDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

}
