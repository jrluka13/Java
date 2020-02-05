package Outer;

public class Outer {

    public static void Show(String msg){
        System.out.println(msg);
    }

    public static void Show(Object[] objects){
        for(Object object : objects){
            Show(object.toString());
        }
    }

}
