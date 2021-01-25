package BJPackage.Model;

public class Board {
    private Deck deck;
    private Bank bank;
    private Player player;

    public Board() {
        deck = new Deck();
        bank = new Bank();
        player = new Player();

    }

    public Bank getBank() {
        return bank;
    }

    public Player getPlayer() {
        return player;
    }

    public Deck getDeck() {
        return deck;
    }

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
    public void giveBankCard(){
        var instance = deck.hit();
        bank.addCart(instance);
    }

}
