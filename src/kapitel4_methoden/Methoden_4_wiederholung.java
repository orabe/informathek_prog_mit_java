package kapitel4_methoden;

public class Methoden_4_wiederholung {


    static double quadrat1(double zahl){

        double dieQuadrat = zahl * zahl;
        double div = zahl / 2;

        System.out.println(dieQuadrat);
        System.out.println(div);

        return dieQuadrat;
    }

    // deklarieren
    static void quadrat2(double zahl){

        double dieQuadrat = zahl * zahl;
        double div = zahl / 2;

        System.out.println(dieQuadrat);
        System.out.println(div);
    }


    public static void main(String[] args) {
        // aufrufen = verwenden
        double erg1 = quadrat1(9);
        double erg2 = quadrat1(8);

        double final_erg = erg1 + erg2;
        System.out.println(final_erg);

        // -----------------------------
        quadrat2(9);
        quadrat2(8);

    }
}
