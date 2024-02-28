package kapitel7_OOP3;

public class Main {
    public static void main(String[] args) {

        // 1. Hunde
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.woof = true;
        dog1.groesse = 10;
        dog1.anzahlBeine = 4;
        dog1.besitzer = "mueller";

        dog2.woof = false;
        dog2.groesse = 20;
        //dog2.anzahlBeine = ....;
        //dog2.besitzer = ...;

        dog1.anzahlBeine = 7;
        dog2.anzahlBeine = 70;
        System.out.println(dog2.anzahlBeine);
        System.out.println(dog2.besitzer);


        // 2. Katzen
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.meow = true;
        cat1.kratzen = true;

        cat2.meow = false;
        cat2.kratzen = false;

        System.out.println("--------------");
        System.out.println(cat1.anzahlBeine);
        System.out.println(cat1.besitzer);

        Animal.besitzer = "mo";
        Cat.besitzer = "karem";
        System.out.println(Dog.besitzer);

    }
}
