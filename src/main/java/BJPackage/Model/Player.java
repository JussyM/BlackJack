package BJPackage.Model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final List<Card> playerCart;
    private int mise;

    public int getMise() {
        return mise;
    }

    /**
     *
     */
    public Player() {
        playerCart = new ArrayList<>();

    }
    public void insertMise(int mise){this.mise=mise;}

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
