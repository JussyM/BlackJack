package BJPackage.Main;

import BJPackage.Model.Deck;

public class Main {
    public static void main(String[] args) {
        Deck d = new Deck();
        d.shuffle();
        if (args.length > 1) throw new IllegalArgumentException("Argument de trop");
        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            System.out.println(d.getCardList().get(i));
        }
    }
}
