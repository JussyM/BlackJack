package BJPackage.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cardList;

    public Deck() {
        cardList = new ArrayList<>();
        Value values;
        for (int i = 1; i <= 13; i++) {
            values = Value.next(i);
            cardList.add(new Card(Color.CLUB, values));
            cardList.add(new Card(Color.DIAMOND, values));
            cardList.add(new Card(Color.HEART, values));
            cardList.add(new Card(Color.SPADE, values));

        }
    }

    public List<Card> getCardList() {
        return cardList;
    }

    /**
     *
     */
    public void shuffle() {
        Collections.shuffle(cardList);
    }

    public boolean isEmpty() {
        return cardList.isEmpty();}

    public Card hit() {
        return getCard();
    }

    public boolean remove(Card card) {
        return cardList.remove(card);
    }

    private Card getCard() {
        return cardList.get(0);
    }

    @Override
    public String toString() {
        return "Liste des cartes du paquet : \n" + cardList.toString();
    }
}
