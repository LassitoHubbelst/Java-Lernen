
import java.util.Scanner;
import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Altersüberprüfundg {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie ihr Alter ein: ");
        int zahl1 = scanner.nextInt();

        System.out.print("Geben Sie ihr Geburtsdatum ein:");
        String GebDatumString = scanner.next();//Kontrolliert nächste Eingabe
        
        int multiplikation1 = zahl1 * 1;
        int multiplikation2 = zahl2 * 1;
        String Space = " != ";//Leertaste als Platzhalter + Ungleich
        char Leer = 32;//Zeichen Leertaste in ASCII 
        Date now = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.GERMANY); //Datum Schreibweise
        try {
            Date GebDatum = df.parse(GebDatumString);

            long diffMillis = now.getTime() - GebDatum.getTime(); // Differenz in Millisekunden
        long diffSeconds = diffMillis / 1000;
        long diffMinutes = diffMillis / (1000 * 60);
        long diffYears = diffMillis / (1000 * 60 * 60 * 24 * 365);//Berechnung der Jahre

        System.out.println("Differenz in Millisekunden: " + diffMillis);
        System.out.println("Differenz in Sekunden: " + diffSeconds);
        System.out.println("Differenz in Minuten: " + diffMinutes);
        System.out.println("Differenz in Jahren: " + diffYears);

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (zahl1 >=18) {
            
            System.out.println("1. Bestanden: "+multiplikation1);
            
        } else {
            System.out.println("Durchgefallen?! 18>"+multiplikation1);
        }
        
        if (zahl1 >=18) {
            
            System.out.println("2. Bestanden: "+multiplikation2);
        } else {
            System.out.println("Gib doch einfach was größer als 18 ein! 18>");
        }
        
        scanner.close();
    }
}