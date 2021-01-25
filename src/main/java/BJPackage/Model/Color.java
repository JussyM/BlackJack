package BJPackage.Model;

public enum Color {
    CLUB("trèfle"), DIAMOND("Carreau"), HEART("Coeur"), SPADE("Pique");
    private final String name;

    private Color(String name) {
        this.name = name;
    }

    /**
     * getter for the name
     *
     * @return name
     */
    public String getName() {
        return name;
    }
}
