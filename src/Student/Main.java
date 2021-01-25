package Student;

public class Main {

    public static void main(String[] args) {

        Student[] students = new Student[5];
        students[0] = new Aspirant("Игорь Шустов", "ПМИ23", 4.3);
        students[1] = new Student("Оксана Амелина", "ФТИ41", 5.0);
        students[2] = new Aspirant("Константин Котов", "ФФиС33", 4.6);
        students[3] = new Student("Татьяна Белая", "ПМИ42", 4.3);
        students[4] = new Aspirant("Сергей Майский", "ПИ12", 5.0);

        for (Student student : students) {
            System.out.println(student.getFullName() + "  " + student.getScholarship());

        }

    }
}
