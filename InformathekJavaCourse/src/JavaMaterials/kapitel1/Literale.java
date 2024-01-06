package JavaMaterials.kapitel1;

public class Literale {
    public static void main(String[] args) {
        // JAVA LITERALE:
        // Literale sind Daten, die zur Darstellung von festen Werten verwendet werden.
        // Sie können direkt im Code verwendet werden.

        // ZUSAMMENFASSUNG
        //
        // Kategorie           | Beispiel          | Typ                 | Beschreibung
        // --------------------|-------------------|---------------------|-----------------------------------
        // Numerische Literale | 1, 34             | Ganzzahl (int)      | Ganzzahlliterale
        // Numerische Literale | 2.5f, 3.4, 3.4F   | Gleitkommazahl      | Gleitkommazahlenliterale
        // Zeichen Literale    | 'F', 'a'          | Zeichen (char)      | Einzelne Zeichenliterale
        // Textuelle Literale  | "Java Programming", "Programiz" | Zeichenkette (String)  | Zeichenkettenliterale
        // Boolesche Literale  | false, true       | Boolesch (boolean)  | Wahrheitswerte

        // Here, 1, 2.5, and 'F' are literals.
        // Here are different types of literals in Java.
        int a = 1;
        float b = 2.5f;
        char c = 'F';

        // --------------------------------------------------------------------------------------

        // 1. Integer Literals

        // Ein ganzzahliges Literal ist ein numerischer Wert (verbunden mit Zahlen)
        // ohne Bruch- oder Exponentialteil.
        int decNumber = 34;

        // Beachte: Ganzzahlliterale werden verwendet, um Variablen von ganzzahligen Typen wie
        // byte, short, int und long zu initialisieren.

        // --------------------------------------------------------------------------------------

        // 2. Floating-point Literals
        // Ein Gleitkommazahlen-Literal ist ein numerisches Literal, das entweder eine Bruchform
        //oder eine Exponentialform hat.
        double myDouble = 3.4;
        float myFloat = 3.4F;

        System.out.println(myDouble);  // prints 3.4
        System.out.println(myFloat);    // prints 3.4

        // Beachte: Die Gleitkommazahlen-Literale werden verwendet, um Variablen der Typen float
        // und double zu initialisieren.

        // --------------------------------------------------------------------------------------

        // 3. Character Literals
        // Zeichenliterale sind Unicode-Zeichen, die in einfachen Anführungszeichen eingeschlossen
        // sind.
        // Hier ist "a" das Zeichenliterale.
        char letter = 'a';

        // --------------------------------------------------------------------------------------

        // 4. String literals
        // Ein Zeichenkettenliteral ist eine Sequenz von Zeichen, die in doppelten Anführungszeichen
        // eingeschlossen ist.
        // Hier sind "Java Programming" und "Programiz" zwei Zeichenkettenliterale.
        String str1 = "Java Programming";
        String str2 = "Programiz";

        // --------------------------------------------------------------------------------------

        // 15 Boolean Literals
        // In Java werden boolesche Literale verwendet, um boolesche Datentypen zu initialisieren.
        // Sie können zwei Werte speichern: true und false.
        // Here, false and true are two boolean literals.
        boolean flag1 = false;
        boolean flag2 = true;

    }
}
