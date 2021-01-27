package AnotherExercises.company.vehicles;

import AnotherExercises.company.datails.Engine;
import AnotherExercises.company.professions.Driver;

public class SportCar extends Car {

    private int speed;

    public SportCar(String model, String carClass, int weight, Driver driver, Engine motor, int speed) {
        super(model, carClass, weight, driver, motor);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "скорость: " + speed +
                '}';
    }
}
