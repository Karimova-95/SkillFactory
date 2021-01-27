package Homework.Animal;

public class Cat extends Animal{

    public Cat() {
        this(false, "milk and meat");
    }

    public Cat(boolean veg, String food) {
        super(veg, food);
    }

    public void sound(){
        System.out.println("Meow");
    }

}
