package Modul_14;

import java.util.function.Consumer;
import java.util.function.Function;

public class Task14_2_9 {
    public static void main(String[] args) {
        Function<Integer, Double> intToDob = n -> n.doubleValue();
        Consumer<Integer> intToDob3 = n -> n.doubleValue();
        Function<Integer, Double> intToDob2 = Integer::doubleValue;
    }
}
