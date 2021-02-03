package AnotherExercises.Animal_Zoo;

public class Dog extends Animal{
    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "I'm a dog";
    }
}
