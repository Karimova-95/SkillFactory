package Modul_13;

import java.util.ArrayList;
import java.util.List;

public class Task13_3_3 {
    private List<String> stringList = new ArrayList<>();

    private void addElemToList() {
        synchronized (this) {
            stringList.add("Hello");
        }
    }

    private synchronized void addAnotherElemToList() {
        stringList.add("Hello again");
    }

    public static void main(String[] args) throws InterruptedException {
        Task13_3_3 main = new Task13_3_3();

        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    main.addElemToList();
                    main.addAnotherElemToList();
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    main.addElemToList();
                    main.addAnotherElemToList();
                }
            }

        };

       t1.start();
       t2.start();

       t1.join();
       t2.join();

       System.out.println("List size: "+main.stringList.size());

    }
}
