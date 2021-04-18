package Modul_14;

import java.time.*;
import java.util.Date;

public class Task14_1_1 {

    public static void main(String[] args) {

        //Создаем объект, описывающий текущий момент времени на время вызова:
        System.out.println("----***----");
        Instant instant = Instant.now();
        System.out.println(instant);

        //Конвертируем Instant в ZonedDateTime согласно переданному значению временной зоны:
        System.out.println("----***----");
        Instant instant1 = Instant.now();
        ZonedDateTime zonedDateTime = instant1.atZone(ZoneId.of("Europe/Moscow"));
        System.out.println(zonedDateTime);

        //Конвертируем ZonedDateTime в Instant:
        System.out.println("----***----");
        ZonedDateTime zonedDateTimeObject = ZonedDateTime.now();
        Instant instant2 = zonedDateTimeObject.toInstant();
        System.out.println(zonedDateTimeObject);
        System.out.println(instant2);

        //Конвертируем Date в Instant:
        System.out.println("----***----");
        Date date = new Date();
        Instant instant3 = date.toInstant();
        ZonedDateTime zonedDateTime3 = instant3.atZone(ZoneId.of("Europe/Moscow"));
        System.out.println(instant3);
        System.out.println(zonedDateTime3);

//        System.out.println(ZoneId.getAvailableZoneIds());
//        System.out.println(ZonedDateTime.now());


//        ZonedDateTime time = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Moscow"));
//        ZonedDateTime time = ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.of("Europe/Moscow"));
//        System.out.println(time);


//        LocalTime time = LocalTime.of(16, 30); // строка 1
//        LocalTime time1 = time.withHour(20);
//        System.out.println(time1);

        // Не путаnm назначения временных классов (LocalTime, LocalDateTime).
        // Если есть экземпляр класса LocalDate, то он не может работать с временем и наоборот.
        // Поэтому такой код компилироваться не будет!
//        LocalTime time = LocalTime.of(16, 30);
//        time.minusWeek(2); // ошибка компиляции


//        LocalDate date = LocalDate.of(2009, 4, 22);
//        Period period = Period.ofYears(4);
//        System.out.println(date.minus(period)); // 2005-4-22
//        LocalTime time = LocalTime.of(16, 30);
//        Duration duration = Duration.ofMinutes(15);
//        System.out.println(time.plus(duration)); // 16:45
    }
}
