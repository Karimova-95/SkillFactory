package Tasks.Encryption;


import static Tasks.Encryption.Encrytion.decrypt;
import static Tasks.Encryption.Encrytion.encrypt;

public class Main {

    public static void main(String[] args) {

        StringBuilder key = new StringBuilder("Hello. I a'm from Russia.");

        System.out.println(key);
        System.out.println(encrypt(key));
        System.out.println(decrypt(key));
    }

}
