package kapitel5_Klassen;

/*Java-Klasse und Objekte
- Java ist eine objektorientierte Programmiersprache.
- Das grundlegende Konzept des objektorientierten Ansatzes besteht darin, komplexe Probleme in kleinere Objekte zu zerlegen.
- Ein Objekt ist eine Entität (also wie ein Kopie), die einen Zustand und ein Verhalten hat.
- Zum Beispiel ist ein Fahrrad ein Objekt. Es hat
    1. Zustände: Leerlauf, erster Gang, usw. (das sind also die `Java-Variablen`).
    2. Verhalten: Bremsen, Beschleunigen, usw. (das sind also die `Java-Methoden`).

******************************************************************************************************************************
1. Java-Klasse
- Eine Klasse ist eine Vorlage für das Objekt.
- Bevor wir ein Objekt erstellen, müssen wir zuerst die Klasse definieren.
- Wir können die Klasse als eine Skizze (Prototyp) eines Hauses betrachten.
  Sie enthält alle Details über die Stockwerke, Türen, Fenster, usw.
  Basierend auf diesen Beschreibungen bauen wir das Haus.
  Das Haus ist das Objekt.
  Da viele Häuser nach derselben Beschreibung erstellt werden können, können wir viele Objekte aus einer Klasse erstellen.

1.1. Klasse erstellen
- Wir können in Java eine Klasse mit dem Schlüsselwort class erstellen.
- Zum Beispiel:

```
class KlassenName {
  // Variablen
  // Methoden
}
```

Hier repräsentieren Variablen und Methoden den Zustand bzw. das Verhalten des Objekts.
- Variablen werden verwendet, um Daten zu speichern
- Methoden werden verwendet, um Operationen durchzuführen

Hinweis: Nicht jede Klasse muss unbedingt Methoden oder Variablen erhalten.

******************************************************************************************************************************
2. Java-Objekte
- Ein Objekt wird als Instanz einer Klasse bezeichnet.
- Wenn zum Beispiel Fahrrad eine Klasse ist, dann können MountainBicycle, SportsBicycle, TouringBicycle usw.
  als Objekte der Klasse betrachtet werden.

2.1. Ein Objekt erstellen:

```
className object = new className();
```

2.2. Zugriff auf Elemente einer Klasse
Wir koennen auf die Elemente (Variablen und Methoden) einer Klasse mit dem Punktoperator (.) zugreifen.

```
object.VARIABLE;
objekt.METHODE();
```
*****************************************************************************************************************************
ZUSAMMENFASSUNG
Um mit Klassen und Objekten in Java zu arbeiten, sollten Sie folgende Schritte befolgen:

1. Klasse erstellen: Wir verwerden das Schlüsselwort `class`, um eine Klasse zu erstellen.
   Darin definieren wir Variablen und Methoden, um den Zustand und das Verhalten des Objekts zu repräsentieren.
2. Objekt erstellen: Wir nutzen das Schlüsselwort `new` und den `Konstruktor` der Klasse, um ein Objekt zu erstellen. Der `Konstruktor` hat denselben Namen wie die Klasse.
   Mehr zu `Konstruktor` lernen wir in den nachsten Tutorials. Fuer jetzt koennt ihr an Konstroktor denken wie einfach der Namer der Klasse
   z.B. new Fahrrad; hier heisst `Fahrrad` ein Konstruktor.

3. Mitgliederzugriff: Wir greifen auf Variablen und Methoden der Klasse zu, indem wir den Objektnamen gefolgt von einem Punkt (.) verwenden.
******************************************************************************************************************************/

class Fahrrad {

    /*
     * Die Klasse Fahrrad ist ein Prototyp für Fahrrad-Objekte.
     * Sie enthält einen Zustand (Variable) namens "gang" und ein Verhalten (Methode) namens "bremsen".
     *
     * Zustand:
     * - gang: ein privates Feld, das den Gang des Fahrrads repräsentiert.
     *
     * Verhalten:
     * - bremsen(): eine öffentliche Methode, die die Funktionsweise des Bremsens ausgibt.
     *
     * Diese Klasse dient als Vorlage zur Erstellung beliebig vieler Fahrräder,
     * die die gleichen Variablen und Methoden wie der Prototyp teilen.
     */

    // Zustand (Variable)
    int gang;

    // Verhalten (Methode)
    public void bremsen() {
        System.out.println("Funktionsweise des Bremsens");
    }
}


public class Klassen_1 {
    public static void main(String[] args) {

        // 1. Objekte erstellen:
        // Wir haben das Schlüsselwort `new` zusammen mit dem Namen der Klasse (auch Konstruktor; mehr dazu spaeter) verwendet, um ein Objekt zu erstellen.
        // Hier sind sportsBicycle und touringBicycle die Namen der Objekte. Wir können sie verwenden, um auf Variablen und Methoden der Klasse zuzugreifen.
        // Wie wir sehen können, haben wir zwei Objekte der Klasse erstellt. In Java können wir mehrere Objekte einer einzelnen Klasse erstellen.
        Fahrrad sportsBicycle = new Fahrrad();
        Fahrrad touringBicycle = new Fahrrad();


        // 2.a Zugriff auf Elemente der Klasse `Fahrrad`.
        // Zugriff fuer das erste Objekt: sportsBicycle
        int myGang1 = sportsBicycle.gang;
        sportsBicycle.bremsen();

        // 2.b Zugriff fuer das zweite Objekt: touringBicycle
        int myGang2 = touringBicycle.gang;
        touringBicycle.bremsen();
    }
}
