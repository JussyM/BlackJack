package BJPackage.Model;

public enum Value {
    ACE(1, 11), TWO(2, 0), THREE(3, 0),
    FOUR(4, 0), FIVE(5, 0), SIX(6, 0),
    SEVEN(7, 0), EIGHT(8, 0), NINE(9, 0),
    TEN(10, 0), JACK(10, 0), QUEEN(10, 0),
    KING(10, 0);
    private final int value;
    private final int sndValue;

    private Value(int value, int sndValue) {
        this.value = value;
        this.sndValue = sndValue;
    }

    /**
     *
     * @return
     */
    public int getValue() {
        return value;
    }

    /**
     *
     * @return
     */
    public int getSndValue() {
        return sndValue;
    }
}
