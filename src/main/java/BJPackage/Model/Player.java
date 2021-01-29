package BJPackage.Model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final List<Card> playerCart;
    private int mise;
    private int score;
    private State state;

    /**
     *
     * @return
     */
    public int getScore() {
        return score;
    }

    /**
     *
     * @return
     */
    public int getMise() {
        return mise;
    }

    /**
     *
     */
    public Player() {
        playerCart = new ArrayList<>();
        this.mise = 0;
        this.score = 0;
        this.state=null;

    }

    /**
     *
     * @return
     */
    public State getState() {
        return state;
    }

    /**
     *
     * @param state
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Principal player";
    }

    public void insertMise(int mise) {
        this.mise = mise;
    }

    /**
     * @param card
     */
    public void addCart(Card card) {
        playerCart.add(card);
    }

    /**
     * @return
     */
    public List<Card> getPlayerCart() {
        return playerCart;
    }

    /**
     *
     */
    public void calculScore() {
        this.score = playerScore();

    }

    /**
     *
     * @return
     */
    private int playerScore() {
        if (strike()) return 21;
        var score = getPlayerCart().stream().mapToInt(x -> x.getValue().getValue()).sum();

        return score > 21 ?
                score = getPlayerCart().stream().mapToInt(x -> x.getValue().getSndValue()).sum() : score;
    }

    /**
     * @param player
     * @return
     */
    private boolean strike() {
        return this.getPlayerCart().contains(new Card(Color.SPADE, Value.ACE)) &&
                (this.getPlayerCart().contains(new Card(Color.SPADE, Value.KING)) ||
                        (this.getPlayerCart().contains(new Card(Color.SPADE, Value.QUEEN)) ||
                                (this.getPlayerCart().contains(new Card(Color.SPADE, Value.TEN)) ||
                                        (this.getPlayerCart().contains(new Card(Color.SPADE, Value.JACK))))));
    }


}
