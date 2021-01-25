package Student;

public class Student {

    private String fullName, group;
    private double averageMark;

    public Student(String fullName, String group, double averageMark) {
        this.fullName = fullName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getFullName() {
        return fullName;
    }

    public double getScholarship() {
        if (averageMark == 5.0) {
            return 100.0;
        }
        return 80.0;
    }
}
