package kapitel9_OOP5;

abstract class Bike{
    abstract void printHi(); // name der methode

    void printBye(){
        System.out.println("bye");
    }
}

class car {
    String color;
}

class Mountenbike extends Bike{
    int speed;
    void printHi(){
        System.out.println("I am a Mounten bike");
    }
    void printBye(){
        System.out.println("bye bye.. i am a mounten bike");
    }
}

class CityBike extends Bike{
    void printHi() {
        System.out.println("I am a city bike");
    }
    void printBye(){
        System.out.println("bye");
    }
}

public class Main_abstract_4 {
    public static void main(String[] args) {
        // Bike bike = new Bike(); // geht nicht, da Bike ein abstract class und somit, darf es nicht inzatnziert werden.
        Mountenbike mountenbike = new Mountenbike();
        mountenbike.speed = 100;
        mountenbike.printHi();
        mountenbike.printBye();
    }
}
