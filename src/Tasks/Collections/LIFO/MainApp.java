package Tasks.Collections.LIFO;

        import java.util.Stack;

public class MainApp {
    public static void main(String[] args) {

        int numberOfTasks = 5;
        Stack<String> toDoStack = new Stack<>();
        Boss boss = new Boss(toDoStack);
        Worker worker = new Worker(toDoStack);

        for (int i = 1; i <= numberOfTasks ; i++) {
            boss.giveTask("Задание " + i);
        }
        System.out.println("Начальник закончил давать задание");

        for (int i = 1; i < numberOfTasks + 1 ; i++) {
            worker.takeTask();
        }
    }
}
