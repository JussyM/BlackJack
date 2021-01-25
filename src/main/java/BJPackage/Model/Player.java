package BJPackage.Model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final List<Card> playerCart;

    public Player() {
        playerCart = new ArrayList<>();
    }

    public void addCart(Card card) {
        playerCart.add(card);
    }

    public List<Card> getPlayerCart() {
        return playerCart;
    }

    public int score() {

        return 0;
    }
}
