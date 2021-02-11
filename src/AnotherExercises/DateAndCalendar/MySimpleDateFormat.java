package AnotherExercises.DateAndCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MySimpleDateFormat {

    public static void main(String[] args) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        System.out.println("Сейчас " + simpleDateFormat.format(calendar.getTime()));
    }
}
