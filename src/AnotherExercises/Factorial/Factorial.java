package AnotherExercises.Factorial;

public class Factorial {

    public int fact(int number){
        int result;
        if (number == 1) {
            return 1;
        } else {
            result = fact(number - 1) * number;
            return result;
        }
    }

}
