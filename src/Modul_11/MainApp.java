package Modul_11;

public class MainApp{

    public static void main(String[] args) {
        Thread thread = new Thread(new Advertisement());
        thread.start();

    }
}

class Advertisement implements Runnable{
    public static void show() {

    }

    @Override
    public void run() {
        show();
    }
}
