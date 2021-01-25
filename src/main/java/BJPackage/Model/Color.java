package BJPackage.Model;

public enum Color {
    CLUB("trèfle"), DIAMOND("Carreau"), HEART("Coeur"), SPADE("Pique");
private String name;

   private Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
