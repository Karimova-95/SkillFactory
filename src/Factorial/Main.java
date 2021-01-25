package Factorial;

import java.util.Scanner;
//рекурсивный метод

public class Main {

    public static void main(String[] args) {

        Factorial f = new Factorial();
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(number + "! = " + f.fact(number));
    }
}
