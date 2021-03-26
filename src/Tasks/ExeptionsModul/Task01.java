package Tasks.ExeptionsModul;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Task01 {

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("borodino.txt"), UTF_8);
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter the number in range 1.." + lines.size());
            int n = in.nextInt();
            System.out.println("This is a prediction for you:\n" + lines.get(n - 1));
        } catch (Exception e) {
            System.out.println("Incorrect number!");
        }

    }
}
