package Tasks.Collections;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class task04_modul11 {
    public static void main(String[] args) {
        Set<NewCar> cars = new TreeSet<>(Comparator.reverseOrder()); // строка 1
        cars.add(new NewCar("Toyota", 243423424L)); // строка 2
        cars.add(new NewCar("Subaru", 112313213L));
        System.out.println(cars);
    }
}
class NewCar implements Comparable<NewCar> {
    private final String brand;
    private final long serialNumber;

    public NewCar(String brand, long serialNumber) {
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewCar newCar = (NewCar) o;
        return serialNumber == newCar.serialNumber &&
                brand.equals(newCar.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }

    @Override
    public String toString() {
        return brand;
    }

    @Override
    public int compareTo(NewCar o) {
        return brand.compareTo(o.brand);
    }
}