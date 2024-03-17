package kapitel9_OOP5;

class Human{
    String ort;
    private int PLZ;
    char geschlecht;
    static String land;
    final String PLANET = "Erde";

    void printText(){
        System.out.println("I am a Human");
    }

    void setPLZ(int PLZ){
        this.PLZ = PLZ;
    }

    int getPLZ(){
        return this.PLZ;
    }

    Human(String ort, char geschlecht){
        this.ort = ort;
        this.geschlecht = geschlecht;
    }

}



public class Main_encapsulation_getter_setter_beispiel_3 {
    public static void main(String[] args) {
        Human human = new Human("Berlin", 'F');
        System.out.println(human.ort + " " + human.geschlecht);

        System.out.println(human.getPLZ()); // // private var
        human.setPLZ(12345); // private var
        System.out.println(human.getPLZ());// private var
        human.printText();
        human.printText();
        human.printText();
        human.printText();
        human.printText();
        human.printText();
        human.land = "DE"; // static var
        System.out.println(Human.land);
        System.out.println(human.ort); // final variable


    }
}
