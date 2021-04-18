package Modul_14;

import java.util.Optional;
import java.util.Random;

public class Task14_4_5 {
    public static void main(String[] args) {
        int n = 4;
        Optional<String> optional = guess(n);
        System.out.println(optional.orElse("ничего нет"));

    }

    public static Optional<String> guess(int guess) {
        if (guess <= 0 || guess >= 6) {
            throw new IllegalStateException();
        } else {
            int n = new Random().nextInt(5) + 1;
            if (guess == n) {
                return Optional.of("Поздравляяюю");
            } else {
                return Optional.empty();
            }
        }
    }
}
