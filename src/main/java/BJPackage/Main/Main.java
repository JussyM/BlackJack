package BJPackage.Main;

import BJPackage.Model.Deck;
import BJPackage.Model.Game;

public class Main {
    public static void main(String[] args) {
        Game g = new Game();
        g.shuffeDeckCard();
        g.giveCard();
        var score = g.scorePlayer(g.getBoard().getPlayer());
        System.out.println(score);
    }
}
