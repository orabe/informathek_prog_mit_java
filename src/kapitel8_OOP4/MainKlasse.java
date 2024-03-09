package kapitel8_OOP4;

public class MainKlasse {
    public static void main(String[] args) {
        System.out.println("------fahrzeug :----");
        Fahrzeug fahrzeug = new Fahrzeug("BMW");
        fahrzeug.zeigeDetails();
        fahrzeug.printHi();

        System.out.println("\n------auto1 :----");
        Auto auto1 = new Auto(4, "Audi");
        auto1.zeigeDetails();
        auto1.printHi();

        System.out.println("\n------bike:----");
        Auto bike = new Auto(0, "bike_the_bike");
        bike.zeigeDetails();
        bike.printHi();
    }
}
