package erstes_packet;

import zweites_packet.Hund;
//import zweites_packet.Mensch;

// Access Modifier = Zugriff Modifier
// class Cat: default acces modifier
class Cat{
    // default access modifier variable
    static String name;
    static private boolean sleeping;

    void printSth(){
        sleeping = true;
    }
}

// class Main_klasse : public access modifier.
public class Main_klasse1 {
    // public
    public static String color;

    // default
    static int laenge;

    // private
    private static float gehalt;

    public static void main(String[] args) {
        String breite = "sdfds";
        Cat.name = "tom";
        Hund.farbe = "red";
//        Cat.sleeping = true;

        Main_klasse1.gehalt= 8;


//        Mensch
    }
}
