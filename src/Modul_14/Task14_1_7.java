package Modul_14;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Task14_1_7 {

    public LocalTime converter(Date date) {
        Instant instant = date.toInstant();
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Asia/Yekaterinburg"));
        return zonedDateTime.toLocalTime();
    }
    public static void main(String[] args) {
        Task14_1_7 task = new Task14_1_7();
        System.out.println(task.converter(new Date()));
    }
}
