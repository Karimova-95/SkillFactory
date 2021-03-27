package Modul_12;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ConsoleClock extends Thread{
    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");


    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Date date = new Date();
                System.out.println(dateFormat.format(date));
                Calendar cal = Calendar.getInstance();
                System.out.println(dateFormat.format(cal.getTime()));
                //System.out.println(date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("The clock was stopped");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ConsoleClock cc = new ConsoleClock();
        cc.start();
        Thread.sleep(3000);
        cc.interrupt();
    }
}
