package BJPackage.Model;

import BJPackage.View.Emoji;

public enum Color {
    CLUB("trèfle", Emoji.SYMBOLS[52]),
    DIAMOND("Carreau", Emoji.SYMBOLS[51]),
    HEART("Coeur", Emoji.SYMBOLS[50]),
    SPADE("Pique", Emoji.SYMBOLS[49]);
    private final String name;
    private final String emoji;

    private Color(String name, String emoji) {
        this.name = name;
        this.emoji = emoji;
    }

    /**
     * getter for the name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    public String getEmoji() {
        return emoji;
    }
}
