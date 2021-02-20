package Tasks.Stream;

import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamEx {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("test.txt");
        fos.write("Hello FileOutputStream world".getBytes());
        fos.write("\nПривет FileOutputStream мир".getBytes("UTF-8"));
        // Узнать кодировку по умолчанию, то есть ту, в которой работает getBytes()
        // System.out.println(System.getProperty("file.encoding"));
        fos.close();
    }
}