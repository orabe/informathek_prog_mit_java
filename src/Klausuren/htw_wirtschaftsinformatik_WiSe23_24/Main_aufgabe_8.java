package Klausuren.htw_wirtschaftsinformatik_WiSe23_24;

class Spacecraft {
    // class variables (attribute)
    // Wenn du in der Aufgabenstelung die worte "setter" und "getter" siehst, dann solltest Du die klassenvariablen als "private" deklarieren.
    private String name;
    private String type;
    private int year;
    private float velocity;

    // Konstrukror
    // EINE GROESSE BITTE VON MIR MOHAMMMMMMMMMMAAAD: Typ und Reihnfolge der Eingabeparameter NICHT VERGESSEN!!!!!!!!!!
    Spacecraft(String name, String type, int year, float velocity){
        this.name = name;
        this.type = type;
        this.year = year;
        this.velocity = velocity;
    }

    // 1. methode
    void accelerate(double acceleration){
        velocity = (float)(velocity + acceleration); // velocity += acceleration; Aenhlich wie (sum = sum + i). Casting: convert the type from one to another.
    }

    // 2. methode
    void decelerate(double deceleration){
        if (velocity - deceleration > 0){
            velocity = (float)(velocity - deceleration); // velocity += acceleration; Casting: convert the type from one to another
        }
        else {
            velocity = 0;
        }
    }

    // 3. methode
    void printSpacecraftDetails(){
        System.out.println("------------------");
        System.out.println("Jetzt kommt ein Paar Informationen..");
        System.out.println("Name ist " + name); // System.out.println(name);
        System.out.println("Type ist " + type);
        System.out.println("Year ist " + year);
        System.out.println("Velocity ist " + velocity);
    }

    // 4. methode
    void launch(){
        System.out.println("^^^^^^^^^^^^^^^^^^");
        System.out.println(type + " ist gestartet");
    }

    // getter methoden
    // methoden die:
    // 1. keine (normalerweise) Eingabeparameter haben
    // 2. etwas zuereuck geben (return) (kein void)

    String getName(){
        return name;
    }

    float getVelocity(){
        return velocity;
    }


    // setter methoden: fuellen die werte aus. funkioniert genau wie ein Konstrultor!!!!!!!!!!!!!!!!!!
    // methoden die:
    // 1. Eingabeparameter haben
    // 2. NICHTS zuereuck geben (void) (KEIN return)
    void setVelocity(float velocity){
        this.velocity = velocity;
    }


    // alternative, wenn du probleme beim nutze von "this" hast
//    void setVelocity(float velocity){
//        this.velocity = velocity;
//    }


}

public class Main_aufgabe_8 {
    public static void main(String[] args) {
        Spacecraft spacecraft_obj1 = new Spacecraft("NASA", "Satellit", 2000, 0); // int x = ..
        System.out.println(spacecraft_obj1.getVelocity());

        spacecraft_obj1.setVelocity(10);
        System.out.println(spacecraft_obj1.getVelocity());

        spacecraft_obj1.setVelocity(20);
        System.out.println(spacecraft_obj1.getVelocity());

        spacecraft_obj1.setVelocity(30);
        System.out.println(spacecraft_obj1.getVelocity());


        Spacecraft spacecraft_obj2 = new Spacecraft("SpaceX", "Raumschiff", 2010, 0); // int x = ..
        spacecraft_obj2.setVelocity(100);
        spacecraft_obj2.setVelocity(200);
        spacecraft_obj2.setVelocity(300);

//        System.out.println(spacecraft_obj1.name);
//        System.out.println(spacecraft_obj2.name);
        System.out.println(spacecraft_obj1.getName());

        System.out.println(spacecraft_obj1.getVelocity()); // System.out.println(spacecraft_obj1.velocity);
        spacecraft_obj1.accelerate(100.0);
        System.out.println(spacecraft_obj1.getName());
        spacecraft_obj1.accelerate(200.0);
        System.out.println(spacecraft_obj1.getVelocity());
        spacecraft_obj1.accelerate(50.0);
        System.out.println(spacecraft_obj1.getVelocity());

        spacecraft_obj1.decelerate(100.0);
        System.out.println(spacecraft_obj1.getVelocity());
        spacecraft_obj1.decelerate(500.0);
        System.out.println(spacecraft_obj1.getVelocity());

        spacecraft_obj1.printSpacecraftDetails();
        spacecraft_obj2.printSpacecraftDetails();

        spacecraft_obj1.launch();
        spacecraft_obj2.launch();
//        spacecraft_obj1.name = "NASA";
//        spacecraft_obj1.type = "Sataliert";
//        spacecraft_obj1.year = 2000;


    }
}
