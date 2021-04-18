package Modul_14;

import java.time.Duration;
import java.time.LocalTime;

/*
Напишите метод, который будет принимать 2 объекта: 1 типа LocalTime и 2 тип Duration, и будет возвращать true,
если переданное время + промежуток больше текущего времени.
 */

public class Task14_1_3 {

    public boolean check(LocalTime time, Duration duration) {
        return LocalTime.now().isAfter(time.plus(duration));
    }

    public static void main(String[] args) {

        Task14_1_3 task = new Task14_1_3();
        System.out.println(task.check(LocalTime.of(13, 20), Duration.ofMinutes(50)));
    }
}
