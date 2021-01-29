package AnotherExercises.Threads;

import java.util.Arrays;

public class Main {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2 ;

    public static void main(String[] args) {
        float [] arr = new float [ SIZE ];
        Arrays.fill(arr, 1.0f);
        method1(arr);
        method2(arr);


    }

    public static void method1(float arr[]) {
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));
        }
        System.out.println("method1: " + (System.currentTimeMillis() - a));
    }


        public static void method2(float arr[]) {
            long a = System.currentTimeMillis();
            float[] part1 = new float[HALF];
            float[] part2 = new float[HALF];
            System.arraycopy(arr, 0, part1, 0, part1.length);
            System.arraycopy(arr, part1.length, part2, 0, part2.length);
            Thread t1 = new Thread(() -> {
                System.out.println("первая половинка начало: ");
            for (int i = 0; i < part1.length; i++) {
                part1[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                        Math.cos(0.4f + i / 2));
            }
                System.out.println("первая половинка конец: ");
            });
            Thread t2 = new Thread(() -> {
                System.out.println("вторая половинка начало: ");
            for (int i = 0, j = HALF; i < part2.length; i++) {
                part2[i] = (float) (arr[i] * Math.sin(0.2f + (i + j) / 5) * Math.cos(0.2f + (i + j) / 5) *
                        Math.cos(0.4f + (i + j) / 2));
            }
                System.out.println("вторая половинка конец: ");
            });
            t1.start();
            t2.start();
            try {
                t1.join();
                t2.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.arraycopy(part1, 0, arr, 0, part1.length);
            System.arraycopy(part2, 0, arr, part1.length, part2.length);
            System.out.println("method2: " + (System.currentTimeMillis() - a));
        }
    }


