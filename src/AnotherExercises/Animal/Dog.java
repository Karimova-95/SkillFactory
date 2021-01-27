package AnotherExercises.Animal;

public class Dog extends Animal{

    private String location = "конуре";
    private String food = "мясо, суп";

    public Dog() {
        super("Собака");
    }

    @Override
    public String getFood() {
        return food;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void makeNoise() {
        System.out.println("гав-гав");
    }

    @Override
    public void eat() {
        System.out.println("мясо, суп");
    }

    public void run() {
        System.out.println("Собака бежит");
    }
}
