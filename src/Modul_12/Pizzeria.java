package Modul_12;

import java.util.concurrent.LinkedBlockingDeque;

public class Pizzeria {

    LinkedBlockingDeque<String> order = new LinkedBlockingDeque();

    public Pizzeria() {
        new PizzaCar().start();
        new PizzaCar().start();
    }

    class PizzaCar extends Thread {

        @Override
        public void run() {

        }
    }

    void order (String pizzaName) throws InterruptedException {
        order.put(pizzaName);
    }
    public static void main(String[] args) throws InterruptedException {

        Pizzeria pizzeria = new Pizzeria();
        pizzeria.order("Margarita");
        Thread.sleep(100);
        pizzeria.order("Pepperoni");
        Thread.sleep(100);
        pizzeria.order("Sicilian");
        Thread.sleep(100);
        pizzeria.order("Greek");

    }
}
