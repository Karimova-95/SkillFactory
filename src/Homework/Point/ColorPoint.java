package Homework.Point;

public class ColorPoint extends Point{

    private int color;

    public ColorPoint(double x, double y, int color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(", " + this.color);
    }
}
