package BJPackage.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test
    void giveCard() {
        Game g = new Game();
        g.giveCard();
        g.shuffleDeckCard();
        var playerNbCard = g.getPlayer().getPlayerCart().size();
        var bankNbCard = g.getBank().getPlayerCart().size();
        assertEquals(2, playerNbCard);
        assertEquals(1, bankNbCard);

    }

    @Test
    void scorePlayerWhenWinStrike() {
        Game g = new Game();
        g.shuffleDeckCard();
        g.giveCard();
        //g.askCard(new Card(Color.SPADE, Value.ACE));
        //g.askCard(new Card(Color.SPADE, Value.JACK));
        var score = g.scorePlayer(g.getPlayer());
        assertEquals(21, score);
    }

    @Test
    void scorePlayerWhenFail() {
        Game g = new Game();
        //g.shuffeDeckCard();
        g.giveCard();
        var score = g.scorePlayer(g.getPlayer());
        assertEquals(2, score);

    }
}