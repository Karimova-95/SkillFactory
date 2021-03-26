package Tasks.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class task01 {
    public static void main(String[] args) {
        Deque deque = new ArrayDeque();
        deque.offer(12);
        System.out.println(deque.element());
        deque.add(6);
        System.out.println(deque.element());
        deque.add(4);
        System.out.println(deque.element());
        deque.poll();
        System.out.println(deque.element());
        deque.peek();
        System.out.println(deque.element());

    }
}
