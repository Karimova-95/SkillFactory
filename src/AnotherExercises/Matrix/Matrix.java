package AnotherExercises.Matrix;

import java.util.Arrays;

public class Matrix {

    private int row, col;
    private int[][] array;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = (int)(Math.random() * 10);
            }
        }
    }

    public Matrix(int[][] array) {
        this.array = array;
        row = array.length;
        col = array[0].length;
    }

    public int[][] getArray() {
        return array;
    }

    public void sumMatrix() {
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum += array[i][j];
            }
        }
        System.out.print("Сумма элементов матрицы: " + sum);
    }

    public void print() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void multByNumber(int number) {
        System.out.println("Произведение матрицы и " + number);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] * number + " ");
            }
            System.out.println();
        }
    }

    public void multByMatrix(Matrix arr) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < arr.col; j++) {
                int sum = 0;
                for (int k = 0; k < arr.row; k++) {
                    sum += array[i][k]*arr.getArray()[k][j];
                }
                System.out.print( sum + "  ");
            }
            System.out.println();
        }
    }

    public void sumOfMatrix(Matrix arr) {
        if (row == arr.row && col == arr.col) {
            System.out.println("Сумма матриц: ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(array[i][j] + arr.getArray()[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println("Размер матриц не соответствует");
        }
    }

    @Override
    public String  toString() {
        return "AnotherExercises.Factorial.Factorial.Matrix{" +
                "row=" + row +
                ", col=" + col +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
