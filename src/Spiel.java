public class Spiel {
    private Spieler[] spielerListe;
    private Wuerfel wuerfel;
    public Spiel(int anzahlSpieler) {
        if (anzahlSpieler > 0) {
            spielerListe = new Spieler[anzahlSpieler];
            wuerfel = new Wuerfel();
        } else {
                  System.out.println("Die Anzahl der Spieler muss >0 sein.");
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
        System.out.println("Zahl gewuerfelt:");
        if (spielerListeVoll()) {
            for (Spieler spieler : spielerListe) {
                int gewuerfelteZahl = wuerfel.wuerfeln();
                spieler.setZahl(gewuerfelteZahl);

                System.out.println(spieler.getName() +" " + gewuerfelteZahl);
            }
        } else {
            System.out.println("Die Liste ist noch nicht voll,das Spiel kann nicht starten.es felt noch spieler");
        }
    }
    public boolean spielerListeVoll() {
        for (Spieler spieler : spielerListe) {
            if (spieler == null) {
                return false;
            }
        }
        return true;
    }
    @Override
    public String toString() {
        String result = "Spielerliste:\n";
        for (Spieler spieler : spielerListe) {
            if (spieler != null) {
                result += spieler.getName() + ": " + spieler.getZahl() + "\n";
            }
        }
        return result;
    }
    public void sortBeste() {
        if (spielerListeVoll())
        {
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
