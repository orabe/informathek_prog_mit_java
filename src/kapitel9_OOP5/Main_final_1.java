package kapitel9_OOP5;


class Mensch{
    final static int ANZAHL_AUGEN = 2;
    int alter;

    boolean essen(){
        System.out.println("Mensch isst etwas");
        return true;
    }

    final void sprechen(){
        System.out.println("Mensch spricht...");
    }
}


final class Mann extends Mensch {
    boolean essen() {
        System.out.println("Mann isst etwas.");
        return true;
    }

//    void sprechen() {
//        System.out.println("Mensch spricht...");
//    }
}

class Frau extends Mensch{

}


final class baby extends Frau{

}


public class Main_final_1 {
    public static void main(String[] args) {
        Mensch mensch = new Mensch();
        boolean b = mensch.essen();
        mensch.sprechen();

        System.out.println("\n-------mann");
        Mann man = new Mann();
        man.essen();
        man.sprechen();

        System.out.println("\n-------frau");
        Frau frau = new Frau();
        frau.essen();

        // final:
        // 1. mit Variablen: final variablen duerfen ihren wert nicht aendern.
        // 2. mit Methoden: final methoden duerfen nicht ueberschrieben werden.
        // 3. mit Klassen: final super-Klassen duerfen nicht vererbt werden (extended werden):
        // Man sagt: - Eine Superklasse vererbt an die Subklassen.
        //          - Eine Subklasse erbt von einer Superklasse."
        int x = 5; // deklarieren und initialiseren
        x = 7;
        x= 0;
        // int x = 3; // error: weil deklariern darf nur einmal passierne.


        int y; // deklarieren: sowieso nur einmal im leben
        y = 6; // initialiseiren
        y = 7; // re-initialiseren

        final float PI = 3.14f;
        final float EULERZAHL = 2.7f;


//        ----------
        // Mensch.ANZAHL_AUGEN = 5; geht nicht da ANZAHL_AUGEN final ist.

    }
}
