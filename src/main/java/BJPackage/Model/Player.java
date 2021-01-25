package BJPackage.Model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final List<Card> playerCart;

    /**
     *
     */
    public Player() {
        playerCart = new ArrayList<>();
    }

    /**
     *
     * @param card
     */
    public void addCart(Card card) {
        playerCart.add(card);
    }

    /**
     *
     * @return
     */
    public List<Card> getPlayerCart() {
        return playerCart;
    }

}
