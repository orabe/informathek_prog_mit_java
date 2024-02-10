package kapitel5_OOP1;

// 1. deklaration von klassen
class Haus{
    int anzahlFenster;
    String farbe;
    static String ort;
}

public class KlassenWiederholung_7 {
    public static void main(String[] args) {

        Haus.ort = "Berlin";

        // int[] arr = new int(5);

        // 2.Objekt erstellen
        // das ist ein Objekt der Klasse "Haus".
        // es wird auch Instanz bennant.
        Haus myhaus1 = new Haus();
        Haus myhaus2 = new Haus();
        Haus myhaus3 = new Haus();
        Haus myhaus4 = new Haus();


        // 3. Objekt initialiserung
        myhaus1.anzahlFenster = 6; // das 1. objekt
        myhaus1.farbe = "Rot"; // das 1. objekt
        // myhaus1.ort = "Berlin";


        myhaus2.farbe = "Schwarz";  // das 2. objekt
        myhaus2.anzahlFenster = 4; // das 2. objekt
        // myhaus2.ort = "Berlin";

        myhaus3.farbe = "weiss"; // das 3. objekt
        myhaus3.anzahlFenster = 5; // das 3. haus
        // myhaus3.ort = "Berlin";

        // System.out.println(myhaus1);
        System.out.println(myhaus1.anzahlFenster);
        System.out.println(myhaus1.farbe);


        myhaus4.farbe="Grün";
        myhaus4.anzahlFenster= 10;
        System.out.println(myhaus4.farbe);
        System.out.println(myhaus4.anzahlFenster);


        System.out.println(myhaus1.ort);
        System.out.println(myhaus2.ort);
        System.out.println(myhaus3.ort);
        System.out.println(myhaus4.ort);

        System.out.println("------------------");

        myhaus1.ort = "Hamburg";
        System.out.println(myhaus4.ort);

        System.out.println("*******************");
        Haus.ort = "Syria";
        System.out.println(myhaus4.ort);

//        int[] arr = {6,8,9};
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);

    }
}
