package kapitel8_OOP4;



public class Auto extends Fahrzeug{
    int anzahlTueren;

    Auto(int anzahlTueren, String myMarke){
        super(myMarke);
        this.anzahlTueren = anzahlTueren;
    }

    void zeigeDetails(){
        //        super.zeigeDetails();
        System.out.println("Fahrzeug's Marke lalala: "+ marke);
        System.out.println("Autos' Marke: "+ anzahlTueren);
    }
    // geht nicht. da printHi kann nicht ueberschreiben werden, da sie mit "final" defieniert ist.
//    void printHi(){
//        System.out.println("Hi");
//    }
}
