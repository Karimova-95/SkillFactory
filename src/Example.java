import java.util.*;

public class Example {
    public static int change(int obj) {
        obj += 15;
        return obj;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println();

        b = Example.change(a);
        System.out.println();
        System.out.println();
        System.out.println(a + " " + b);
    }
}
