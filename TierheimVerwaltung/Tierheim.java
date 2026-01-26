package TierheimVerwaltung;
import java.util.ArrayList;

public class Tierheim {
    int kapazitaet;
    String name;
    int anzahlTiere;
    ArrayList<Tier> tiere;

    public Tierheim(String n) { //Alle Anfangswerte festgelegt
        this.name = n;
        this.kapazitaet = 100; // Standardkapazität
        this.anzahlTiere = 0;
        this.tiere = new ArrayList<Tier>();
    }
public void aufnehmen(Tier t){ //Methode um Tiere aufzunehmen (erstellt)
    System.out.println(t.name + " (" + t.tierart + ") wurde im " + this.name + " aufgenommen.");
    this.tiere.add(t);
    this.anzahlTiere = this.anzahlTiere + 1;
    this.kapazitaet = this.kapazitaet - this.anzahlTiere;
}
public void vermitteln(Tier t){ //Methode um Tiere zu vermitteln (erstellt Ausgabe und entfernt Tier aus ArrayList)
    System.out.println(t.name + " (" + t.tierart + ") wurde im " + this.name + " vermittelt.");
    this.tiere.remove(t);
    this.anzahlTiere = this.anzahlTiere - 1;
    this.kapazitaet = this.kapazitaet + this.anzahlTiere;
}

public void zeigeAktuelleTiere(){
    System.out.println("\n--- Tiere im " + this.name + " ---");
    if(this.tiere.size() == 0){
        System.out.println("Keine Tiere im Tierheim.");
    } else {
        for(Tier t : this.tiere){
            System.out.println("- " + t.name + " (" + t.tierart + ")");
        }
    }
    System.out.println("---");
}

public String getName() {
    return this.name;
}
}