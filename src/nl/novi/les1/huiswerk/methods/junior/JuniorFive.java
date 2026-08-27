package nl.novi.les1.huiswerk.methods.junior;

/**
 * Deze klasse is helemaal leeg, je mag nu dus alles zelf doen.
 * Maak een methode die een String ontvangt en deze in HOOFDLETTERS uitprint.
 * Bedenk zelf een goede Engelse naam voor de methode.
 * <p>
 * Hoe maak je hoofdletters van een String in Java?
 * https://duckduckgo.com/?q=java+to+uppercase
 */

public class JuniorFive {
    public static void main() {
        String str = "Hallo";
        System.out.println(toUpper(str));
    }

    private static String toUpper(String str) {
        return str.toUpperCase();
    }
}
