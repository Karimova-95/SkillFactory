package Tasks.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {

    public static void main(String[] args) throws IOException {
        //чтение файла smallfile.txt из рабочей директории
        String fileName = "C:\\Users\\hp\\IdeaProjects\\SkillFactory\\src\\Tasks\\Stream\\smallfile.txt";
        //File fileName = new File("C:\\Users\\hp\\IdeaProjects\\SkillFactory\\src\\Tasks\\Stream\\smallfile.txt");
        FileInputStream fis = new FileInputStream(fileName);
        int i;
//        int n = fis.available();
//        System.out.println(n);
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
//        int i = fis.read();
//        while (i != -1) {
//            ...
//            i = fis.read();
//        }
        fis.close();
        System.out.println();
    }
}