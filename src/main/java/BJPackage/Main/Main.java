package BJPackage.Main;

import BJPackage.Model.Game;
import BJPackage.View.Emoji;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < Emoji.ACTIVITY.length; i++) {
            System.out.println("------");
            System.out.println("| "+" "+"  |");
            System.out.println("| "+ Emoji.PEOPLE[i]+" |");
            System.out.println("| "+" "+"  |");
            System.out.println("------");
        }
        }



}
