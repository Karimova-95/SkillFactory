package Homework.Monster;

public class Battle {
//    Monster[] monsters = new Monster[5];
//    private static int index = 0;
//    public void add (Monster monster) {
//        int n = index;
//        if (n < 5) {
//            monsters[n] = monster;
//            index++;
//        } else System.out.println("No more monsters!");
//    }
//
//    public void start() {
//        run();
//    }
//
//    public void run() {
//        for (Monster monster : monsters) {
//            monster.attack();
//        }
//
//    }
final static private int MAX = 5;

    private Monster[] monsters;
    private int n = 0;

    Battle(){
        monsters = new Monster[MAX];
    }

    public void add(Monster monster){
        if (n < MAX) {
            monsters[n++] = monster;
        }
        else{
            System.out.println("No more monsters!");
        }
    }

    public void run(){
        for (int i = 0; i < n; i++) {
            if (monsters[i] != null){
                monsters[i].attack();
            }
        }
    }

    public void start(){
        run();
    }
}
