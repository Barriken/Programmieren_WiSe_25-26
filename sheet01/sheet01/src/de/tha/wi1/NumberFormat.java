package de.tha.wi1;

public class NumberFormat {

    public static void main(String[] args) {
    	
        int number = 1;
        int secondNumber = 42;
        float floatNumber = 42.3456f;

        System.out.println("Formatierte Ausgaben sind mit System.out.format() möglich:\n");
        
        System.out.format("Zahl mit führenden Nullen (Breite 4): %04d%n", number);
        
        System.out.println("\n=== Beispiele für Zahlenformatierung ===\n");

        // Ganze Zahlen
        System.out.format("Einfache Zahl: %d%n", number);
        System.out.format("Mit führenden Leerzeichen (Breite 4): \"%4d\"%n", number);
        System.out.format("Mit führenden Nullen (Breite 4):     \"%04d\"%n", number);
        System.out.format("Mehrere Zahlen gleichzeitig: %06d und %08d%n", number, secondNumber);

        System.out.println("\n=== Beispiele für Gleitkommazahlen ===\n");

        // Gleitkommazahlen
        System.out.format("Standardausgabe float: %f%n", floatNumber);
        System.out.format("Mit 3 Nachkommastellen: %.3f%n", floatNumber);
        System.out.format("Mit 10 Zeichen Breite und 2 Nachkommastellen: %10.2f%n", floatNumber);

        System.out.println("\n=== Linksbündige Formatierung ===\n");

        // Linksbündig: Minuszeichen (-) vor der Breitenangabe
        System.out.format("Rechtsbündig (Standard):  |%10.2f|%n", floatNumber);
        System.out.format("Linksbündig:              |%-10.2f|%n", floatNumber);

        System.out.println("\n=== Tabellenbeispiel ===\n");

        // Tabellenartige Ausgabe (links- und rechtsbündig kombiniert)
        System.out.format("%-10s | %10s%n", "Artikel", "Preis (€)");
        System.out.println("-----------------------");
        System.out.format("%-10s | %10.2f%n", "Apfel", 1.2);
        System.out.format("%-10s | %10.2f%n", "Banane", 0.95);
        System.out.format("%-10s | %10.2f%n", "Melone", 3.50);

        System.out.println("\n=== Spezialfälle ===\n");

        // Spezialfall
        System.out.format("So gibt man ein Prozentzeichen aus: %% %n");
    }
}