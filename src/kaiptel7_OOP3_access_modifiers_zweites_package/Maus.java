package kaiptel7_OOP3_access_modifiers_zweites_package;

import kaiptel7_OOP3_access_modifiers_erstes_package.Hund;
// import kaiptel7_OOP3_access_modifiers_erstes_package.*; importiert alle Klassen aus allen java datein aus dem kaiptel7_OOP3_access_modifiers_erstes_package.

// import kaiptel7_OOP3_access_modifiers_erstes_package.Elefant; // das geht nicht, weil die Elefant Klasse ist default undliegt in einem anderen Packet.

public class Maus {
    // Hund: public
    // Affe: Public
    // Elefant: default
    // Hund & Elefant stimmen aus dem selben java datei.
    public static void main(String[] args) {

        // nutze "public class" aus einem ANDEREN Packege
        // 1. Hund
        // Hund.farbe = "yellow"; // geht nicht, da farbe ist default
        Hund.anzahlBeine = 4; // public
        // Hund.speed = 40; // geht nicht, da speed ist privat

        // 2. Affe
        // Affe.groesse = 100; // geht nicht da geoisse ist default.

        // nutze "default class" aus einem ANDEREN Packege
        // Elefant.stimme = "laut"; //geht nicht, da default class.
        // Elefent.alter = 11;//geht nicht, da default class.
    }

}
