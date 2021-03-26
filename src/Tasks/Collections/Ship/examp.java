package Tasks.Collections.Ship;

import java.util.*;

public class examp {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.push(1);
        queue.push(2);
        queue.push(3);

        Set<Integer> set = new LinkedHashSet<>(queue); // 1

        System.out.println(set);
    }
}
