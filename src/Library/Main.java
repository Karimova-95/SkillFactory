package Library;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Саша", "Матем", LocalDate.of(1994,10,10), 89647587799L);
        readers[1] = new Reader("Диана", "Социология", LocalDate.of(1993,7,25), 89374561122L);
        readers[2] = new Reader("Тoма", "Физика", LocalDate.of(1991,3,5), 89667456644L);

        for (Reader reader : readers) {
            System.out.println(reader);
        }

        readers[1].takeBook(3);
        readers[2].takeBook(new String[] {"Детективы","Приключения", "Сказки"});

        Book khorstmann = new Book("Java", "Кей Хорстманн");
        Book suteev = new Book("Мышонок и карандаш", "В.Сутеев");
        Book marshak = new Book("Тихая сказка", "С.Маршак");

        System.out.println();
        readers[0].returnBook(new Book[] {khorstmann, marshak, suteev});

    }
}
