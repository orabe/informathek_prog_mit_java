package kapitel5_OOP1;

// Die Klasse Animal repräsentiert Tierobjekte mit der Eigenschaft fliegen, die angibt, ob das Tier fliegen kann (true oder false).
class Animal {
    boolean fliegen;  // Gibt an, ob das Tier fliegen kann (true oder false)
}

// Die Klasse `Klassen_3` enthält die main-Methode, in der Objekte von Animal erstellt und initialisiert werden.
// Es werden zwei Animal-Objekte (vogel und katze) erstellt und initialisiert.
// Die Eigenschaft fliegen der Objekte wird festgelegt und anschließend ausgegeben.
public class Klassen_3 {
    public static void main(String[] args) {
        // Objekte der Klasse Animal erstellen
        Animal vogel = new Animal();
        Animal katze = new Animal();

        // Eigenschaft fliegen von vogel auf true setzen
        vogel.fliegen = true;

        // Eigenschaft fliegen von katze auf false setzen
        katze.fliegen = false;

        // Eigenschaft fliegen der Animal-Objekte ausgeben
        System.out.println("Kann der Vogel fliegen? " + vogel.fliegen);
        System.out.println("Kann die Katze fliegen? " + katze.fliegen);
    }
}
