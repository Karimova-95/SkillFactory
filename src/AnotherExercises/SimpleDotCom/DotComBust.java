package AnotherExercises.SimpleDotCom;

import java.util.ArrayList;
import java.util.List;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private List<DotCom> dotComList = new ArrayList<>(3);
    private int numOfGuesses = 0;

    private void setUpGame() {
        DotCom one = new DotCom("Pets.com");
        DotCom two = new DotCom("eToys.com");
        DotCom three = new DotCom("Go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("Ваша цель - потопить три \"сайта\"." +
                "\nPets.com, eToys.com, Go2.com" +
                "\nПопытайтесь потопить их за минимальное количество ходов");

        for (DotCom dotComToSet : dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Сделай ход");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "Мимо";
        for (DotCom dotComToTest : dotComList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("Попал"))
                break;
            if (result.equals("Потопил")) {
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);

    }


    private void finishGame() {
        System.out.println("Все \"сайты\" ушли ко дну! Ваши акции теперь ниего не стоят.");
        if (numOfGuesses <= 18) {
            System.out.println("Это заняло у вас всего " + numOfGuesses + " попыток." +
                    "\nВы успели выбраться до того, как ваши вложения утонули.");
        } else {
            System.out.println("Это заняло у вас довольно много времени. " + numOfGuesses + "попыток." +
                    "\nРыбы водят хороводы вокруг ваших вложений.");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
