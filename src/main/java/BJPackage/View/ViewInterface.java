package BJPackage.View;

import BJPackage.Model.Board;
import BJPackage.Model.Card;
import BJPackage.Model.Game;
import BJPackage.Model.Player;

public interface ViewInterface {
    char askInfo();

    Card playerCard(Game game);

    void displayCard(Game game);

    void printMsg(String message);

    int askBet();

    void decision(Game game, char answer);

    void printWinner(Game game);
    void printWinnerMise(int mise);

    void printWelcomeMsg();

}
