package Modul_14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Task14_1_2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2026, Month.AUGUST, 13);
        LocalDateTime dateTime = LocalDateTime.of(date, LocalTime.of(16, 15)); // строка 3
        System.out.println(dateTime);


        LocalTime time = LocalTime.of(12, 30); // строка 1
        time.minusHours(4); // строка 2
        time = time.plusMinutes(30);
        System.out.println(time);
    }
}
