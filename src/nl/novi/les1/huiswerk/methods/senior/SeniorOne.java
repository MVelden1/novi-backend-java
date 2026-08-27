package nl.novi.les1.huiswerk.methods.senior;

import java.util.ArrayList;
import java.util.List;


/**
 * Gegeven: een lijst met namen zonder hoofdletters van klanten.
 * Opdracht: Een luie stagiair heeft alle klanten in het systeem gezet, maar deze kon de Shift-knop niet vinden.
 * Het is aan jou om alle namen van een hoofdletter aan het begin te voorzien. Maak een methode die een List als
 * parameter ontvangt en de inhoud vervolgens van hoofdletters voorziet.
 * <p>
 * Bonus 1: Zorg ervoor dat tussenvoegsels geen hoofdletter krijgen.
 * Bonus 2: Zorg ervoor dat de eerste letter na een '-' wel een hoofdletter krijgt.
 *
 *
 */

public class SeniorOne {
    public static void main(String[] args) {
        List<String> customerNames = fillCustomerNames();
        capitalizeString(customerNames);
    }

    private static List<String> fillCustomerNames() {
        List<String> customerNames = new ArrayList<>();

        customerNames.add("nick piraat");
        customerNames.add("michael jackson");
        customerNames.add("glennis grace");
        customerNames.add("dreetje hazes");
        customerNames.add("robbie williams");
        customerNames.add("michiel de ruyter");
        customerNames.add("sjaak polak");
        customerNames.add("jan van jansen");
        customerNames.add("henk den hartog");
        customerNames.add("mo el-mecky");
        customerNames.add("fredje kadetje");

        return customerNames;
    }

    private static void capitalizeString(List<String> customerNames) {
        for (String customerName : customerNames) {
            String[] nameParts = customerName.split(" ");

            for (int i = 0; i < nameParts.length; i++) {
                if (nameParts[i].equals("de")
                        || nameParts[i].equals("den")
                        || nameParts[i].equals("van")) {
                    continue;
                }
                nameParts[i] = capitalizeWord(nameParts[i]);
            }

            String newCustomerName = String.join(" ", nameParts);
            System.out.println("newCustomerName = " + newCustomerName);
        }
    }

    private static String capitalizeWord(String word) {
        String[] hyphenParts  = word.split("-");

        for (int j = 0; j < hyphenParts .length; j++) {
            hyphenParts [j] = hyphenParts [j].substring(0, 1).toUpperCase()
                    + hyphenParts [j].substring(1).toLowerCase();

        }

        return String.join("-", hyphenParts );
    }
}
