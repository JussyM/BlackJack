package BJPackage.Model;

public class Card {
    private Color color;
    private Value value;

    /**
     * @return
     */

    public Color getColor() {
        return color;
    }

    /**
     * @return
     */
    public Value getValue() {
        return value;
    }

    /**
     * @param color
     * @param value
     */
    public Card(Color color, Value value) {
        if (color == null || value == null) throw new IllegalArgumentException("Argument null");
        this.color = color;
        this.value = value;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String colorName;
        colorName = switch (color) {
            case CLUB -> "trèfle";
            case DIAMOND -> "Carreau";
            case HEART -> "Coeur";
            case SPADE -> "Pique";
        };
        return value.name() +" de "+colorName;
    }
}
