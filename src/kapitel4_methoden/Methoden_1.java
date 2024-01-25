package kapitel4_methoden;

/* --------------------------------------------------------------------------------------------------------------
Java `Methoden`
- Eine `Methode` ist ein Code-Block, der eine bestimmte Aufgabe ausführt.
- Angenommen, man muss ein Programm erstellen, um einen Kreis zu zeichnen und zu färben.
  Man kann zwei `Methoden` erstellen, um dieses Problem zu lösen:
  1. eine `Methode`, um den Kreis zu zeichnen
  2. eine `Methode`, um den Kreis zu färben
- Die Aufteilung eines komplexen Problems in kleinere Teile macht das Programm leicht verständlich und wiederverwendbar.

- In Java gibt es zwei Arten von Methoden:
  1. Benutzerdefinierte Methoden: Wir können unsere eigene Methode erstellen, basierend auf unseren Anforderungen (Was wir heute lernen werden).
  2. Standardbibliotheksmethoden: Dies sind eingebaute Methoden in Java, die verwendet werden können (z.B. Math.square(), Math.pow())

--------------------------------------------------------------------------------------------------------------
Vorteile der Verwendung von Methoden:
1. Der Hauptvorteil ist die Wiederverwendbarkeit von Code.
    - Wir können eine Methode einmal schreiben und sie mehrmals verwenden.
    - Wir müssen den gesamten Code nicht jedes Mal neu schreiben.
      (Denkt an das wie "einmal schreiben, mehrmals wiederverwenden").

2. Methoden machen den Code besser lesbar und leichter zu debuggen.
    - Als Beispiel (siehe unten) hält die Methode addiereZahlen() den Code zum Berechnen der Summe in einem Block.
    - Daher wird der Code dadurch besser lesbar.

--------------------------------------------------------------------------------------------------------------
Es gibt zwei Schritte beim Arbeiten mit Methoden:

1. Deklaration einer Methode:
    - Die Methode wird zuerst außerhalb der main-Methode deklariert.
    - Diese Deklaration kann entweder in derselben Klasse wie die main-Methode (was wir heute machen werden) oder in einer anderen Klasse erfolgen (diese wird später behandel).
    - Da wir in diesem Kurs noch nicht gelernt haben, wie man mit Klassen umgeht, werden wir uns in diesem Tutorial darauf beschränken,
      Methoden innerhalb derselben Klasse zu deklarieren, in der sich die main-Methode befindet.

2. Aufruf einer Methode in Java:
    - Nach der Deklaration kann die Methode in der main-Methode aufgerufen werden (verwendet werden).
    - Der Aufruf erfolgt durch Verwendung des Methodennamens gefolgt von Klammern, auch wenn keine Parameter übergeben werden.

--------------------------------------------------------------------------------------------------------------
1. Deklaration einer `Methode`
- Die Syntax zur Deklaration einer Methode lautet:

```
 returnType methodName () {
            // Methode body
 }
```

- returnType: - Gibt an, welchen Typ von Wert eine Methode zurückgibt.
              - Wenn eine Methode beispielsweise einen Rückgabetyp int hat, gibt sie einen ganzzahligen Wert zurück.
              - Wenn die Methode keinen Wert zurückgibt, ist ihr Rückgabetyp void.

- methodName: - Ein Bezeichner (also irgendein Name), der verwendet wird, um auf die spezielle Methode in einem Programm zu verweisen.

- method body: - Enthält die Programmieranweisungen, die verwendet werden, um bestimmte Aufgaben auszuführen.
               - Der Methodenrumpf (Body) ist in geschweiften Klammern { } eingeschlossen.

--------------------------------------------------------------------------------------------------------------
Ein vereinfachtes Beispiel:

```
int addNumbers() {
  // Methodenkörper
}
```

- In obigem Beispiel ist der Name der Methode addNumbers().
- Und der Rückgabetyp ist int. Wir werden gleich in diesem Tutorial mehr über Rückgabetypen lernen.
- Das war die einfache Syntax zur Deklaration einer Methode.

-------------------------------------------------------------------------------------------------------------
Die vollständige Syntax zum Deklarieren einer Methode ist jedoch:

```
modifier static returnType nameOfMethod(parameter1, parameter2, ...) {
// Methodenkörper
}
```

- modifier: - Definiert den Zugriffstyp, ob die Methode "public", "private" usw. ist.
            - Mehr dazu lernen wir in anderen Tutorials.

- static: - Wenn wir das Schlüsselwort "static" verwenden, kann darauf zugegriffen werden, ohne Objekte zu erstellen.
          - Mehr dazu lernen wir in anderen Tutorials.

- parameter1, parameter2:  - Dies sind Werte, die an eine Methode übergeben werden.
                           - Wir können einer Methode beliebig viele Argumente übergeben.

-------------------------------------------------------------------------------------------------------------
2. Eine Methode aufrufen in Java (also benutzen umgangssprachlich gesagt):
- In dem obigen Beispiel haben wir eine Methode mit dem Namen addNumbers() deklariert.
- Um die Methode zu verwenden, müssen wir sie aufrufen.
- Hier ist, wie wir die Methode addNumbers() aufrufen können.

```
// ruft die Methode auf
addNumbers();
```

-------------------------------------------------------------------------------------------------------------*/


public class Methoden_1 {

    // 1. Methode erstellen
    public static void mehrereDingeDrucken() {
        /* Diese Methode gibt mehrere Nachrichten auf der Konsole aus.
         * Sie hat keinen Rückgabewert (void)
         * Sie benötigt keine Parameter.
         * Sie kann direkt von der Klasse aufgerufen werden, ohne eine Instanz der Klasse zu erstellen, weil sie als static deklariert ist.
         * (Mehr zu static methoden lernen wir in den kommenden Tutorials) */
        System.out.println("\n---------- Wir sind in der 1. Methode: mehrereDingeDrucken ----------");
        System.out.println("Erste Ausgabe: Dies ist eine Nachricht.");
        System.out.println("Zweite Ausgabe: Hier steht eine weitere Nachricht.");
        System.out.println("Dritte Ausgabe: Noch eine Nachricht.");
    }

    // 2. Methode erstellen
    public static void begruesseBenutzer(String vorname, int alter) {
        /* In diesem Beispiel begrüßt die Methode begrüßeBenutzer den Benutzer, indem sie seinen Namen ausgibt.
         * Sie hat keinen Rückgabewert (void).
         * Sie hat 2 Parameters. Das erste ist vom Typ `String` und das zweite ist vom Typ `int`
         * Sie kann direkt von der Klasse aufgerufen werden, ohne eine Instanz der Klasse zu erstellen, weil sie als static deklariert ist.
         * (Mehr zu static methoden lernen wir in den kommenden Tutorials) */
        System.out.println("\n---------- Wir sind in der 2. Methode: begruesseBenutzer ----------");
        System.out.println("Hallo, " + vorname + "! Willkommen im Programm.");
        System.out.println("Wir sehen, dass, dein Alter ist" + alter);
    }

    // 3. Methode erstellen
    public static int addiereZahlen(int zahl1, int zahl2) {
        /* Diese Methode addiert zwei Zahlen und gibt das Ergebnis zurück.
         * Sie hat einen Rückgabewert vom Typ `int`.
         * Sie hat zwei Parameter vom Typ `int`.
         * Sie kann direkt von der Klasse aufgerufen werden, ohne eine Instanz der Klasse zu erstellen, weil sie als static deklariert ist.
         * (Mehr zu static methoden lernen wir in den kommenden Tutorials) */
        System.out.println("\n---------- Wir sind in der 3. Methode: addiereZahlen ----------");
        int sum = zahl1 + zahl2;
        return sum;
    }

    /******************************************************************
    * Die Hauptmethode (main) wird beim Start des Programms aufgerufen.
    * Hier koennten andere Methodon aufgerufen
    * *****************************************************************/
    public static void main(String[] args) {

        // Aufruf der 1. Methode.
        mehrereDingeDrucken();
        mehrereDingeDrucken();
        mehrereDingeDrucken();

        // Aufruf der 2. Methode
        begruesseBenutzer("Karem", 20);
        begruesseBenutzer("Adnan", 21);

        // Aufruf der Methode addiereZahlen und Ausgabe des Rückgabewerts
        int summe1 = addiereZahlen(7, 5);
        System.out.println("Summe der Zahlen: " + summe1);

        int summe2 = addiereZahlen(70, 50);
        System.out.println("Summe der Zahlen: " + summe2);

        int summeDerSummen = summe1 + summe2;
        System.out.println("\nSumme der Summen: " + summeDerSummen);

        System.out.println("**********************************************************");
        // Standardbibliotheksmethoden
        System.out.print(Math.sqrt(9));


    }
}