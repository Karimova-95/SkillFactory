package Modul_12;

import java.util.Random;

public class ChickenEgg extends Thread {

    public ChickenEgg(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                // ���������������� �����
                sleep(getTimeSleep());
                System.out.println(getName());
            } catch (InterruptedException e) {
            }
        }
    }

    final Random random = new Random();
    int getTimeSleep() {
        return random.nextInt(300);
    }
}
//    Start the dispute: who appeared first?
//        Egg
//        Chicken
//        Egg
//        Egg
//        Chicken
//        Egg
//        Chicken
//        Chicken
//        Chicken
//        An egg appeared first!
//        The dispute is over
class ChikenApp {

    public static void main(String[] args) {
        // �������� ������� � �������
        ChickenEgg chicken = new ChickenEgg("������");
        ChickenEgg egg = new ChickenEgg("����");
        System.out.println("�������� ����: ��� �������� ������?");
        // ������ �������
        egg.start();
        chicken.start();
        // ���� ��� ������ ��������
        while (chicken.isAlive() || egg.isAlive()) {
            try {
                // ���������������� ����� "�����"
                Thread.sleep(100);
//                System.out.println("������");
            } catch (InterruptedException e) {
            }
        }
        // C������ �� ���� ��������� �����?
        if (egg.isAlive()) {
            try {
                // ��������� ����
                egg.interrupt();
                // ����, ���� ���� �������� �������������
                egg.join();
            } catch (InterruptedException e) {
            }

            System.out.println("������ ��������� ����!");
        } else {
            try {
                // ��������� ������
                chicken.interrupt();
                // ����, ���� ������ �������� �������������
                chicken.join();
            } catch (InterruptedException e) {
            }
            System.out.println("������ ��������� ������!");
        }
        System.out.println("���� ��������");
    }
}