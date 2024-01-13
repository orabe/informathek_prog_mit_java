package kapitel4;

class Studenten{
    String name;
    char gender;
    int age;
}

class Autos{
    String name;
    int zahl;
    String farbe;
}



public class MainClass5 {
    public static void main(String[] args) {
        Autos auto1 = new Autos();
        Autos auto2 = new Autos();

        Studenten student1 = new Studenten();
        Studenten student2 = new Studenten();

        student1.name = "Maya";
        student1.gender = 'F';
        student1.age = 5;

        student2.name = "adnan";
        student2.gender = 'M';
        student2.age = 4;

        auto1.name = "BMW";
        auto1.zahl = 10;
        auto1.farbe = "schwarz";

        auto2.name = "tesla";
        auto2.zahl = 2;
        auto2.farbe = "weiss";

        System.out.println(student1.name);
        System.out.println(auto1.farbe);

    }
}
