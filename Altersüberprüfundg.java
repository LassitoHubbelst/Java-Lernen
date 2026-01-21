
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Altersüberprüfundg {

    // Berechnet das Alter (in ganzen Jahren) zwischen geburtsdatum und bezugsdatum
    public static int berechneAlter(LocalDate geburtsdatum, LocalDate bezugsdatum) {
        if (geburtsdatum == null || bezugsdatum == null) {
            throw new IllegalArgumentException("Datum darf nicht null sein");
        }
        if (bezugsdatum.isBefore(geburtsdatum)) {
            throw new IllegalArgumentException("Bezugsdatum darf nicht vor dem Geburtsdatum liegen");
        }
        return Period.between(geburtsdatum, bezugsdatum).getYears();
    }

    // Überladung: Alter zum heutigen Datum
    public static int berechneAlter(LocalDate geburtsdatum) {
        return berechneAlter(geburtsdatum, LocalDate.now());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Eingabe im Deutschen Datumsformat (dd.MM.yyyy)
        System.out.println("Bitte gib dein Geburtsdatum im Format dd.MM.yyyy ein (z.B. 20.11.2000):");
        String eingabe = scanner.nextLine().trim();

        try {
            // Parsing des Datums im deutschen Format mit der localDate Klasse
            java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate geburtsdatum = LocalDate.parse(eingabe, formatter);
            int alter = berechneAlter(geburtsdatum);
            System.out.println("Berechnetes Alter: " + alter + " Jahre");
            if (alter >= 18) {
                System.out.println("Status: Volljährig (>= 18), super du hast es geschafft!");
            } else {
                System.out.println("Status: Minderjährig (< 18): Dummkopf, gib doch einfach was älteres ein!");
            }
        } catch (DateTimeParseException e) {
            System.out.println("Ungültiges Datum. Bitte das Format yyyy-MM-dd verwenden.");
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}