package __klausuren__.frauen_informatik_und_wirtschaft;
// Aufgabe A: erstelle eine random int zahl:
// Aufgabe B: erstelle eine random boolean :

// 1. import random packet
// 2. erstelle ein randpom objekt
// 3. (fuer aufgabe a) rufe die entsprechnde gewunschte random methode (die eine zufaellige `int zahl` erstellt)
// 4. (fuer aufgabe b) rufe die entsprechnde gewunschte random methode (die eine zufaellige `boolische variable` erstellt)

import java.util.Random; // 1. schritt

class Mensch{
    int alter;
    String name;
}

class Animal{
    String name;
    char farbe;

    void ausdruecken(int zahl){
        System.out.println(zahl);
    }
    // methode, die als EINGABE-PARAMETER zwei objekte vom type Mensch UND Type Animal annimmt (keine rueckgabe)
    void printSomething(Mensch mensch_obj, Animal animal_obj){
        System.out.println(mensch_obj.name + " " + animal_obj.farbe);
    }
    // methode (keine rueckgabe), die zwei eingabeparameter hat:
    // 1. ein array von Animal objekten annimt
    // 2. ein array von Mensch objekten annimt

    void print_arr(Animal[] arr_animal_objekteN, Mensch[] arr_mensch_objekteN){
        System.out.println("---------animal-------");
        for(int i=0; i<arr_animal_objekteN.length; i++){
            System.out.println(arr_animal_objekteN[i].name); // name von animals
            System.out.println(arr_animal_objekteN[i].farbe); // farbe von animals
        }
        System.out.println("---------mensch-------");
        for(int i=0; i<arr_mensch_objekteN.length; i++){
            System.out.println(arr_mensch_objekteN[i].name); // name von mensch
            System.out.println(arr_mensch_objekteN[i].alter); // alter von mensch
        }

    }

}



public class Main_random {
    public static void main(String[] args) {
        Random random = new Random(); // 2. schritt
        int zufaellige_zahl = random.nextInt(0, 100); // 3. schritt - aufgabe a
        System.out.println(zufaellige_zahl);

        // 3. schritt - aufgabe b
        boolean zufaellige_boolean = random.nextBoolean();
        System.out.println(zufaellige_boolean);

        // ---------- arrays wiederholung
        System.out.println("___________________________________");
        int y = 7;
        int x;
        x = 6;

        // #1 array erstellung
        int[] arr_inhalt_bekannt = {5,6,7,9,0}; // 1. schreibweise

        int[] arr_typ_bekannt; // 2. schreibweise
        arr_typ_bekannt = new int[5];

        int[] arr_typ_und_length_bekannt = new int[5]; // 3. schreibweise. int array mit 5 elementen

        // #2 array zugriff
        // #2.A print inhalt (get)
        System.out.println(arr_inhalt_bekannt[2]); // =7
        System.out.println(arr_typ_bekannt[3]); // =0 weil array ist vom typ int und "leer", deswegen werden alle 5 elemnte mit 0 initialiert
        System.out.println(arr_typ_und_length_bekannt[1]); // =0

        // #2.B aendere den inhalt (set)
        arr_inhalt_bekannt[3] = 1000;
        arr_typ_bekannt[3] = 10;
        arr_typ_und_length_bekannt[1] = 100;

        // #3 arry typen
        int[] arr1 = new int[3]; // [0,0,0]
        String[] arr2 = new String[4]; // [null, null, null]
        boolean[] arr3 = new boolean[2]; // [false, false]

        Mensch mensch1 = new Mensch();
        Mensch mensch2 = new Mensch();

        // WICHTIG: erstellen von einem Mensch array (der Inhalt ist Objekte vom Typ `Mensch`). Hier Kennen wir den Inhalt und koennen diesen Direkt angeben {..., ...}
        Mensch[] arr_von_mensch_objekten = {mensch1, mensch2};

        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();

        // WICHTIG: erstellen von einem Mensch array (der Inhalt ist Objekte vom Typ `Mensch`). Hier Kennen wir nur die Groesse des Arrays, naemlich 3.
        Animal[] arr_von_animal_objekten = new Animal[3]; // [animal1, animnal2, animal3]
        arr_von_animal_objekten[0] = animal1;
        arr_von_animal_objekten[1] = animal2;
        arr_von_animal_objekten[2] = animal3;
        System.out.println(arr_von_animal_objekten[0].farbe);


//        void ausdruecken(int zahl){
//            System.out.println(zahl);
//        }
        animal1.ausdruecken(1);

        // void printSomething(Mensch mensch_obj, Animal animal_obj){
        //    System.out.println(mensch_obj.name + " " + animal_obj.farbe);
        // }
        animal2.printSomething(mensch1, animal3);

        Mensch m = new Mensch();
        animal1.printSomething(m, new Animal());


        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");
//        print_arr(Animal[] arr_animal_objekteN, Mensch[] arr_mensch_objekteN)
        animal1.print_arr(arr_von_animal_objekten, arr_von_mensch_objekten);
    }
}
