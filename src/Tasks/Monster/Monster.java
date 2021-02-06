package Tasks.Monster;

public abstract class Monster extends Entity implements Fighter {

    private int force;
    private int hp = 15;

    public Monster(String name, int force) {
        super(name);
        this.force = force;
    }

    protected int getForce(){
        return force;
    }
}