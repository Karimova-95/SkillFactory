package Modul_14;

public class Task14_2_1 {
    public static void main(String[] args) {
        int value = 50;
        validate(value, value1 -> value1 > value);
    }

    private static void validate(int value, Validator validator) {
        boolean isValid = validator.validate(value);
        if (isValid) {
            System.out.println("truuuue");
        } else {
            System.out.println("faaaalse");
        }
    }
}
