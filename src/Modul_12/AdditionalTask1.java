package Modul_12;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class AdditionalTask1 {

    private static ArrayBlockingQueue queue = new ArrayBlockingQueue<>(10);

    public static void main (String[]args){

        Random random = new Random();

        new Thread(() -> {
            try {
                while (true) {
                    queue.put(random.nextInt(100));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(100);
                    int rand = random.nextInt(10);
                    if (rand == 5) {
                        System.out.println("First threat: " + queue.take());
                        System.out.println("Second threat: " + rand);
                        System.out.println("Queue size: " + queue.size() + "\n");
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

}
