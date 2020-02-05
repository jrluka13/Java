package Outer;

public class Outer {

    public static void Show(String msg) {
        System.out.print(msg);
    }

    public static void Show(Object[] objs) {
        for (Object obj : objs) {
            Show(obj.toString());
        }
    }
}
