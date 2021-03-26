package Tasks.Collections.Card;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Card card1 = new Card("Червы", "6");
        Card card2 = new Card("Червы", "7");
        Card card3 = new Card("Червы", "8");
        Card card4 = new Card("Червы", "9");
        Card card5 = new Card("Червы", "10");
        Card card6 = new Card("Червы", "J");
        Card card7 = new Card("Червы", "D");
        Card card8 = new Card("Червы", "K");
        Card card9 = new Card("Червы", "T");
        Card card11 = new Card("Пики", "6");
        Card card22 = new Card("Пики", "7");
        Card card33 = new Card("Пики", "8");
        Card card44 = new Card("Пики", "9");
        Card card55 = new Card("Пики", "10");
        Card card66 = new Card("Пики", "J");
        Card card77 = new Card("Пики", "D");
        Card card88 = new Card("Пики", "K");
        Card card99 = new Card("Пики", "T");
        Card crd1 = new Card("Бубны", "6");
        Card crd2 = new Card("Бубны", "7");
        Card crd3 = new Card("Бубны", "8");
        Card crd4 = new Card("Бубны", "9");
        Card crd5 = new Card("Бубны", "10");
        Card crd6 = new Card("Бубны", "J");
        Card crd7 = new Card("Бубны", "D");
        Card crd8 = new Card("Бубны", "K");
        Card crd9 = new Card("Бубны", "T");
        Card crd11 = new Card("Трефы", "6");
        Card crd22 = new Card("Трефы", "7");
        Card crd33 = new Card("Трефы", "8");
        Card crd44 = new Card("Трефы", "9");
        Card crd55 = new Card("Трефы", "10");
        Card crd66 = new Card("Трефы", "J");
        Card crd77 = new Card("Трефы", "D");
        Card crd88 = new Card("Трефы", "K");
        Card crd99 = new Card("Трефы", "T");

        Set<Card> cardSet = new HashSet<>();
        cardSet.add(card1);
        cardSet.add(card2);
        cardSet.add(card3);
        cardSet.add(card4);
        cardSet.add(card5);
        cardSet.add(card6);
        cardSet.add(card7);
        cardSet.add(card8);
        cardSet.add(card9);
        cardSet.add(card11);
        cardSet.add(card22);
        cardSet.add(card33);
        cardSet.add(card44);
        cardSet.add(card55);
        cardSet.add(card66);
        cardSet.add(card77);
        cardSet.add(card88);
        cardSet.add(card99);
        cardSet.add(crd1);
        cardSet.add(crd2);
        cardSet.add(crd3);
        cardSet.add(crd4);
        cardSet.add(crd5);
        cardSet.add(crd6);
        cardSet.add(crd7);
        cardSet.add(crd8);
        cardSet.add(crd9);
        cardSet.add(crd11);
        cardSet.add(crd22);
        cardSet.add(crd33);
        cardSet.add(crd44);
        cardSet.add(crd55);
        cardSet.add(crd66);
        cardSet.add(crd77);
        cardSet.add(crd88);
        cardSet.add(crd99);

        System.out.println(cardSet.size());


    }
}
