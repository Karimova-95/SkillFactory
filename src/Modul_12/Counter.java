package Modul_12;

public class Counter {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                int a = 0;
                while (true) {
                    try {
                        System.out.println(Thread.currentThread().getName() + ": " + a);
                        a++;
                        Thread.sleep(1000 / 2);
                    } catch (InterruptedException e) {
                        break;
                    }
                }
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                int a = 0;
                while (true) {
                    try {
                        System.out.println(Thread.currentThread().getName() + ": " + a);
                        a++;
                        Thread.sleep(1000/4);
                    }catch (InterruptedException e) {
                        break;
                    }
                }
            }
        };


        thread1.start();
        thread2.start();
        Thread.currentThread().sleep(3000);
        thread1.interrupt();
        thread2.interrupt();

    }
}
