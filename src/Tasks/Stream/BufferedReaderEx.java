package Tasks.Stream;

import java.io.*;
import java.util.Scanner;

public class BufferedReaderEx {

    public static void main(String[] args) throws IOException {
//        File file = new File("text.txt");
//        FileInputStream fis = new FileInputStream(file);
//        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
//        String line;
//        while ((line = br.readLine()) != null) {
//            System.out.println(line);
//        }
//        fis.close();
//        br.close();

        BufferedReader br = new BufferedReader(new FileReader("text.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
