package AnotherExercises.Animal;

public class Animal {

    private String type;
    private String food;
    private String location;

    public Animal() {
    }

    public Animal(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public String getFood() {
        return food;
    }

    public void makeNoise() {

    }

    public void eat() {
        System.out.println(type + " кушает " + getFood());
    }

    public void sleep() {
        System.out.println(type + " спит в " + getLocation());
    }

}
