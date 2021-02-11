package AnotherExercises.SimpleDotCom;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public DotCom(String name) {
        this.name = name;
    }

    public void setLocationCells(ArrayList<String> newLocation) {
        locationCells = newLocation;
    }

    public String checkYourself(String userGuess) {
        String result = "Мимо";
        int index = locationCells.indexOf(userGuess);
        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "Потопил";
                System.out.println("Ой! Вы потопили " + name + ":-(");
            } else {
                result = "Попал";
            }
        }
        return result;
    }
}
