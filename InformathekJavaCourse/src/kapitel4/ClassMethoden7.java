package kapitel4;

class Besitzer{
    String name; // instance variable
    static String planet; // static variable
    int age;
    char gender;
}

public class ClassMethoden7 {

    public static void main(String[] args) {

        Besitzer.planet = "erde";

        Besitzer besitzer1 = new Besitzer(); //--> deklarieren: definieren

        besitzer1.name = "Jasem";  //--> initialisieren: einen Wert zuweisen
        besitzer1.age = 88; //--> initialisieren: einen Wert zuweisen
        besitzer1.gender = 'M'; //--> initialisieren: einen Wert zuweisen
//        besitzer1.planet = "erde";

        System.out.println(besitzer1.name);
        System.out.println(besitzer1.age);
        System.out.println(besitzer1.gender);
        System.out.println(besitzer1.planet);

//        -----------------------
        System.out.println("---------------------");


        Besitzer besitzer2 = new Besitzer(); //--> deklarieren: definieren

        besitzer2.name = "esraa";  //--> initialisieren: einen Wert zuweisen
        besitzer2.age = 8; //--> initialisieren: einen Wert zuweisen
        besitzer2.gender = 'F'; //--> initialisieren: einen Wert zuweisen
        besitzer2.planet = "erde";

        System.out.println(besitzer2.name);
        System.out.println(besitzer2.age);
        System.out.println(besitzer2.gender);
//        System.out.println(besitzer2.planet);


//        -----------------------
        System.out.println("---------------------");

        Besitzer besitzer3 = new Besitzer(); //--> deklarieren: definieren

        besitzer3.name = "rita";  //--> initialisieren: einen Wert zuweisen
        besitzer3.age = 20; //--> initialisieren: einen Wert zuweisen
        besitzer3.gender = 'F'; //--> initialisieren: einen Wert zuweisen
//        besitzer2.planet = "mars";

        System.out.println(besitzer3.name);
        System.out.println(besitzer3.age);
        System.out.println(besitzer3.gender);
        System.out.println(besitzer3.planet);

        System.out.println("ab jetzt planeten von mohammad und esraa");
        System.out.println(besitzer1.planet);
        System.out.println(besitzer2.planet);

    }
}
