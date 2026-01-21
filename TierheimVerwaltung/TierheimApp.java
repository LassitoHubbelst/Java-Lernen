package TierheimVerwaltung;

public class TierheimApp {
    public static void main(String[] args) {
        Tierheim tierheim = new Tierheim("HTH");
        Tier t1 = new Tier("Hund", "Bello");
        Tier t2 = new Tier("Katze", "Mia");
        Tier t3 = new Tier("Hase", "Luna");

        tierheim.aufnehmen(t1);
        tierheim.aufnehmen(t2);
        tierheim.vermitteln(t1);
        tierheim.aufnehmen(t3);
    }
}