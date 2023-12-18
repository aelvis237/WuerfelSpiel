public class Main {
    public static void main(String[] args) {
        Spiel spiel = new Spiel(5);
        spiel.addSpieler(new Spieler("Anna"));
        spiel.addSpieler(new Spieler("Berta"));
        spiel.addSpieler(new Spieler("Cäsar"));
        spiel.addSpieler(new Spieler("Dennis"));
        spiel.spielen();

        System.out.println(spiel.toString());

        spiel.addSpieler(new Spieler("Emil"));
        spiel.spielen();
        spiel.sortBeste();

        System.out.println(spiel.toString());
    }
}