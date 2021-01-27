package BJPackage.Model;

public class Game {
  private   Board board;

    /**
     *
     */
    public Game() {
        board = new Board();

    }

    public Board getBoard() {
        return board;
    }

    /**
     *
     */
    public void shuffeDeckCard() {
        board.getDeck().shuffle();
    }

    /**
     *
     */
    private void addCardPlayer() {
        board.giveCardPlayer();
        board.giveBankCard();

    }

    /**
     *
     */
    public void giveCard() {
        addCardPlayer();
    }

    /**
     * @param player
     * @return
     */
    public int scorePlayer(Player player) {
        if (player instanceof Bank) {
            return bankScore();
        } else {
            return playerScore();
        }
    }

    /**
     * @return
     */
    private int playerScore() {
        var player = board.getPlayer();
        if (strike(player)) return 21;
var score = player.getPlayerCart().stream().mapToInt(x -> x.getValue().getValue()).sum();

        return score > 21 ?
               score= player.getPlayerCart().stream().mapToInt(x -> x.getValue().getSndValue()).sum() : score;
    }

    /**
     * @return
     */
    private int bankScore() {
        return board.getBank().getPlayerCart().stream().mapToInt(x -> x.getValue().getValue()).sum();
    }

    /**
     * @param player
     * @return
     */
    private boolean strike(Player player) {
        return player.getPlayerCart().contains(new Card(Color.SPADE, Value.ACE)) &&
                (player.getPlayerCart().contains(new Card(Color.SPADE, Value.KING)) ||
                        (player.getPlayerCart().contains(new Card(Color.SPADE, Value.QUEEN)) ||
                                (player.getPlayerCart().contains(new Card(Color.SPADE, Value.TEN)) ||
                                        (player.getPlayerCart().contains(new Card(Color.SPADE, Value.JACK))))));
    }


    public void askCard(Card card){
        board.getPlayer().addCart(card);

    }

}
