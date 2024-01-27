package kapitel5_Klassen;

// 1. Klasse deklarieren
public class KlassenPositionDerMethoden_9 {
    int anzahlFensters;
    String farbe;

    // ort ist eine statische Variable
    // statische variablen koennen in allen Methoden der selben Klasse direkt benutzt werden
    // bzw. sie sind sichtbar in allen Methoden der selben Klasse, wo ort definiert ist
    static String ort;


    // begruessung ist eine statische Methode
    // statische variablen koennen in allen Methoden der selben Klasse direkt benutzt werden
    // bzw. sie sind sichtbar in allen Methoden der selben Klasse, wo begreussung defineirt ist.
    static void begruessung(){
        System.out.println("\nwillkommen im Haus!!!");
        System.out.println("Wir kochen heute Fattush");
        System.out.println("yemmmmmi\n");
        System.out.println(ort);
        // System.out.println(farbe);
    }

    int quadrat(int zahl){
        begruessung();
        System.out.println(ort);
        int ergebnis = zahl * zahl;
        return ergebnis;
    }

    // -------------------------------------------------------------------------
    public static void main(String[] args) {

        // statische Variable: ort. Zugriff kann durch die Klasse direkt.
        ort = "Berlin";
        System.out.println(KlassenPositionDerMethoden_9.ort);

        // 2. Objekt erstellen
        KlassenPositionDerMethoden_9 kleinHaus = new KlassenPositionDerMethoden_9();

        // 3. Objekt mit werten initialiseiren.
        kleinHaus.farbe = "white";
        kleinHaus.anzahlFensters = 7;
        System.out.println(kleinHaus.farbe);
        System.out.println(kleinHaus.anzahlFensters);

        begruessung();
        int box = kleinHaus.quadrat(5);
        System.out.println(box);


    }
}
