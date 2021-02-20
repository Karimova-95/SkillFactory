package Tasks.Stream;

import java.io.*;
import java.util.Date;

public class CopyUsingStreams {
    private static void copyFileUsingStream(String source, String dest) throws IOException {

        //File source = new File("C:\\Users\\hp\\IdeaProjects\\SkillFactory\\src\\Tasks\\Stream\\smallfile.txt");
        InputStream fis = new FileInputStream(source);
        OutputStream fos = new FileOutputStream(dest);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = fis.read(buffer)) > 0) {
            fos.write(buffer, 0, length);
        }
        fis.close();
        fos.close();
    }

    public static void main(String[] args) throws IOException {
        var cus = new CopyUsingStreams();
        copyFileUsingStream("document.docx", "docum.docx");
    }
}
