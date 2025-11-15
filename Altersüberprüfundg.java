
import java.util.Scanner;
public class Altersüberprüfundg {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie ihr Alter ein: ");
        int zahl1 = scanner.nextInt();

        System.out.print("Zwei Faktor, Geben Sie es nochmal ein: ");
        int zahl2 = scanner.nextInt();
        
        int multiplikation1 = zahl1 * 1;
        int multiplikation2 = zahl2 * 1;

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
        
        if (zahl1 !=zahl2) {
            
            System.out.println("Du musst das Gleiche Eingeben😊"+multiplikation2);
        } else {
            System.out.println("Wenigstentens Zwei faktor geschaftft");
        }
        scanner.close();
    }
}
