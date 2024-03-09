package kapitel9_OOP5;

class City{
    int anzahlBewohner;
    private static int steuerID; // da diese Variable privat ist, sollte man mit ihr nur mit setter und getter arbeiten.

    void printAttribute(){
        System.out.println(anzahlBewohner);
        System.out.println(steuerID);
    }

    City(){
    }

    City(int anzahlBewohner){
        this.anzahlBewohner = anzahlBewohner;
    }

    void setter(int steuerID){
        this.steuerID=steuerID;
    }

    int getter(){
        return this.steuerID;
    }


}

public class Main_encapsulation {
    public static void main(String[] args) {
        City city1 = new City();
        System.out.println(city1.anzahlBewohner);
        city1.anzahlBewohner = 100;
        System.out.println(city1.anzahlBewohner);
        System.out.println(city1.getter());
        city1.setter(9092);
        System.out.println(city1.getter());

//        ---------------
        City city2 = new City(700);
        System.out.println(city2.anzahlBewohner);
        //city2.steuerID = 8082; // set (setze) den Wert von steuerID zu einem bestimmten Wert (wert zuweisen)
        System.out.println(city2.getter());
        city2.setter(8082);

        //int myID = city2.steuerID;   // get (erhalte) den WErt von steuerID
        int myID = city2.getter();
        System.out.println(myID); //

        System.out.println(city2.getter());
    }
}
