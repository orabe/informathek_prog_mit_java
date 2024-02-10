package kapitel5_OOP1;
/* Static variables (Statische Variablen)
   - Eine statische Variable, die mit dem Schlüsselwort 'static' deklariert wird,
   gehört zur Klasse und nicht zu einer bestimmten Instanz der Klasse.
   - Wenn wir Instanz sagen, dann meinen wir ein Objekt. Man kann also aus einer Klasse (Klasse ist ja wie ein template) Instanzen (also Ojekte) erstellen.
   - Das bedeutet, dass alle Instanzen der Klasse dieselbe Kopie der statischen Variable teilen.

   Wie man mit `static variables` umgeht und sie verwendet:
   - Statische Variablen werden auf Klassenebene deklariert, indem das Schlüsselwort 'static' verwendet wird.
   - Sie können von jeder Instanz der Klasse oder direkt von der Klasse selbst aufgerufen werden.
   - Der Zugriff auf eine statische Variable erfolgt über den Klassennamen gefolgt von einem Punkt und dem Variablennamen
     (z.B., MeineKlasse.meineVariable).
   - Wenn der Wert einer statischen Variable in einer Instanz geändert wird, wird dieser Wert für alle Instanzen der Klasse geändert.

   In diesem Skript wird eine Klasse "Besitzer" erstellt, die eine Instanzvariable "name" und eine statische Variable "planet" enthält.
   Es werden drei Objekte der Klasse erstellt und jeweils mit Werten initialisiert.
   Beachtet, dass, wenn der Wert der statischen Variable "planet" für eine Instanz geändert wird,
   der Wert für alle Instanzen gleichzeitig geändert wird.
*/

class Besitzer {
    String name;           // Instanzvariable
    int age;               // Instanzvariable
    char gender;           // Instanzvariable
    static String planet;  // Statische Variable
}

public class KlassenStaticVariable_6 {

    public static void main(String[] args) {

        // Statische Variable 'planet' wird auf "erde" gesetzt, und es gilt für alle Instanzen der Klasse.
        Besitzer.planet = "erde";

        // Objekt besitzer1 wird erstellt und initialisiert
        Besitzer besitzer1 = new Besitzer();
        besitzer1.name = "Jasem";
        besitzer1.age = 88;
        besitzer1.gender = 'M';

        // Ausgabe der Werte für besitzer1 und der statischen Variable 'planet'
        System.out.println(besitzer1.name);
        System.out.println(besitzer1.age);
        System.out.println(besitzer1.gender);
        System.out.println(besitzer1.planet);
        System.out.println("---------------------\n");

        // Objekt besitzer2 wird erstellt und initialisiert
        Besitzer besitzer2 = new Besitzer();
        besitzer2.name = "esraa";
        besitzer2.age = 8;
        besitzer2.gender = 'F';

        // Änderung der statischen Variable 'planet' für besitzer2
        besitzer2.planet = "erde";

        // Ausgabe der Werte für besitzer2 und der statischen Variable 'planet'
        System.out.println(besitzer2.name);
        System.out.println(besitzer2.age);
        System.out.println(besitzer2.gender);
        System.out.println("---------------------\n");

        // Objekt besitzer3 wird erstellt und initialisiert
        Besitzer besitzer3 = new Besitzer();
        besitzer3.name = "rita";
        besitzer3.age = 20;
        besitzer3.gender = 'F';

        // Ausgabe der Werte für besitzer3 und der statischen Variable 'planet'
        System.out.println(besitzer3.name);
        System.out.println(besitzer3.age);
        System.out.println(besitzer3.gender);
        System.out.println(besitzer3.planet);

        // Änderung der statischen Variable 'planet' für besitzer3
        besitzer3.planet = "mars";

        // Ausgabe der geänderten Werte für besitzer1, besitzer2, besitzer3
        System.out.println("Ab jetzt Planeten von Jasem, Esraa und Rita:");
        System.out.println(besitzer1.planet);
        System.out.println(besitzer2.planet);
        System.out.println(besitzer3.planet);
    }
}
