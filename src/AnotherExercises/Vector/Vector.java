package AnotherExercises.Vector;

public class Vector {
    private int x;
    private int y;
    private int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double vectorLength() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public double scalarProduct(Vector vector) {
        return x*vector.x + y*vector.y + z*vector.z;
    }

    public Vector crossProduct(Vector vector) {
        return new Vector(
                y*vector.z - z*vector.y,
                z*vector.x - x*vector.z,
                x*vector.y - y*vector.x
        );
    }

    public double angle(Vector vector) {
        return scalarProduct(vector)/(vectorLength()*vector.vectorLength());
    }

    public Vector add(Vector vector) {
        return new Vector(
                x + vector.x,
                y + vector.y,
                z + vector.z);
    }

    public Vector subtract(Vector vector) {
        return new Vector(
                x - vector.x,
                y - vector.y,
                z - vector.z);
    }

    @Override
    public String toString() {
        return "AnotherExercises.Factorial.Factorial.Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
