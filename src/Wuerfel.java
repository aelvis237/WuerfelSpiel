import java.util.Random;

public class Wuerfel {
    // Klassenvariable für die maximale Augenzahl des Würfels
    private static int MAX_AUGENZAHL = 6;

    // Statische Methode zum Initialisieren der MAX_AUGENZAHL
    public static void init(int n) {
        MAX_AUGENZAHL = n;
    }

    // Statische Methode zum Würfeln einer Zahl zwischen 1 und MAX_AUGENZAHL
    public static int wuerfeln() {
        Random random = new Random();
        return random.nextInt(MAX_AUGENZAHL) + 1;
    }
}
