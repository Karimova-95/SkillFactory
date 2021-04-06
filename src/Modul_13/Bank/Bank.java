package Modul_13.Bank;

import java.util.concurrent.atomic.AtomicInteger;

public class Bank {

    private AtomicInteger money = new AtomicInteger(10000);

    public Bank() {
        new Client().start();
        new Client().start();
        new Client().start();
    }

    AtomicInteger getMoney() {
        return money;
    }

    void take(int money) {
        this.money.getAndAdd(-money);
    }

    void repay(int money) {
        this.money.getAndAdd(money);
    }

    class Client extends Thread{
        @Override
        public void run() {
            while(true) {
                take(1000);
                repay(1000);
            }
        }
    }



    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank();
        while(true) {
            System.out.println(bank.getMoney());
            Thread.sleep(1000);
        }
    }
}
