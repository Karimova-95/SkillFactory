package Tasks.Animal_Zoo;

public class PopcornStall implements Soundable{

    @Override
    public String toString() {
        return "I'm a popcorn stall";
    }

    @Override
    public void sound() {
        System.out.println("Hey! I'm testful popkorn");
    }
}
