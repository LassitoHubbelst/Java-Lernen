import java.util.Scanner;

public class Zahlenraten {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("=== Zahlenraten (2 Spieler) ===");

		// Spieler 1: geheime Zahl eingeben (zwischen 1 und 10)
		int geheimeZahl = 0;
		while (true) {
			System.out.print("Spieler 1, wähle eine Zahl zwischen 1 und 10: ");
			if (!scanner.hasNextInt()) {
				System.out.println("Ungültige Eingabe. Bitte eine Ganzzahl eingeben.");
				scanner.next(); // ungültiges token wegwerfen
				continue;
			}
			geheimeZahl = scanner.nextInt();
			if (geheimeZahl >= 1 && geheimeZahl <= 10) {
				break;
			}
			System.out.println("Die Zahl muss zwischen 1 und 10 liegen. Versuch erneut.");
		}

		System.out.println();
		System.out.println("Bitte Spieler 2, schau jetzt her. Spieler 1 bitte wegsehen oder den Bildschirm verdecken.");
		// Ein paar Zeilen ausgeben, damit die vorherige Eingabe nicht sofort sichtbar bleibt
		for (int i = 0; i < 30; i++) System.out.println();

		// Spieler 2 hat drei Versuche
		final int maxVersuche = 3;
		boolean gewonnen = false;

		System.out.println("Spieler 2: Du hast " + maxVersuche + " Versuche, die Zahl von Spieler 1 zu erraten (1-10). Viel Erfolg!");

		int versuch = 0;
		while (versuch < maxVersuche) {
			System.out.print("Versuch " + (versuch + 1) + ": Rate eine Zahl zwischen 1 und 10: ");
			if (!scanner.hasNextInt()) {
				System.out.println("Ungültige Eingabe. Bitte eine Ganzzahl eingeben.");
				scanner.next();
				continue; // zählt nicht als Versuch
			}
			int tipp = scanner.nextInt();
			if (tipp < 1 || tipp > 10) {
				System.out.println("Die Zahl muss zwischen 1 und 10 liegen. Dieser Versuch wird nicht gezählt.");
				continue; // zählt nicht als Versuch
			}

			versuch++;

			if (tipp == geheimeZahl) {
				System.out.println("Richtig! Du hast die Zahl in " + versuch + " Versuch(en) erraten. 🎉");
				gewonnen = true;
				break;
			} else if (tipp < geheimeZahl) {
				System.out.println("Zu niedrig.");
			} else {
				System.out.println("Zu hoch.");
			}

			System.out.println("Verbleibende Versuche: " + (maxVersuche - versuch));
		}

		if (!gewonnen) {
			System.out.println("Schade, du hast alle Versuche aufgebraucht. Die gesuchte Zahl war: " + geheimeZahl);
		}

		System.out.println("=== Spiel beendet ===");
		scanner.close();
	}
}
