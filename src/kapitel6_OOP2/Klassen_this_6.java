package kapitel6_OOP2;

// Die Aufgabenstellung:
// 1. Erstelle eine Klasse namens Katze mit drei varablen (name, farbe, alter)
// 2. Erstelle ein Objekt, DANACH initilaisere die variablen (name, farbe, alter) mit Werten deiner wahl.
// 3. Erstelle ein neues Objekt UND initialisere ihr Variablen (name, farbe, alter) DIREKT bei der Erstellung des Objektes
// Hinweis zu aufgabe 3: erstelle ein Konstruktor.

// Task 1
class Katze{
    String name;
    String farbe;
    int alter;

    Katze(String name, String farbe, int alter){
        this.name = name;
        this.farbe = farbe;
        this.alter = alter;
    }

    Katze(){
    }
}


public class Klassen_this_6 {
    public static void main(String[] args) {

        // Task 2
        // objekt erstellen
        Katze cat1 = new Katze();

        // Auch Task 2
        // objekt mit werten initialisieren
        cat1.name = "Tom";
        cat1.farbe = "Blue";
        cat1.alter = 7;

//        ====================
        // Task 3
        Katze cat2 = new Katze("Mohammad", "Green", 7);
        System.out.println(cat2.name);
        System.out.println(cat2.farbe);
        System.out.println(cat2.alter);

        System.out.println("------------");
        Katze cat3 = new Katze("Adnan", "Yellow", 5);
        System.out.println(cat3.name);
        System.out.println(cat3.farbe);
        System.out.println(cat3.alter);

    }
}

