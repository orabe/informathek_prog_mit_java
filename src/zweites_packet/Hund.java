package zweites_packet;

import erstes_packet.*;

// defualt
class Mensch{
    static int gewicht;
}

// public
public class Hund {
    public static String farbe;
    public static void main(String[] args) {
        Mensch.gewicht = 2;
        Main_klasse1.color = "sdf";
//        Main_klasse1.laenge = 3;
//        Cat.name = "dfdf";

        // erlaubt, da color public
        Main_klasse1.color = "Df";

        // verboten, da laenge default. und default kann  man  nur innerhalb der selben packet benutzen
//        Main_klasse1.laenge = 345;

        // veboten, da gehalt privat ist. und private var kann man nur inerhalb der selben klasse benutzen.
//        Main_klasse1.gehalt = 22;


    }
}
