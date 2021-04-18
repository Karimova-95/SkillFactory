package Modul_14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Task14_5_8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("2", "5", "7");
        int product = 1;
        for (int i = 0; i < list.size(); i++) {
            product *= Integer.parseInt(list.get(i));
        }
        System.out.println(product);

        Stream<List<String>> stream = Stream.of(list);
        int productStream = list.stream().mapToInt(Integer::parseInt).reduce((a, b) -> a*b).getAsInt();
        System.out.println(productStream);


    }
}
