package Vector;

public class MainApp {
    public static void main(String[] args) {
        var vec1 = new Vector(3, 5, 6);
        var vec2 = new Vector(-3, 4, 2);

        System.out.println(vec1.vectorLength());
        System.out.println(vec2.vectorLength());
        System.out.println(vec1.scalarProduct(vec2));
        System.out.println(vec1.crossProduct(vec2));
        System.out.println(vec1.angle(vec2));
        System.out.println(vec1.add(vec2));
        System.out.println(vec2.subtract(vec2));
    }


}
