package AnotherExercises.File;

import java.io.File;
import java.io.IOException;

public class MyFile {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\hp\\IdeaProjects\\SkillFactory\\src\\AnotherExercises\\File\\MyFile.txt");
        File file2 = new File("C:\\Users\\hp\\IdeaProjects\\SkillFactory\\src\\AnotherExercises\\File");
//        System.out.println(file.getName());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.canRead());
//        System.out.println(file.exists());
//        System.out.println(file.getParent());
//        System.out.println(file.getParentFile());
//        System.out.println(file.getPath());
//        System.out.println(file.lastModified());
//        System.out.println(file.isFile());
        System.out.println(file2.isDirectory());
//        File file2 = new File("C:\\Test\\1");
//        boolean isCreated = file.mkdir();
//        System.out.println(file.length());
//        File file2 = new File("C:\\Users\\hp\\IdeaProjects\\SkillFactory\\src\\AnotherExercises\\File\\Test1.txt");
//        boolean isCreated = file2.createNewFile();
//        System.out.println(isCreated);//true

//        File file3 = new File("C:\\\\Users\\\\hp\\\\IdeaProjects\\\\SkillFactory\\\\src\\\\AnotherExercises\\\\File");
//        String[] files = file3.list();
//        for (String s : files) {
//            System.out.println(s);
//        }

    }
}
