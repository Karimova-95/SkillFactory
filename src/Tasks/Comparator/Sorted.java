package Tasks.Comparator;

import Tasks.Comparator.ComparatorByLength;

import java.util.Arrays;

public class Sorted {
    public static void main(String[] args) {
//        String[] array = {"баркас", "ёлка", "баржа", "арбузы", "тыква"};
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array, new ComparatorByLength());
//        System.out.println(Arrays.toString(array));

        String[] array = {"Apple","Pineapple", "DragonFruit", "Orange", "Lime", "Cherry"};
        Arrays.sort(array, new ComparatorByLength());
        System.out.println(Arrays.toString(array));
    }
}
