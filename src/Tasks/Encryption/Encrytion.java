package Tasks.Encryption;

public class Encrytion {


    public static StringBuilder replace(StringBuilder value, int n, int m) {
        for (int i = 0; i < value.length(); i++) {
            if (i % n == 1) {
                value.insert(i, (char)((value.charAt(i)) + n));
                value.delete(i + 1, i + 2);
            } else {
                value.insert(i, (char)((value.charAt(i)) + m));
                value.delete(i + 1, i + 2);
            }
        }
        return value;
    }

    public static StringBuilder encrypt(StringBuilder value) {
        replace(value, 2, 5);
        return value;
    }
    public static StringBuilder decrypt(StringBuilder value) {
        replace(value, -2, -5);
        return value;
    }
}
