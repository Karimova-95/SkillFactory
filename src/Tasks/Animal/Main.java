package Tasks.Animal;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();
        System.out.println(cat.getEats());
        System.out.println(cat.isVegetarian());
    }
}
