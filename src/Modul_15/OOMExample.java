package Modul_15;

import java.util.LinkedList;
import java.util.List;

public class OOMExample {
    public static void main(String[] args) {
        // создадим список, ссылающийся на
        // 100 массивов размером 1Mb
//        List<Object> objects = new LinkedList<>();
//        for (int i = 0; i < 100; i++) {
//            objects.add(new byte[1024 * 1024]);
//        }
//        System.out.println("Success!");

        // рекурсивный вызов глубиной в
        // 50 тысяч фреймов
        loop(50_000);
        System.out.println("Success!");
    }

    public static void loop(int repeats) {
        if (repeats > 0) {
            loop(repeats - 1);
        }
    }
}
