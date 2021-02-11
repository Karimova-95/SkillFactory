package AnotherExercises.DateAndCalendar;

import java.util.Calendar;

public class MyCalendar {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        Calendar calendar1 = Calendar.getInstance();

        int era = calendar.get(Calendar.ERA);//Эра
        int year = calendar.get(Calendar.YEAR);//Год
        int month = calendar.get(Calendar.MONTH);//Месяц Jan = 0, dec = 11
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);//День месяца
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);//День недели
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);//Неделя года
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);//Неделя месяца

        int hour = calendar.get(Calendar.HOUR);//Час в 12 часовом формате
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);//Час в 24 часовом формате
        int minute = calendar.get(Calendar.MINUTE);//Минуты
        int second = calendar.get(Calendar.SECOND);//Секунды
        int millisecond = calendar.get(Calendar.MILLISECOND);//Миллисекунды

        System.out.println("Сейчас " + hourOfDay + ":" + minute + "/" + dayOfMonth + "." + (month + 1) + "." + year);

        calendar.add(Calendar.DAY_OF_MONTH, 3); // добавляем к компоненте месяца +3
        calendar.after(calendar1);
        calendar.before(calendar1);
        calendar.clear();
        calendar1.getTime(); //возвращает объект класса Date
        calendar.set(Calendar.DAY_OF_MONTH, 15);
    }
}
