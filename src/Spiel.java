public class Spiel {
    private Spieler[] spielerListe;
    private Wuerfel wuerfel;

    // Konstruktor
    public Spiel(int anzahlSpieler) {
        if (anzahlSpieler > 0) {
            spielerListe = new Spieler[anzahlSpieler];
            wuerfel = new Wuerfel();
        } else {
            throw new IllegalArgumentException("Die Anzahl der Spieler muss größer als 0 sein.");
        }
    }

    public void addSpieler(Spieler spieler) {
        for (int i = 0; i < spielerListe.length; i++) {
            if (spielerListe[i] == null) {
                spielerListe[i] = spieler;
                return;
            }
        }
        System.out.println("Die Spielerliste ist voll. Es kann kein weiterer Spieler hinzugefügt werden.");
    }
    public void spielen() {
        if (spielerListeVoll()) {
            for (Spieler spieler : spielerListe) {
                int gewuerfelteZahl = wuerfel.wuerfeln();
                spieler.setZahl(gewuerfelteZahl);
                System.out.println(spieler.getName() + " hat eine Augenzahl von " + gewuerfelteZahl);
            }
        } else {
            System.out.println("Die Liste ist noch nicht voll,das Spiel kann nicht starten.es felt noch spieler");
        }
    }
    private boolean spielerListeVoll() {
        for (Spieler spieler : spielerListe) {
            if (spieler == null) {
                return false;
            }
        }
        return true;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Spielerliste:\n");
        for (Spieler spieler : spielerListe) {
            if (spieler != null) {
                result.append(spieler.getName()).append(": ").append(spieler.getZahl()).append("\n");
            }
        }
        return result.toString();
    }
    public void sortBeste() {
        if (spielerListeVoll()) {
            // Extrahiere die gewürfelten Zahlen in ein Array
            int[] gewuerfelteZahlen = new int[spielerListe.length];
            for (int i = 0; i < spielerListe.length; i++) {
                gewuerfelteZahlen[i] = spielerListe[i].getZahl();
            }
            BubbleSort.bubblesort(gewuerfelteZahlen);
            for (int i = 0; i < spielerListe.length; i++) {
                spielerListe[i].setZahl(gewuerfelteZahlen[i]);
            }
        } else {
            System.out.println("Die Spielerliste ist nicht vollständig. Das Sortieren kann nicht durchgeführt werden.");
        }
    }
}
