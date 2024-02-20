package Kapitel6_OOP2;

class Car{
    String farbe;
    int preis;
    static String ort;

    void begroesse(String color){
        farbe = color;
        System.out.println("I LOVE  JAVA!!!!");
    }

    // leeres konstruktor
    Car(){
    }

    // KONSTRUKTOR mit 1 Argumente
    Car(String myort){
        ort = myort;
    }


    // KONSTRUKTOR mit 2 Argumente
    Car(String farbe, int preis){
        this.farbe = farbe;
        this.preis = preis;
    }

    // KONSTRUKTOR mit 3 Argumente
    Car(String color, int kosten, String PLZ){
        farbe = color;
        preis = kosten;
        ort = PLZ;
    }

}

//----------------------------------------------------------
public class Klass_Konstruktor_3 {
    public static void main(String[] args) {

        Car obj1 = new Car();
        obj1.preis = 100;


        Car obj2 = new Car("red", 19);









        obj2.ort = "berlin";

        Car obj4 = new Car("Berlin");

        Car obj3 = new  Car("red", 90, "234");
    }
}
