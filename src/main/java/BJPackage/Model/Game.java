package BJPackage.Model;

public class Game {
    Board board;

    public Game() {
        board = new Board();

    }

    public void shuffeDeckCard() {
        board.getDeck().shuffle();
    }

    private void addCardPlayer() {
        board.giveCardPlayer();
        board.giveBankCard();

    }

    public void giveCard() {
        addCardPlayer();
    }
    public int scorePlayer(Player player){
        return 0;
    }


}
