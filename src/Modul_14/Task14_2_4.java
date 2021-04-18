package Modul_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

public class Task14_2_4 {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Lee Min Ho";
        System.out.println(supplier.get());

        Consumer<Integer> consumer = n -> System.out.println(n+=5);
        consumer.accept(10);

        BiConsumer<Integer, String> biConsumer = (n, s) -> System.out.println(s.concat(n.toString()));
        biConsumer.accept(159, "kkkkoko");

        Predicate<Integer> predicate = n -> n == 100;
        System.out.println(predicate.test(5));

        BiPredicate<Integer, String> biPredicate = (n, s) -> n.toString().equals(s);
        System.out.println(biPredicate.test(5, "5"));

        Function<Integer, String> function = n -> n.toString() + "second";
        System.out.println(function.apply(15));

        BiFunction<Integer, String, Character> biFunction = (n, s) -> (char)(n + Integer.parseInt(s));
        System.out.println(biFunction.apply(17, "60"));

        UnaryOperator<Integer> unaryOperator = n -> n -= 50;
        System.out.println(unaryOperator.apply(10));

        BinaryOperator<Integer> binaryOperator = (a, b) -> a*b;
        System.out.println(binaryOperator.apply(5, 10));
    }
}
