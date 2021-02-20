package Tasks.Stream;

import java.io.*;
import java.nio.charset.Charset;

public class CopyUsingStreamsRW {

//    private static void copyFileUsingStream(File source, Charset sourceEnc, File dest, Charset descEnc) throws IOException
    private static void copyFileUsingStream(String source,
                                            String sourceEnc,
                                            String dest,
                                            String destEnc) throws IOException {

        Charset sEnc = Charset.forName(sourceEnc);
        Charset dEnc = Charset.forName(destEnc);
        //File source = new File("C:\\Users\\hp\\IdeaProjects\\SkillFactory\\src\\Tasks\\Stream\\smallfile.txt");
        Reader fis = new InputStreamReader(new FileInputStream(source),sEnc );
        Writer fos = new OutputStreamWriter(new FileOutputStream(dest), dEnc);
        char[] buffer = new char[1024];
        int length;
        while ((length = fis.read(buffer)) > 0) {
            fos.write(buffer, 0, length);
        }
        fis.close();
        fos.close();
    }

    public static void main(String[] args) throws IOException {
        copyFileUsingStream("src/utf8.txt","UTF-8", "src/win1251.txt", "WINDOWS-1251");
//        copyFileUsingStream(copyFileUsingStream(new File("src/win1251.txt"),
//                Charset.forName("windows-1251"),
//                new File("src/utf8.txt"),
//                Charset.forName("utf-8")););
    }
}
