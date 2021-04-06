package Modul_13;

import java.util.ArrayList;

public class IPencryption {
    private ArrayList<Integer> IP = new ArrayList<>(4);
    private static boolean stopEncrypting = false;

    public IPencryption() {
        IP.add(255);
        IP.add(255);
        IP.add(255);
        IP.add(255);
        new Thread(() -> {
            while (!stopEncrypting) {
                System.out.println(IP.get(0) + "." + IP.get(1) + "." + IP.get(2) + "." + IP.get(3));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            while (!stopEncrypting) {
                encryption(500);
            }
        }).start();
        new Thread(() -> {
            while (!stopEncrypting){
                encryption(250);
            }
        }).start();
        new Thread(() -> {
            while (!stopEncrypting) {
                encryption(200);
            }
        }).start();
        new Thread(() -> {
            while (!stopEncrypting) {
                encryption(50);
            }
        }).start();
    }


    public  void encryption(int time){
        synchronized (IP) {
            int partOfIP = (int) (Math.random() * 4);
            int ip = (int) (Math.random() * 256);
            try {
                Thread.sleep(time);
                IP.set(partOfIP, ip);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        IPencryption iPencryption = new IPencryption();
        try {
            Thread.sleep(10000);
            IPencryption.stopEncrypting = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
