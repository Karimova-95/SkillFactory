package AnotherExercises.company.vehicles;

import AnotherExercises.company.datails.Engine;
import AnotherExercises.company.professions.Driver;

public class Car {
    private String model;
    private String carClass;
    private int weight;
    Driver driver;
    Engine motor;

    public Car(String model, String carClass, int weight, Driver driver, Engine motor) {
        this.model = model;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.motor = motor;
    }

    public void start() { System.out.println(model + " поехал"); }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void printInfo() {
        System.out.println("Модель автомобиля: " + model +
                ", класс автомобиля: " + carClass +
                ", вес: " + weight +
                ", водитель: " + driver.getFullName() +
                "(стаж: " + driver.getExperience() + ")" +
                ", мотор: " + motor);
    }
}
