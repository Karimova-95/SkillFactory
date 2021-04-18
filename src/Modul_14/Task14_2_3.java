package Modul_14;

public class Task14_2_3 {
    public static double doubleFromString(int value, Worker worker) {
        return worker.rework(value);
    }

    public static void main(String[] args) {
        doubleFromString(10, value -> Double.valueOf(value));
    }
//    public static void main(String[] args) {
//        Task14_2_3.doubleFromString(10, new Worker() {
//            @Override
//            public double rework(int value) {
//                return value;
//            }
//        });
//    }
}
