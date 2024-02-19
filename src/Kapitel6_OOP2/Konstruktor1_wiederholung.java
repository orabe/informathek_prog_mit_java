package Kapitel6_OOP2;

class Auto{
    String model;
    static String ort;
    int baujahr;

    Auto(String myModel, String myOrt, int myBaujahr){
        model = myModel;
        ort = myOrt;
        baujahr = myBaujahr;
    }

    Auto(String myModel, int myBaujahr){
        model = myModel;
        baujahr = myBaujahr;
    }

}
public class Konstruktor1_wiederholung {
    public static void main(String[] args) {
//        Auto auto_obj1 = new Auto();
//
//        auto_obj1.baujahr=1990;
//        auto_obj1.model="BMW";
//        Auto.ort="Berlin";

        Auto auto_obj2 = new Auto("Audi", "Berlin", 2000);
        Auto auto_obj3 = new Auto("mercedes", "Berlin", 2020);
        Auto auto_obj4 = new Auto("mercedes", 2020);

        System.out.println(auto_obj2.model);
        System.out.println(auto_obj3.model);
    }
}
