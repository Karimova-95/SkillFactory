package Modul_14;

import java.util.function.UnaryOperator;

public class AdditionalTask {
    public static void main(String[] args) {
        System.out.println(factorial.apply(5));
    }
    static UnaryOperator<Integer> factorial = n -> {
        int m = 1;
        for (int i = 1; i <= n ; i++) {
            m *= i;
        }
        return m;
    };
}
