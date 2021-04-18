package Modul_14;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.stream.Stream;

public class Task14_6_1 {
    public static void main(String[] args) {
//        Path path = Paths.get("C:\\Users\\hp\\Desktop\\text.txt");
//        System.out.println("The path name is: " + path); // The path name is: land/hippo/harry.happy
//
//        for (int i = 0; i < path.getNameCount(); i++) {
//            System.out.println("Element " + i + " is : " + path.getName(i));
//        }

//        Stream<String> stream = Stream.iterate("", (s) -> s + "1");
//        System.out.println(stream.limit(2).map(x -> x + "2"));

        LocalDate date = LocalDate.of(2026, Month.AUGUST, 13); // строка 1
        LocalTime time = LocalTime.of(16, 15); // строка 2
        LocalDateTime dateTime = LocalDateTime.of(date, time); // строка 3
        System.out.println(dateTime);
    }
}
