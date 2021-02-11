package AnotherExercises.DateAndCalendar;

import java.util.Date;

public class MyDate {

    public static void main(String[] args) {

        Date date1 = new Date();
        Date date2 = new Date();

        date1.after(date2);
        date1.before(date2);
        date1.compareTo(date2); // сравнивает даты
        date1.getTime(); // возвращает кол-во миллисек, прошедших с полуночи 01.01.1970
        date1.setTime(445555666884L); // устанавливает время и дату в виде числа миллисек , прошедших с полуночи 01.01.1970
    }
}
