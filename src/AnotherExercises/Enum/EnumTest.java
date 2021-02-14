package AnotherExercises.Enum;

import java.util.Locale;
import java.util.Scanner;

public class EnumTest {

    public static void main(String[] args) {

        var in = new Scanner(System.in);
        System.out.println("Enter a size: " +
                "(SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size = " + size);
        System.out.println("abbreviation = " + size.getAbbreviatiion());
        System.out.println(Size.MEDIUM.ordinal()); //позиция
        if(size == Size.EXTRA_LARGE) {
            System.out.println("Goog job--you paid attention to the _.");
        }
    }
}
