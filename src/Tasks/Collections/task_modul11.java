package Tasks.Collections;

import java.util.Set;
import java.util.TreeSet;

public class task_modul11 {
    public static void main(String[] args) {
        Set<Carr> cars = new TreeSet<>();
        cars.add(new Carr("Toyota", 243423424L)); // строка 1
        System.out.println(cars); // строка 2
    }
}
class Carr {
    private String brand;
    private long serialNumber;

    public Carr(String brand, long serialNumber) {
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return brand;
    }
}
