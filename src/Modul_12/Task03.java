package Modul_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task03 {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int millis = bufferedReader.read();
        Thread thread1 = new Thread(() -> {
            int i = 0;
            while (true) {
                try {
                    Thread.sleep(1000 / 2);
                    System.out.println(Thread.currentThread().getName() + ": " + ++i);
                } catch (InterruptedException ex) {
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            int i = 0;
            while (true) {
                try {
                    Thread.sleep(1000 / 4);
                    System.out.println(Thread.currentThread().getName() + ": " + ++i);
                } catch (InterruptedException ex) {}
            }
        });

        thread1.start();
        thread2.start();
        Thread.currentThread().sleep(millis);
        thread1.interrupt();
        thread2.interrupt();
    }

}
