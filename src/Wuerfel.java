import java.util.Random;

public class Wuerfel {
    private static int MAX_AUGENZAHL = 6;


    public static void init(int n) {
        MAX_AUGENZAHL = n;
    }
    public static int wuerfeln() {
        Random random = new Random();
        return random.nextInt(MAX_AUGENZAHL) + 1;
    }
}
