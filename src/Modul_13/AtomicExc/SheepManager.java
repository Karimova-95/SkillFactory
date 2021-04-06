package Modul_13.AtomicExc;

import java.util.concurrent.atomic.AtomicInteger;

public class SheepManager {

    private static AtomicInteger sheepCount1 = new AtomicInteger(0);
    private static int sheepCount2 = 0;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                sheepCount1.getAndIncrement();
                sheepCount2++;
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(sheepCount1 + " " + sheepCount2);
    }
}
