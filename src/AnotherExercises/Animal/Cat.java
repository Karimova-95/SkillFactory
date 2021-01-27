package AnotherExercises.Animal;

public class Cat extends Animal {

    private String location = "кровати";
    private String food = "мышки, молоко";

    public Cat() {
        super("Кошка");
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getFood() {
        return food;
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу");
    }

    public void climb() {
        System.out.println("Кошка лезет на дерево");
    }
}
