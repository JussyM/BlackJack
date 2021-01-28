package BJPackage.Model;

import java.util.Objects;

public class Card {
    private Color color;
    private Value value;
    private boolean userSndValue;

    /**
     * getter for color
     *
     * @return color
     */

    public Color getColor() {
        return color;
    }

    /**
     * getter for value
     *
     * @return value
     */
    public Value getValue() {
        return value;
    }

    /**
     * constructor for Card
     *
     * @param color
     * @param value
     */
    public Card(Color color, Value value) {
        if (color == null || value == null) throw new IllegalArgumentException("Argument null");
        this.color = color;
        this.value = value;
        this.userSndValue = false;
    }

    /**
     * return the card into String
     *
     * @return string
     */
    @Override
    public String toString() {
        return value.name() + " de " + color.getName();
    }

    /**
     * equal method override
     *
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return getColor() == card.getColor() && getValue() == card.getValue();
    }

    /**
     * hashCode of the class
     *
     * @return Integer
     */
    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getValue());
    }

    public boolean isUserSndValue() {
        return userSndValue;
    }

    public void setUserSndValue(boolean userSndValue) {
        this.userSndValue = userSndValue;
    }
}
