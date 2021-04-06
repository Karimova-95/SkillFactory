package Modul_13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Создать пул из двух потоков. В цикле добавить в пул 5 потоков с задержкой 4 с.
// Вывести результат их работы в консоль.

public class AdditionalTask {
    public static void main(String[] args) throws InterruptedException {

        AdditionalTask task = new AdditionalTask();
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++)
            executorService.submit(new Work(i));


        executorService.shutdown();
        System.out.println("All tasks submitted");
    }

}

class Work implements Runnable {
    public int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Work " + id + " was completed");
    }
}
