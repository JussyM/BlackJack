package BJPackage.Model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

import java.util.Random;

public class Game {
    private Deck deck;
    private Player player;
    private Bank bank;

    public Deck getDeck() {
        return deck;
    }

    public Player getPlayer() {
        return player;
    }

    /**
     *
     */
    public Game() {
        deck = new Deck();
        player = new Player();
        bank = new Bank();

    }

    public Bank getBank() {
        return bank;
    }

    /**
     *
     */
    public void shuffeDeckCard() {
        deck.shuffle();
    }

    public void calculateScore() {
        player.calculScore();
        bank.calculScore();
        playerState();
    }

    public void miseBank() {
        getBank().insertMise(player.getMise() * (int) (Math.random() * 10) + 5);

    }

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
     *
     */
    private void addCardPlayers() {
        giveCardPlayer();
        giveBankCard();

    }

    /**
     *
     */
    public void giveCard() {
        addCardPlayers();
    }

    /**
     * @param player
     * @return
     */
    public int scorePlayer(Player player) {
        if (player instanceof Bank) {
            return bank.getScore();
        } else {
            return this.player.getScore();
        }
    }


    public boolean win() {
        return player.getState() == State.WIN || bank.getState() == State.WIN;

    }

    private void playerState() {
        if (player.getScore() <= 21 && player.getScore() > bank.getScore()) {
            player.setState(State.WIN);
        }
        if (bank.getScore() < player.getScore() || bank.getScore() <= 21) {
            bank.setState(State.WIN);
        }
    }

    /**
     *
     */
    public Card askCard() {
        return getDeck().hit();


    }

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
