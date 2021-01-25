package Homework.Tank;

public class Tank {
    private int positionX;
    private int positionY;
    private int fuel;
    private int side = 0, counter;
    private static int count = 0;
    private String MODEL = "T34";


    public Tank() {
        this(0, 0, 100);
    }

    public Tank(int positionX, int positionY) {

        this(positionX, positionY, 100);
    }

    public Tank(int positionX, int positionY, int fuel) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.fuel = fuel;
        counter = ++count;
    }

    public void printPosition() {

        System.out.println("The Tank " + MODEL + "-" + counter + " is at " + positionX + ", " +
                "" + positionY + " now.");
    }

    public void goForward(int position) {
        switch (side) {
            case 0:
                if (Math.abs(position) <= fuel) {
                    positionX += position;
                    fuel-= Math.abs(position);
                }
                else {
                    if (position > 0) {
                        positionX += fuel;
                        fuel = 0;
                    }
                    else {
                        positionX -= fuel;
                        fuel = 0;
                    }

                }
                break;
            case 1:
                if (Math.abs(position) <= fuel) {
                    positionY += position;
                    fuel -= Math.abs(position);
                }
                else {
                    if (position > 0) {
                        positionY -= fuel;
                        fuel = 0;
                    }
                    else {
                        positionY += fuel;
                        fuel = 0;
                    }
                }
                break;
            case 2:
                if (Math.abs(position) <= fuel) {
                    positionX -= position;
                    fuel -= Math.abs(position);
                }
                else {
                    if (position > 0) {
                        positionX -= fuel;
                        fuel = 0;
                    }
                    else {
                        positionX += fuel;
                        fuel = 0;
                    }
                }
                break;
            case 3:
                if (Math.abs(position) <= fuel) {
                    positionY -= position;
                    fuel -= Math.abs(position);
                }
                else {
                    if (position > 0) {
                        positionY -= fuel;
                        fuel = 0;
                    }
                    else {
                        positionY += fuel;
                        fuel = 0;
                    }
                }
                break;
        }
    }
    public void goBackward(int position) {
        goForward(-position);
    }
    public void turnRight() {
        side++;
        if (side > 3)
            side = 0;
    }

    public void turnLeft() {
        side--;
        if (side < 0) {
            side = 3;
        }
    }
}
