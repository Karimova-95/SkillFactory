package Modul_14;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Task14_5_9 {
    public static void main(String[] args) {
        IntStream stream = IntStream.generate(() -> 15);
        OptionalDouble avg = stream.mapToLong(integer -> integer).average();
        System.out.println(avg.orElseThrow(() -> new RuntimeException()));
    }
}
