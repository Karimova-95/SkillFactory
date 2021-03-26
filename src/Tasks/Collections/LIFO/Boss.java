package Tasks.Collections.LIFO;

import java.util.Stack;

public class Boss {
    private Stack toDoStack;

    public Boss(Stack toDoStack) {
        this.toDoStack = toDoStack;
    }

    public void giveTask(String task) {
        toDoStack.push(task);
        System.out.println("Дал задачу " + task);
    }
}
