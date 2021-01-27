package AnotherExercises.company;

import AnotherExercises.company.datails.Engine;
import AnotherExercises.company.professions.Driver;
import AnotherExercises.company.vehicles.Car;
import AnotherExercises.company.vehicles.Lorry;
import AnotherExercises.company.vehicles.SportCar;

public class Main {

    public static void main(String[] args) {

        Driver driver1 = new Driver("Alex", 31, 9);
        Engine motor1 = new Engine(120, "andorro");
        Car car1 = new Lorry("Scania", "грузовой", 19000, driver1, motor1, 5000);

        Driver driver2 = new Driver("Marko", 28, 12);
        Engine motor2 = new Engine(800, "mirakle");
        Car car2 = new SportCar("honda", "спортивный", 7000, driver2, motor2, 400);

        car1.start();
        car2.start();

        car1.printInfo();
        car2.printInfo();
    }
}
