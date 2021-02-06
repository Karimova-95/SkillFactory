package Tasks.StaticNestedClasses;

public class MotherBoard {

    USB usb = new USB(2, 3);

    public static void main(String[] args) {
        // создаем объект типа MotherBoard
        MotherBoard mb = new MotherBoard();
// работаем с объектом вложенного класса
        System.out.println("Total Ports = " + mb.usb.getTotalPorts());
        System.out.println("Wikipedia about USB: " + MotherBoard.USB.wikilink);
    }

    // static nested class
    static class USB{
        public static String wikilink = "https://en.wikipedia.org/wiki/USB";
        int usb2;
        int usb3;
        int getTotalPorts(){
            return usb2 + usb3;
        }
        USB(int usb2, int usb3){
            this.usb2 = usb2;
            this.usb3 = usb3;
        }
    }
}
