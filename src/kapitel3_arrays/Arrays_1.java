package kapitel3_arrays;

public class Arrays_1 {
    public static void main(String[] args) {
        /* Java Arrays
        - Ein Array ist eine Sammlung von Daten des gleichen Typs.
        - Wenn wir beispielsweise die Namen von 100 Personen speichern möchten, können wir ein Array des Typs String erstellen,
          das 100 Namen speichern kann:
          String[] array = new String[100];
        - Hier kann das obige Array nicht mehr als 100 Namen speichern.
        - Die Anzahl der Werte in einem Java-Array ist immer festgelegt. */

        /* -------------------------------------------------------------------------------------------------------------
        1. Array-Deklaration in Java:

        Datentyp[] arrayName;

        - Datentyp: kann primitive Datentypen wie int, char, double, byte, usw. oder Java-Objekte sein.
        - arrayName: ist ein Bezeichner (also irgendein Name)

        Zum Beispiel:*/

        // Array deklarieren
        double[] daten1;

        /* -------------------------------------------------------------------------------------------------------------
        2. Anzahl der Elemente, die ein Array aufnehmen kann

        Um die Anzahl der Elemente festzulegen, die ein Array in Java aufnehmen kann, müssen wir Speicher für das Array zuweisen.
        Zum Beispiel:*/

        // Array deklarieren
        double[] daten2;

        // Speicher zuweisen
        // Hier kann das Array 10 Elemente speichern.
        // Man kann auch sagen, dass die Größe oder Länge des Arrays 10 ist.
        daten2 = new double[10];

        /* -------------------------------------------------------------------------------------------------------------
        3.  Deklaration und Speicherzuweisung zusammen durchführen
        In Java können wir die Deklaration und Speicherzuweisung eines Arrays in einer einzigen Anweisung in einem Schritt durchführen.
        Zum Beispiel, */
        double[] daten3 = new double[10];

        /* -------------------------------------------------------------------------------------------------------------
        4. Initialisierung von Arrays:
        - In Java können wir Arrays während der Deklaration initialisieren.
        - Im Array ist jeder Speicherort mit einer Nummer verknüpft. Diese Nummer wird als Array-Index bezeichnet.
        - Wir können Arrays dann auch mit Hilfe der Indexnummer initialisieren.
        Zum Beispiel:*/
        // Array deklarieren und initialisieren
        int[] alter = new int[5];
        alter[0] = 12;
        alter[1] = 4;
        alter[2] = 5;
        alter[3] = 2;
        alter[4] = 5;

        /* -------------------------------------------------------------------------------------------------------------
        5. Direkte Initialisierung von Arrays:
        - Wir koennen auch kürzer und kompakter die Deklaration und Zuweisung von Werten machen.
        - Hier haben wir ein Array namens "alter1" erstellt und es mit den Werten innerhalb der geschweiften Klammern initialisiert.
        - Beachte, dass wir die Größe des Arrays nicht angegeben haben.
        - In diesem Fall bestimmt der Java-Compiler automatisch die Größe, indem er die Anzahl der Elemente im Array zählt (d. h. 5).
        Zum Beispiel:*/

        // Array deklarieren und direkt initialisieren
        int[] alter2 = {12, 4, 5, 2, 5};


        /* -------------------------------------------------------------------------------------------------------------
        6. Zugriff auf Elemente eines Arrays
        - Wir können auf das Element eines Arrays über die Indexnummer zugreifen.

        // Array-Elemente zugreifen
        array[index];

        Zum Beispiel:*/
        // ein Array erstellen
        System.out.println("-------  Zugriff auf Elemente des Arrays :------- ");

        int[] alter3 = {15, 14, 7, 9, 3};

        // auf jedes Element des Arrays zugreifen
        System.out.println("Erstes Element: " + alter3[0]);
        System.out.println("Zweites Element: " + alter3[1]);
        System.out.println("Drittes Element: " + alter3[2]);
        System.out.println("Viertes Element: " + alter3[3]);
        System.out.println("Fünftes Element: " + alter3[4]);

        // ------------------------------------------------------------------------------------------------------------
        // Schleife durch die Array-Elemente
        // In Java können wir auch durch jedes Element des Arrays iterieren. Zum Beispiel:
        System.out.println("\n------- Schleife durch die Array-Elemente: -------");
        // ein Array erstellen
        int[] alter4 = {15, 14, 7, 9, 3};

        // durch das Array iterieren mit einer for-Schleife
        for (int i = 0; i < alter.length; i++) {
            System.out.println("Erstes Element: " + alter4[i]);
        }
    }
}
