package kapitel5_Klassen;
// In diesem Tutorial erlernen wir den Umgang mit Klassenmethoden.
// Klassenmethoden sind Methoden, die zu einer bestimmten Klasse gehören.
// Es ist wichtig zu beachten, dass diese Klasse nicht zwingend die Hauptklasse sein muss, welche die Hauptmethode (main) enthält.
// Stattdessen können diese Methoden auch in anderen von uns definierten Klassen vorhanden sein.


// 1. class dekleration
class House{
    int anzahlFensters;
    String farbe;
    static String ort;

    static void begruessung(){
        System.out.println("\nHallo in unserer Wohunung");
        System.out.println("Wir kochen heute Kartofel!!!!!");
        System.out.println("Yeeks");
    }

    int quadrat(int zahl){
        int erg = zahl * zahl;
        return erg;
    }

}

//---------------------------------------------------------------------------------

public class KlassenClassMethods_8 {
    public static void main(String[] args) {

        System.out.println("*********** statische Varieblen ************");
        House.ort = "Berlin";
        System.out.println(House.ort);

        // ------------------------------------------------------------------

        System.out.println("*********** 1. objekt ************");
        House smallHouse = new House();  // 2. objekt erstellen

        smallHouse.anzahlFensters = 3;  // 3. objekt initialiseiren
        smallHouse.farbe = "black"; // 3. objekt initialiseiren

        System.out.println(smallHouse.anzahlFensters);
        System.out.println(smallHouse.farbe);

        House.begruessung();
        int quadratErgebnis1 = smallHouse.quadrat(5);
        System.out.println(quadratErgebnis1);

        // -------------------------------------------------------------------
        System.out.println("*********** 2. objekt ***********");
        House bigHouse = new House();  // 2. objekt erstellen

        bigHouse.anzahlFensters = 10; // 3. objekt initialieiren
        bigHouse.farbe = "weiss"; // 3. objekt initialieiren

        System.out.println(bigHouse.anzahlFensters);
        System.out.println(bigHouse.farbe);

        House.begruessung();
        // rufe quadrat methode durch das bigHouse objekt
        int quadratErgebnis2 = bigHouse.quadrat(quadratErgebnis1);
        System.out.println(quadratErgebnis2);


    }
}
