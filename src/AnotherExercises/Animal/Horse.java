package AnotherExercises.Animal;

public class Horse extends Animal{

    private String location = "сарае";
    private String food = "сено, трава";
    public Horse() {
        super("Лошадь");
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String getFood() {
        return food;
    }

    @Override
    public void makeNoise() {
        System.out.println("И-ГО-ГО");
    }

    public void jump() {
        System.out.println("Лошадь скачет");
    }
}
