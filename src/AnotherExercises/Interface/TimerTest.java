package AnotherExercises.Interface;


import javax.swing.*;

public class TimerTest {

    public static void main(String[] args) {

        TimePrinter listener = new TimePrinter();
        var timer = new Timer(1000, listener);
        timer.start();

        JOptionPane.showMessageDialog(null, "Quite program?");
        System.exit(0);
    }
}
