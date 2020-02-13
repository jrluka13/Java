package Inputer;

import java.util.Scanner;

public class Inputer {

    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }

    public static String inputLine(){
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        return line;
    }

}
