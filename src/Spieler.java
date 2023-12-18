public class Spieler {
    private String name;
    private int gewuerfelteAugenzahl;

    public Spieler(String name) {
        this.name = name;
        this.gewuerfelteAugenzahl = 0; // Standardmäßig auf 0 setzen, da noch nicht gewürfelt wurde
    }

    public int getZahl() {
        return gewuerfelteAugenzahl;
    }
    public String getName() {
        return name;
    }
    public void setZahl(int n) {
        this.gewuerfelteAugenzahl = n;
    }
}
