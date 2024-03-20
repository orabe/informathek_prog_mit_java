package Klausuren.medizin_technik;


import Klausuren.Quadrable;

public class MainClass_Aufgabe_5 {
    public static void main(String[] args) {
        Quadrable q1 = new Quadrable() {
            public double square(double value) {
                return value*value;
            }
        };

        // beispiel 1: wie man die methode aufruft
        double erg = q1.square(4);
        System.out.println(erg);

        // beispiel 2: wie man die methode aufruft
        System.out.println(q1.square(8));

    }
}
