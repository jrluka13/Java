package Outer;

public class Outer {

    public static void show(String msg){
        System.out.println(msg);
    }

    public static void show(Object[] objects){
        for (Object object: objects) {
            System.out.println(object.toString());
        }
    }

}
