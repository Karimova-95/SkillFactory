package AnotherExercises.company.professions;

public class Driver extends Person {

    private int experience;

    public Driver(String fullName, int age, int experience) {
        super(fullName, age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                '}';
    }
}
