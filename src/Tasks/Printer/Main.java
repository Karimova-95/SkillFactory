package Tasks.Printer;

import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        CoolPrinter.add("One, two,");
        CoolPrinter.add("I love you.");
        CoolPrinter.add("Three, four,");
        CoolPrinter.add("Touch the floor.");
        CoolPrinter.print(new Formatter());
//        CoolPrinter.print(new Formatter(){
//            public String format(String s){
//                return "** " + s + " **";
//            }
//        });
    }
}
