package Tasks.Collections.Ship;

import java.util.ArrayDeque;

public class task06_modul11 {
    public static void main(String[] args) {
        ArrayDeque<String> greetings = new ArrayDeque<>();
        greetings.push("hello");
        greetings.push("hi");
        greetings.push("ola");
        greetings.pop();
        greetings.peek();
        while (greetings.peek() != null) {
            System.out.print(greetings.pop());
        }
    }
}
