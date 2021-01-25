package AnotherExercises.TwoNumbers;

public class TwoNumbers {

    public void twoNums(int A, int B) {
        if (A < B) {
            System.out.print(A + " ");
            twoNums(A + 1, B);
        } else if (A > B) {
            System.out.print(A + " ");
            twoNums(A - 1, B);
        } else System.out.print(A + " ");
    }
}
