package Modul_12;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class Pizzeria2 {
    private LinkedBlockingDeque<String> pizzaCar = new LinkedBlockingDeque(2);
    private long startWorking;

    public Pizzeria2() {
        startWorking = System.currentTimeMillis();
    }

    class Client extends Thread{

    }

    private void order (String pizzaName) {
        if (System.currentTimeMillis() - startWorking < 5000) {
            new Client() {
                public void run() {
                    try {
                        if (pizzaCar.offer(pizzaName, 250, TimeUnit.MILLISECONDS)) {
                            Thread.sleep(500);
                            System.out.println(pizzaCar.poll() + " was delivered");
                        } else {
                            System.out.println(pizzaName + " was NOT delivered");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        } else {
            System.out.println(pizzaName + " was NOT delivered");
        }

    }

    public static void main(String[] args) throws InterruptedException {

        Pizzeria2 pizzeria = new Pizzeria2();
        pizzeria.order("Margarita");
        Thread.sleep(100);
        pizzeria.order("Pepperoni");
        Thread.sleep(100);
        pizzeria.order("Sicilian");
        Thread.sleep(100);
        pizzeria.order("Greek");

    }
}
