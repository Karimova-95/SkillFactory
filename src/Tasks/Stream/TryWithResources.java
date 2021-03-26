package Tasks.Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

    public static void main(String[] args) {

    }

    static String readFirstLineFromFileWithTryWithResources(String path) {
        try ( BufferedReader br = new BufferedReader(new FileReader(path))){
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
//    static String readFirstLineFromFileWithFinallyBlock(String path) {
//        BufferedReader br = null;
//        try {
//            br = new BufferedReader(new FileReader(path));
//            return br.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        finally {
//
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            return null;
//        }
//    }
}
