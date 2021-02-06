package Tasks.Animal_Zoo;

import java.util.Arrays;

public class Zoo {

    Object[] animals;

    public Zoo() {
        animals = new Object[3];

        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Reptile();
    }

    public void print() {
        for (Object object : animals) {
            System.out.println(object);
        }

    }

    public void change(Object obj, int i) {
        if (i >= 0 && i < animals.length) {
            animals[i] = obj;
        }
    }

    public void sound() {
        for (Object o : animals) {
            if (o instanceof Soundable) {
                ((Soundable) o).sound();
            }
        }

    }

    @Override
    public String toString() {
        return "Zoo: " + Arrays.toString(animals);
    }

    public static void main(String[] args) {
        Zoo z = new Zoo();
//        z.print();
//        System.out.println();
//        z.change(new PopcornStall(), 1);
//        z.print();

        System.out.println(z);
        z.sound();
    }
}
