package Kapitel6_OOP2;
// Wiederholung fuer Konstruktor

class MyCarClass{
    int herstellDatum;
    String model;
    String ort;

    void printHallo(String name1, String name2){
        System.out.println("Hallo " + name1 + " und " + name2);
    }

    void printHallo(String name1){
        System.out.println("Hallo " + name1);
    }

    // Konstruktor 1
    MyCarClass(){
    }

    // Konstruktor 2
    MyCarClass(int d, String o){
        ort = o;
        herstellDatum = d;
    }


    // Konstruktor 3
    MyCarClass(int herstellDatum, String ort, String model){
        this.ort = ort;
        this.herstellDatum = herstellDatum;
        this.model = model;

    }


}
public class Klassen_Konstruktor_wiederholung_5 {
    public static void main(String[] args) {
//        int x = 5;
//        int[] arr = new int[6];

        int x; // deklarieren = definieren
        x = 5; // initialisieren
        int y = 7;
        MyCarClass obj1 = new MyCarClass();
        obj1.herstellDatum = 1990;
        obj1.model = "BMW";
        obj1.ort = "Berlin";
        obj1.ort = "Syrien";
        obj1.printHallo("Mohammad", "Adnan");

//        ---------------------------------------------------

        MyCarClass obj3 = new MyCarClass(2000, "Hamburg");
        obj3.model = "mercedes";

//        ---------------------------------------------------

        MyCarClass obj2 = new MyCarClass(1995, "Berlin", "Audi");
        System.out.println(obj2.model);
        obj2.printHallo("karem");
        obj2.printHallo("Mona", "Esraa");

        System.out.println("--------");
        MyCarClass obj10 = new MyCarClass(2024, "Berlin", "Audi");
        System.out.println(obj10.herstellDatum);
        obj10.herstellDatum = 2050;
        System.out.println(obj10.herstellDatum);
    }
}
