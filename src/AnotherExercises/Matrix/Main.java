package AnotherExercises.Matrix;

public class Main {

    public static void main(String[] args) {

        Matrix m1 = new Matrix(3, 2);
        m1.print();
        m1.sumMatrix();
        System.out.println();

        int[][] array = {{3, 2}, {1, 4}};
        Matrix m2 = new Matrix(array);
        m2.print();

        m2.sumMatrix();
        m1.sumOfMatrix(m2);
        m1.multByNumber(5);

        System.out.println();
        m1.multByMatrix(m2);
    }
}
