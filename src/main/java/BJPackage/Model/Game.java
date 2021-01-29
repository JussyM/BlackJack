package BJPackage.Model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

import java.util.Random;

public class Game {
    private final Deck deck;
    private final Player player;
    private final Bank bank;

    /**
     * getter for deck
     *
     * @return deck
     */
    public Deck getDeck() {
        return deck;
    }

    /**
     * getter for player
     *
     * @return player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Constructor for game
     */
    public Game() {
        deck = new Deck();
        player = new Player();
        bank = new Bank();

    }

    /**
     * getter for bank
     *
     * @return bank
     */
    public Bank getBank() {
        return bank;
    }

    /**
     * shuffle the card of the deck
     */
    public void shuffleDeckCard() {
        deck.shuffle();
    }

    /**
     * Calculate the score of each player and update their state
     */
    public void calculateScore() {
        player.calculScore();
        bank.calculScore();
        playerState();
    }

    /**
     * give a mise to the player
     */
    public void miseBank() {
        getBank().insertMise(player.getMise() * (int) (Math.random() * 10) + 5);

    }

    /**
     * calculate the gain of the winner
     *
     * @return gain
     */
    public int calculDeGain() {
        Player instance;
        if (getPlayer().getState() == State.WIN) {
            instance = getPlayer();
            instance.insertMise(bank.getMise() + instance.getMise());
        } else {
            instance = getBank();
            instance.insertMise(player.getMise() + instance.getMise());
        }
        return instance.getMise();
    }

    /**
     * give card to each player
     */
    private void addCardPlayers() {
        giveCardPlayer();
        giveBankCard();

    }

    /**
     * call addCardPlayers()
     */
    public void giveCard() {
        addCardPlayers();
    }

    /**
     * return the win of the game
     * @return state
     */
    public boolean win() {
        return player.getState() == State.WIN || bank.getState() == State.WIN;

    }

    /**
     * Update the the player status
     */
    private void playerState() {
        if (player.getScore() <= 21 && player.getScore() > bank.getScore()) {
            player.setState(State.WIN);
        }
        if (bank.getScore() < player.getScore() || bank.getScore() <= 21) {
            bank.setState(State.WIN);
        }
    }

    /**
     * return a card given by the deck
     */
    public Card askCard() {
        return getDeck().hit();


    }

    /**
     * insert a card tho the players
     * @param card
     */
    public void insertCardPlayer(Card card) {
        getPlayer().addCart(card);
        getDeck().remove(card);
        giveBankCard();
    }

    /**
     * give card to player at the beginning
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
