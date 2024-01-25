package kapitel5_Klassen;

// Die Klasse Studenten repräsentiert Studentenobjekte mit den Eigenschaften name, gender und age.
class Studenten {
    String name;    // Name des Studenten
    char gender;    // Geschlecht des Studenten (M oder F)
    int age;        // Alter des Studenten
}

// Die Klasse Cars repräsentiert Autoobjekte mit den Eigenschaften name, zahl und farbe.
class Cars {
    String name;    // Name des Autos
    int zahl;       // Anzahl der Autos
    String farbe;   // Farbe des Autos
}

// Die Klasse `Klassen_4` enthält die main-Methode, in der Objekte von Studenten und Cars erstellt und initialisiert werden.
// Es werden zwei Studentenobjekte (student1 und student2) und zwei Autoobjekte (auto1 und auto2) erstellt und initialisiert.
// Dann werden die Eigenschaften der Objekte ausgegeben.
public class Klassen_4 {
    public static void main(String[] args) {
        // Objekte der Klasse Cars erstellen
        Cars auto1 = new Cars();
        Cars auto2 = new Cars();

        // Objekte der Klasse Studenten erstellen
        Studenten student1 = new Studenten();
        Studenten student2 = new Studenten();

        // Eigenschaften von student1 initialisieren
        student1.name = "Maya";
        student1.gender = 'F';
        student1.age = 5;

        // Eigenschaften von student2 initialisieren
        student2.name = "Adnan";
        student2.gender = 'M';
        student2.age = 4;

        // Eigenschaften von auto1 initialisieren
        auto1.name = "BMW";
        auto1.zahl = 10;
        auto1.farbe = "schwarz";

        // Eigenschaften von auto2 initialisieren
        auto2.name = "Tesla";
        auto2.zahl = 2;
        auto2.farbe = "weiß";

        // Eigenschaften der Studenten- und Autoobjekte ausgeben
        System.out.println("Name des Studenten: " + student1.name);
        System.out.println("Farbe des Autos: " + auto1.farbe);
    }
}
