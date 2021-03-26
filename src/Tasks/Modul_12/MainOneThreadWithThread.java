package Tasks.Modul_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainOneThreadWithThread {
    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();

        // 1 часть

        Thread thread1 = new Thread(() -> {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= 10000000; i++) {
                numbers.add(i);
            }
            int max = Collections.max(numbers);
            System.out.println("Max found: " + max);
        });
        // 2 часть

        Thread thread2 = new Thread(() -> {
            List<Integer> unsorted = new ArrayList<>();
            for (int i = 10000000; i >= 1; i--) {
                unsorted.add(i);
            }
            Collections.sort(unsorted);
            System.out.println("List is sorted now");
        });

        // 3 часть

        Thread thread3 = new Thread(() -> {
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= 10000000; i++) {
                list.add(i);
            }
            while (list.size() != 0) {
                list.remove(list.size() - 1);
            }
            System.out.println("List cleared");
        });
        // Итог
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();


        long end = System.currentTimeMillis();

        System.out.println("Total time: " + (end - start) + " ms");
    }
}
