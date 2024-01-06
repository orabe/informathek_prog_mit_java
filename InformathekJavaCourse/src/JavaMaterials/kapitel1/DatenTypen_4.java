package JavaMaterials.kapitel1;

public class DatenTypen_4 {
    public static void main(String[] args) {
        // DATENTYPEN:
        // Datentypen geben an, welche Art von Daten in Variablen in Java gespeichert werden kann.
        // Alle Variablen deklariert werden müssen, bevor sie verwendet werden können.
        int speed;

        // Es gibt 8 Primitive Datentypen

        // | Kategorie           | Datentyp | Bereich                             | Standardwert | Beispiel              |
        // |---------------------|----------|-------------------------------------|--------------|-----------------------|
        // | 1. Wahrheitswerte   | boolean  | true oder false                     | false        | flag = true           |
        // | 2. Ganzzahlen       | byte     | -128 bis 127                        | 0            | range1 = 124          |
        // | 3. Ganzzahlen       | short    | -32768 bis 32767                    | 0            | temperature = -200    |
        // | 4. Ganzzahlen       | int      | -2^31 bis 2^31-1                    | 0            | range2 = -4250000     |
        // | 5. Ganzzahlen       | long     | -2^63 bis 2^63-1                    | 0            | range = -42332200000L |
        // | 6. Gleitkommazahlen | double   | Doppeltgenaue 64-Bit-Gleitkommazahl | 0.0 (0.0d)   | number = -42.3        |
        // | 7. Gleitkommazahlen | float    | Einfachgenaue 32-Bit-Gleitkommazahl | 0.0 (0.0f)   | nummer = -42.3f       |
        // | 8. Einzelne Zeichen | char     | 16-Bit Unicode-Zeichen              | '\u0000'     | letter = 'Q'          |


        // String Type:
        // - Java bietet auch Unterstützung für Zeichenketten durch die Klasse java.lang.String.
        // - Strings in Java sind keine primitiven Typen, sondern Objekte.
        //
        // | Kategorie           | Datentyp | Bereich                             | Standardwert | Beispiel              |
        // |---------------------|----------|-------------------------------------|--------------|-----------------------|
        // | Zeichenketten       | String   | -                                   | null         | text = "Hello, World!"|
        //
        //
        // --------------------------------------------------------------------------------------

        // 1. boolean type
        // - Boolean-Datentyp: Zwei mögliche Werte - true oder false.
        // - Standardwert: false.
        // - Verwendung: Typischerweise für Wahrheitsbedingungen (true/false).
        boolean flag = true;
        System.out.println(flag);    // prints true

        // --------------------------------------------------------------------------------------
        // 2. byte type

        // - Werte von -128 bis 127
        // - Verwendung von "byte": Speicherplatzersparnis, wenn der Wert sicher im Bereich von -128 bis 127 liegt
        // - Standardwert für "byte": 0.
        byte range1;
        range1 = 124;
        System.out.println(range1);    // prints 124

        // --------------------------------------------------------------------------------------

        // 3. short type
        // - Werte von -32768 bis 32767 (16-Bit-Vorzeicheninteger im Zweierkomplement).
        // - Verwendung bei sicherem Wertebereich von -32768 bis 32767, um Speicherplatz im Vergleich zu
        //   anderen ganzzahligen Datentypen (int, long) zu sparen.
        // - Standardwert: 0.
        short temperature;
        temperature = -200;
        System.out.println(temperature);  // prints -200

        // --------------------------------------------------------------------------------------
        // 4. int type

        // - Int-Datentyp: Werte von -2^31 bis 2^31-1 (32-Bit-Vorzeicheninteger im Zweierkomplement).
        // - Standardwert: 0.
        int range2 = -4250000;
        System.out.println(range2);  // print -4250000

        // --------------------------------------------------------------------------------------
        // 5. long type

        // - Long-Datentyp: Werte von -2^63 bis 2^63-1 (64-Bit-Vorzeicheninteger im Zweierkomplement).
        // - Standardwert: 0.
        long range = -42332200000L;
        System.out.println(range);    // prints -42332200000
        // Beachte die Verwendung von "L" am Ende von -42332200000. Dies zeigt an,
        // dass es sich um eine Ganzzahl des Datentyps "long" handelt.

        // --------------------------------------------------------------------------------------
        // 6. double type

        // - Double-Datentyp: Doppeltgenaue 64-Bit-Gleitkommazahl.
        // - Sollte niemals für präzise Werte wie Währung (currency) verwendet werden.
        // - Standardwert: 0.0 (0.0d).
        double number = -42.3;
        System.out.println(number);  // prints -42.3

        // --------------------------------------------------------------------------------------
        // 7. float type

        // - Float-Datentyp: Einfachgenaue 32-Bit-Gleitkommazahl.
        // - Bei Interesse mehr über einfache und doppeltgenaue Gleitkommazahlen erfahren.
        // - Sollte niemals für präzise Werte wie Währung verwendet werden.
        // - Standardwert: 0.0 (0.0f).
        float nummer = -42.3f;
        System.out.println(nummer);  // prints -42.3
        // Beachte, dass im obigen Programm -42.3f anstelle von -42.3 verwendet wurde.
        // Das liegt daran, dass -42.3 eine Double-Literal ist.
        // Um dem Compiler mitzuteilen, dass -42.3 als Float und nicht als Double behandelt werden soll,
        // muss das Suffix "f" verwendet werden.

        // --------------------------------------------------------------------------------------
        // 8. char type

        // - Es handelt sich um ein 16-Bit Unicode-Zeichen.
        // - Der minimale Wert des Datentyps "char" ist '\u0000' (0), und der maximale Wert ist '\uffff'.
        // - Standardwert: '\u0000'.
        char letter = '\u0051';
        System.out.println(letter);  // prints Q
        // Here, the Unicode value of Q is \u0051. Hence, we get Q as the output.

        // Andere Beispiele:
        char letter1 = '9';
        System.out.println(letter1);  // prints 9

        char letter2 = 65;
        System.out.println(letter2);  // prints A
        // Hier haben wir 9 als Zeichen (durch einfache Anführungszeichen angegeben) der Variable letter1 zugewiesen.
        // Allerdings wird der Variable letter2 die Zahl 65 als Integer (ohne einfache Anführungszeichen) zugewiesen.
        // Daher wird A auf der Ausgabe gedruckt. Dies liegt daran, dass Java Zeichen als ganze Zahlen behandelt,
        // und der ASCII-Wert von A ist 65.
        // Um mehr über ASCII zu erfahren, besuche: https://www.ascii-code.com

        // --------------------------------------------------------------------------------------

        // String Type:
        // - Java bietet auch Unterstützung für Zeichenketten durch die Klasse java.lang.String.
        // - Strings in Java sind keine primitiven Typen, sondern Objekte.

    }
}
