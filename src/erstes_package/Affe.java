package erstes_package;

public class Affe {
    int groesse;
    public static void main(String[] args) {

        // nutze ein "default class" aus dem selben Packet (erstes packet)
        Elefant.stimme="laut"; // default variable
        Elefant.alter = 1; // [public variable
        // Elefant.beschleunigung; // geht nicht, da beschleunigung private.


        // nutze ein "public class" aus dem selben Packet (aus ersten Packet)
        Hund.farbe = "weiss"; // default
        Hund.anzahlBeine=4; // public
        // Hund.speed = 60; // gfeht nicht, da private varible.

    }
}
