package Tasks.Monster;

public abstract class Entity {
    private String name;
    private boolean destroyed = false;
    private int hp;

    public Entity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isDestroyed(){
        return destroyed;
    }

    protected boolean damage(int dhp){
        hp -= dhp;
        if (hp < 0){
            destroyed = true;
            System.out.println("Monster " + getName() + " was destroyed");
            return true;
        }
        return false;
    }

}