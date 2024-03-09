package kapitel8_OOP4;

public class Fahrzeug {
    String marke;

    Fahrzeug(String marke){
        this.marke = marke;
    }

    void zeigeDetails(){
        System.out.println("Fahrzeug's Marke: "+ marke);
    }

    final void printHi(){
        System.out.println("Hi");
    }
}
