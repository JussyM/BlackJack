package BJPackage.Model;

public class Board {
    private Deck deck;
    private Bank bank;
    private Player player;

    /**
     * Board constructor
     */
    public Board() {
        deck = new Deck();
        bank = new Bank();
        player = new Player();

    }

    /**
     * getter for bank player
     *
     * @return back
     */
    public Bank getBank() {
        return bank;
    }

    /**
     * getter for player itself
     *
     * @return player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * return the deck
     *
     * @return deck
     */
    public Deck getDeck() {
        return deck;
    }

    /**
     * give card to player at the begening
     */
    public void giveCardPlayer() {
        var instance = deck.hit();
        var i = 0;
        while (i <= 1) {
            player.addCart(instance);
            deck.remove(instance);
            instance = deck.hit();
            i++;
        }


    }

    /**
     * give the appropriate card to the bank
     */
    public void giveBankCard() {
        var instance = deck.hit();
        bank.addCart(instance);
        deck.remove(instance);
    }

}
