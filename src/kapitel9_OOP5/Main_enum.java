package kapitel9_OOP5;

enum Color{
    // konstanten
    RED("#FF0000"),
    GREEN("#00FF00");

    // Attribute
    private String colorCode;

    // Konstruktor
    Color(String colorCode){
        this.colorCode = colorCode;
    }

    // setter
    // (wollen wir nicht, da wir ein kontruktor haben)

    // getter
    String getColorCode(){
        return colorCode;
    }
}

public class Main_enum {
    public static void main(String[] args) {
//        Color color1 = Color("RED");
//        System.out.println(color1);

        Color color1 = Color.RED; // gehe zu der Konstante RED. RED wird dir dann den String, den du fuer den Konstruktor brauchst, geben
        System.out.println(color1.getColorCode());

        Color color2 = Color.GREEN; // gehe zu der Konstante GREEN. RED wird dir dann den String, den du fuer den Konstruktor brauchst, geben
        System.out.println(color2.getColorCode());
    }

}
