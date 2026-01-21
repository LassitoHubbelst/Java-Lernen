package TierheimVerwaltung;
public class Tierheim {
    int kapazitaet;
    String name;
    int anzahlTiere;

    public Tierheim(String name) {
        this.name = name;
        this.kapazitaet = 100; // Standardkapazität
        this.anzahlTiere = 0;
    }
public void aufnehmen(Tier t){
    System.out.println(this.name + " aufgenommen.");
    this.anzahlTiere = this.anzahlTiere + 1;
    this.kapazitaet = this.kapazitaet - anzahlTiere;
}
public void vermitteln(Tier t){
    System.out.println(this.name + " vermittelt.");
    this.anzahlTiere = this.anzahlTiere - 1;
    this.kapazitaet = this.kapazitaet + anzahlTiere;
}
}