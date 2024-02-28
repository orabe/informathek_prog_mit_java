package erstes_package;

class Elefant{
    static String stimme; // default attribute
    public static int alter; // public ist ueberfluessig. weil die klasse ist default, d.h. ich kann sowieso diese klasse nur imselben packet benutzen. und da ich ja die klasse nur im selben packet benutzen kann, kannn ich die variablen auch ueber all im selben packet benutzen, egal ob sie (die variblen) privat ode public sind.
    private static int beschleunigung; // private attribute

    void print_Bescheunigung(){
        System.out.println(beschleunigung);
    }
}
public class Hund {
    static String farbe; // default variable
    public static int anzahlBeine; // public variable
    private static int speed;


    public static void main(String[] args) {
        // nutze ein default class aus dem selben Packet (erstes packet) zb.
        Elefant.stimme = "laut";
        // Elefant.beschleunigung // geht nicht, da beschleunigung privat ist.
        Hund.speed = 1000; // private aber innerhalb derselben klasse.
    }
}
