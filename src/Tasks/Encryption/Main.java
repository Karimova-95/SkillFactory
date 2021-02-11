package Tasks.Encryption;


public class Main {

    public static void main(String[] args) {

        String key = "Hello. I a'm from Russia.";

        String decryption = encrypt(key);
        String encryption = decrypt(decryption);

        System.out.println(key);
        System.out.println(decryption);
        System.out.println(encryption);
    }

    private static String decrypt(String decryption) {
        String encryption = "";
        for (int i = 0; i < decryption.length(); i++) {
            if (i % 2 == 1) {
                encryption += (char) ((int)(decryption.charAt(i)) - 2);
            } else {
                encryption += (char) ((int)(decryption.charAt(i)) - 5);
            }
        }
        return encryption;
    }

    private static String encrypt(String key) {
        String decryption = "";
        for (int i = 0; i < key.length(); i++) {
            if (i % 2 == 1) {
                decryption += (char) ((int)(key.charAt(i)) + 2);
            } else {
                decryption += (char) ((int)(key.charAt(i)) + 5);
            }
        }
        return decryption;
    }
}
