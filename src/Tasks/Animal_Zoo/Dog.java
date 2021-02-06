package Tasks.Animal_Zoo;

public class Dog extends Animal implements Soundable{
    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "I'm a dog";
    }

    @Override
    public void sound() {
        System.out.println("Woof-woof");
    }
}
