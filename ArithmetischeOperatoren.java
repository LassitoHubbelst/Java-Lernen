import java.util.Scanner;
public class ArithmetischeOperatoren {
    public static void main(String[] args) {
    // Scanner-Objekt für die Eingabe
    Scanner scanner = new Scanner(System.in);

    // Benutzer zur Eingabe von zwei Ganzzahlen auffordern
    System.out.print("Geben Sie die erste Ganzzahl ein: ");
    int zahl1 = scanner.nextInt();

    System.out.print("Geben Sie die zweite Ganzzahl ein: ");
    int zahl2 = scanner.nextInt();

    //Berechnungen durchführen
    int addition = zahl1 + zahl2;
    int subtraktion = zahl1 - zahl2;
    int multiplikation = zahl1 * zahl2;

    //Ergebnisse ausgeben
    System.out.println("Addition: " + addition);
    System.out.println("Subtraktion: " + subtraktion);
    System.out.println("Multiplikation: " + multiplikation);
    
    // Überprüfen, ob die Division durch null vermieden wird
    if (zahl2 !=0) {
        float division = (float) zahl1 / zahl2; // Division als Gleitkommazahl

        System.out.println("Division: " + division);
    } else {
        System.out.println("Die Division durch null ist nicht erlaubt");
    }

    //Scanner schließen
    scanner.close();
    }
}