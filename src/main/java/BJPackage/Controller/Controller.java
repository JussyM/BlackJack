package BJPackage.Controller;

import BJPackage.Model.Board;
import BJPackage.Model.Game;
import BJPackage.View.View;
import BJPackage.View.ViewInterface;

public class Controller {
    private Game game;
    private ViewInterface view;

    public Controller() {
        this.game = new Game();
        this.view = new View();
    }

    public void play() {
        view.printWelcomeMsg();
        var mise = view.askBet();
        game.getPlayer().insertMise(mise);
        game.getBank().insertMise(mise*2);
        view.printMsg("La banque mise: "+game.getBank().getMise());
        view.printMsg("Melange des cartes");
        game.shuffeDeckCard();
        game.giveCard();
        do {
            view.displayCard(game);
            var answer = view.askInfo();
            view.decision(game, answer);
        }
        while (!game.win());
        view.printWinner(game);
        view.printWinnerMise(game.calculDeGain());


    }
}
