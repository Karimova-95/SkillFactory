package Tasks.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class task02_modul11 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }

        for (int i = 0; i < numbers.size()/2; i++) {
            int n = numbers.get(i);
            numbers.set(i, numbers.get(numbers.size() - i - 1));
            numbers.set((numbers.size() - i - 1), i);
        }

        for (int i = 0; i < 100; i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
