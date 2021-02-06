package Tasks.Monster;

import java.util.ArrayList;

public class Player extends Human {
    private ArrayList<String> thing = new ArrayList<>();
    Backpack backpack;
    private boolean isEmpty;
    public Player(String name) {
        super(name);
        backpack = new Backpack();
    }
    public void take (String str) {
        thing.add(str);
    }

    class Backpack {
        @Override
        public String toString() {
            if (thing.size() == 0) {
                return "he backpack is empty";
            } else {
                for (String s : thing) {
                    if (thing.indexOf(s) == thing.size() - 1) {
                        System.out.print(s);
                    } else {
                        System.out.print(s + ",");
                    }
                }

                return  " in the backpack";
            }
        }
    }
}
