package AnotherExercises.company.vehicles;

import AnotherExercises.company.datails.Engine;
import AnotherExercises.company.professions.Driver;

public class Lorry extends Car {

    private int carrying;

    public Lorry(String model, String carClass, int weight, Driver driver, Engine motor, int carrying) {
        super(model, carClass, weight, driver, motor);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return " грузоподъемность: " + carrying;
    }
}
