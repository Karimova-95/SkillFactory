package Modul_13.Task13_3_1;

public class Typer extends Thread {
    private String message;

    public Typer(String message) {
        this.message = message;
    }

    @Override
    public synchronized void run() {
        synchronized (Typer.class) {
            for (int i = 0; i < message.length(); i++) {
                System.out.print(message.charAt(i));
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }
}
