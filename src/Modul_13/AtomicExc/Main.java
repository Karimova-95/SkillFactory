package Modul_13.AtomicExc;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class Main {
    private static AtomicIntegerArray array = new AtomicIntegerArray(new int[10]);

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < array.length(); i+=2) {
                array.getAndAdd(i, 5);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < array.length(); i++) {
                array.getAndAdd(i, 3);
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(array);
    }
}
