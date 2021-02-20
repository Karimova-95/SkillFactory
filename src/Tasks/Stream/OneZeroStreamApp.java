package Tasks.Stream;

import java.util.Scanner;

public class OneZeroStreamApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(new OneZeroStream());
        for (int i = 0; i < 10; i++){
            System.out.print(scanner.nextInt());
        }
    }
}
