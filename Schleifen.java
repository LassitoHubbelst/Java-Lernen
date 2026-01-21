import java.util.Scanner;
public class Schleifen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Schleifenübung START ===");
        
        // Eingaber der Zahlen
            System.out.print("Geben Sie die erste Ganzzahl ein: ");
             int zahl1 = scanner.nextInt();

        // --- START: Hier deine Schleifen einfügen ---
        for (int i = 1; i <= zahl1; i++) {
            int addition = i + i;
            System.out.println("Zahl: " + addition);
        }

            // Berechne die Summe aller Zahlen von 1 bis x (x = zahl1)
            if (zahl1 >= 1) {
                int summe = 0;
                for (int i = 1; i <= zahl1; i++) {
                    summe += i;
                }
                System.out.println("Die Summe von 1 bis " + zahl1 + " ist: " + summe);
            } else {
                System.out.println("Bitte geben Sie eine Ganzzahl >= 1 ein.");
            }
            
        // Zum Üben kannst du hier
        // - for-Schleifen
        // - while-Schleifen
        // - do-while-Schleifen
        // - foreach (for-each) verwenden
        //
        // Beispiel (nur als Hinweis, lösche oder kommentiere aus):
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("i = " + i);
        // }
        // --- ENDE: Hier keine weiteren Schleifen einfügen ---

        System.out.println("=== Schleifenübung ENDE ===");
    }

    // Optional: Hilfsmethode zum Testen/Trennen von Übungen
    private static void trenner(String name) {
        System.out.println("---- " + name + " ----");
    }
}