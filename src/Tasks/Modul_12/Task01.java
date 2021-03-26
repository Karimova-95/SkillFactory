package Tasks.Modul_12;

public class Task01 {
    private static int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread();
        new Thread() {
            public void run(){
                for (int i = 0; i < 1000000000; i++) {
                    Task01.counter++;
                }
            }
        }.start();

        thread.start();
        thread.join(); // main() поток блокируется и ждет, пока не завершится поток thread
        System.out.println("Counter value: " + counter); // Counter value: 1000000000
    }
}
