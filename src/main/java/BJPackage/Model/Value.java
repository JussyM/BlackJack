package BJPackage.Model;

public enum Value {
    ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12),
    KING(13);
    private final int value;

    private Value(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    /**
     *
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
