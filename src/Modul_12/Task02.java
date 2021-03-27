package Modul_12;

public class Task02 {
    public static void main(String[] args) {
        Thread thread = new Thread();
        System.out.println(thread.getId());
        System.out.println(thread.getName());
        thread.setName("nnnn");
        System.out.println(thread.getName());
        System.out.println(thread.getId());
    }
}
