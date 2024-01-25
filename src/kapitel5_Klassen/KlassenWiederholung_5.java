package kapitel5_Klassen;

class Studiernden {
    String name;
    int age;
    char gender;
}

public class KlassenWiederholung_5 {

    public static void main(String[] args) {

        int zahl1; //--> deklarieren: definieren
        int zahl2; //--> deklarieren: definieren

        zahl1 = 6; //--> initialisieren: einen Wert zuweisen
        zahl2 = 7; //--> initialisieren: einen Wert zuweisen

        // Beispiel das zeigt, dass arrays sehr aehnlich wie objekte und klassen funktionieren
        int[] arr1 = new int[3]; //--> deklarieren: definieren
        int[] arr2 = new int[8]; //--> deklarieren: definieren

        arr1[0] = 8090; //--> initialisieren: einen Wert zuweisen
        arr1[1] = 456; //--> initialisieren: einen Wert zuweisen
        arr1[2] = 34; //--> initialisieren: einen Wert zuweisen

        Studiernden student1 = new Studiernden(); //--> deklarieren: definieren
        Studiernden student2 = new Studiernden(); //--> deklarieren: definieren

        student1.name = "Jasem";  //--> initialisieren: einen Wert zuweisen
        student1.age = 88; //--> initialisieren: einen Wert zuweisen
        student1.gender = 'M'; //--> initialisieren: einen Wert zuweisen
    }
}
