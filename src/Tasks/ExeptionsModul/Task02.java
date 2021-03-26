package Tasks.ExeptionsModul;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;

public class Task02 {
    public static void main(String[] args) {

//        try {
//            NumberFormat nf = NumberFormat.getInstance();
//            //специально создаем ситуацию, которая приведет к исключению
//            System.out.println(nf.parse("NOT A NUMBER"));
//        }
//        catch (ParseException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println("Конец программы!");

        try {
            int a = (int)(Math.random() * 2);
            System.out.println("a = " + a);
            int c[] = { 1/a }; // опасное место #1
            c[a] = 71; // опасное место #2
        } catch(ArithmeticException e) {
            System.err.println("деление на 0" + e);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("out of bound: " + e);
        } // окончание try-catch блока
        System.out.println("after try-catch");
    }

}

