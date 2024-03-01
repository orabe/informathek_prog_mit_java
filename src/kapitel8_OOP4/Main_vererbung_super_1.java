package kapitel8_OOP4;

// super class
class Animal {
    // class attribute (variable)
    String ort;


    // class method
    void eat(){
        System.out.println("I'm animal and I can eat");
    }


    // 1. constructor (empty)
    Animal(){
        System.out.println("Empty constructor of Animal");
    }

    // 2. constructor (with one parameter)
    Animal(String ort){
        System.out.println("one-parameter-constructor of Animal");
        this.ort = ort;
    }
}

// sub class
class Dog extends Animal{
    static String name;
    String ort;

    void eat(){
        System.out.println("I'm a dog and I can eat");
    }
    void drink(){
        System.out.println("I'm a dog and I can drink");
    }

    void all_eats(){
        eat(); // call the overriding method -> print dog can eat
        super.eat(); // call the overridden method -> print animal cal eat
    }

    void all_ort(){
        System.out.println(ort);
        System.out.println(super.ort);
    }
}

class Cat extends Animal{
    String ort;

    void eat(){
        System.out.println("I'm a cat and I can eat");
    }

    void all_ort(){
        System.out.println(ort);
        System.out.println(super.ort);
    }

    Cat(){
        super();
        System.out.println("Empty constructor of cat");
    }

    Cat(String ort, String SuperOrt){
        // 1. Man kann den "super" konstruktor (also die eine Konstrukrtor von Animal) in dem sub-konstruktor aufrufen.
        // 2. super() oder super("Italy") muss in der ersten zeile geschrieben werden
        // 3. super(): wird automatisch aufgerfen. Also egal ob man es schreibt oder nicht. -> ueberflachlich.

        super(SuperOrt);
        // super();
        this.ort = ort;
        System.out.println("one-parameter-constructor of cat");
    }

}

public class Main_vererbung_super_1 {
    public static void main(String[] args) {

//
//        Dog dog = new Dog();
//        Cat cat = new Cat();

//        animal1.ort = "Berlin";
//        dog.ort = "Hamburg";
//        cat.ort = "Muenchen";

//        System.out.println(dog.ort);
//        System.out.println(cat.ort);
//        System.out.println(animal.ort);

//        animal.eat();
//        dog.eat();
//        dog.drink();
//        dog.all_eats();
//        dog.drink();
//        cat.eat();
//
//        Animal animal1 = new Animal();
//        Animal animal2 = new Animal("Syrien");

        Cat cat1 = new Cat();
        cat1.all_ort();

        System.out.println("=============================");

        Cat cat2 = new Cat("Bali", "Argentienen");
        cat2.all_ort();

        System.out.println("=============================");

        Cat cat3 = new Cat("Maldives", "Brazil");
        cat3.all_ort();

//        System.out.println(animal1.ort); // Deutschland
//        System.out.println(animal2.ort); // Syrien
//        animal1.ort = "Berlin";
//        animal2.ort = "tokyo";
//        System.out.println(animal1.ort); // Berlin
//        System.out.println(animal2.ort); // Tokyo
//
//        dog.ort = "Hamburg";
//        dog.all_ort(); // Hamburg, DE




    }
}
