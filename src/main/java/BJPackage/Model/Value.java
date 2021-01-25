package BJPackage.Model;

public enum Value {
    ACE(1, 11), TWO(2, 0), THREE(3, 0),
    FOUR(4, 0), FIVE(5, 0), SIX(6, 0),
    SEVEN(7, 0), EIGHT(8, 0), NINE(9, 0),
    TEN(10, 0), JACK(0, 0), QUEEN(10, 0),
    KING(0, 0);
    private final int value;
    private final int sndValue;

    private Value(int value, int sndValue) {
        this.value = value;
        this.sndValue = sndValue;
    }

    public int getValue() {
        return value;
    }

    public int getSndValue() {
        return sndValue;
    }

    /**
     * @param value
     * @return
     */
    public static Value next(int value) {
        Value instance = null;
        var i = 0;
        var found = false;
        while (i < values().length && !found) {
            if (values()[i].getValue() == value) {
                instance = values()[i];
                found = true;
            }
            i++;
        }
        return instance;
    }
}
