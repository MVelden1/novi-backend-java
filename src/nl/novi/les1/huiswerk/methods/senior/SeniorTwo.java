package nl.novi.les1.huiswerk.methods.senior;

import java.util.HashMap;
import java.util.Map;

/**
 * Lees eerst wat een Map is: https://www.w3schools.com/java/java_hashmap.asp
 * <p>
 * Maak de methode af. Deze moet het Nederlandse woord teruggeven van het Engelse woord.
 * Verzin iets wanneer het Engelse woord niet beschikbaar is.
 */
public class SeniorTwo {

    public static void main(String[] args) {
        Map<String, String> englishDutchWords = new HashMap<>();

        englishDutchWords.put("bottle", "fles");
        englishDutchWords.put("phone", "telefoon");
        englishDutchWords.put("water", "water");
        englishDutchWords.put("bread", "brood");
        englishDutchWords.put("space", "ruimte");
        englishDutchWords.put("flower", "bloem");
        englishDutchWords.put("flour", "bloem");
        englishDutchWords.put("kitchen", "keuken");
        englishDutchWords.put("cup", "beker");
        englishDutchWords.put("screen", "scherm");

        printTranslation(translate(englishDutchWords, "cup"), "cup");
        printTranslation(translate(englishDutchWords, "phone"), "phone");
        printTranslation(translate(englishDutchWords, "space"), "space");
        printTranslation(translate(englishDutchWords, "dog"), "dog");
        printTranslation(translate(englishDutchWords, "flower"), "flower");
        printTranslation(translate(englishDutchWords, "kitchen"), "kitchen");
    }

    public static String translate(Map<String, String> words, String word) {
        return words.getOrDefault(word, "");
    }

    private static void printTranslation(String translation, String word) {
        if (!translation.isEmpty()) {
            System.out.printf("De Nederlandse vertaling van %s is %s.\n", word, translation);
        } else {
            System.out.printf("De vertaling voor %s is op dit moment niet beschikbaar.\n", word);
        }
    }
}
