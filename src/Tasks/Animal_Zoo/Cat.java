package Tasks.Animal_Zoo;

public class Cat extends Animal implements Soundable {
    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "I'm a cat";
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }
}
