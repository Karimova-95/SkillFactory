package Student;

public class Aspirant extends Student{

    public Aspirant(String fullName, String group, double averageMark) {
        super(fullName, group, averageMark);
    }

    @Override
    public double getScholarship() {
        return super.getScholarship() + 100;
    }
}
