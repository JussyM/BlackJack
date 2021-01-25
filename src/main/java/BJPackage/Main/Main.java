package BJPackage.Main;

import BJPackage.Model.Deck;

public class Main {
    public static void main(String[] args) {
        Deck d = new Deck();
        int size = d.getCardList().size();
        System.out.println(d.toString());
    }
}
