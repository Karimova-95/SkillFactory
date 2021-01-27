package AnotherExercises.Animal;

public class Main {

    public static void main(String[] args) {

        Horse horse = new Horse();
        Dog dog = new Dog();
        Cat cat = new Cat();

        Animal[] animals = {horse, dog, cat};

        Veterinarian veterinarian = new Veterinarian();

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }


//        horse.sleep();
//        horse.jump();
//        cat.eat();
//        cat.climb();
//        dog.makeNoise();
//        dog.run();
    }
}
