package Tasks.Collections.LIFO;

import java.util.Stack;

public class Worker {
    private Stack toDoStack;

    public Worker (Stack toDoStack) {
        this.toDoStack = toDoStack;
    }

    public void takeTask() {
       while (!toDoStack.empty()) {
           System.out.println("Выаолняю задачу " + toDoStack.pop());
        }
    }
}
