package kapitel9_OOP5;
//class Objekt{
//    toString(){
//        return(packetname + "." + classname + adressedesobjt);
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    }
//}

//class Animal extends Objekt{
class Lebewesen {
    String name;
    int alter;
    char geschlecht;

    Lebewesen(String name, int alter, char geschlecht){
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
    }

    public String toString(){
        if (this.name.equals("Mohammad")){
            return "Der Leherer ist " + this.name + " mit dem alter " + this.alter + " und das Geschlecht " + this.geschlecht;
        }
        else {
            return "Die Studentin ist " + this.name + " mit dem alter " + this.alter + " und das Geschlecht " + this.geschlecht;
        }
    }


//    public String printAttribute(){
//        return this.name + " " + this.alter + " " + this.geschlecht;
//    }

}

public class Main_toString {
    public static void main(String[] args) {
        Lebewesen human1 = new Lebewesen("Maya", 5, 'F');
        System.out.println(human1);

        Lebewesen human2 = new Lebewesen("Mohammad", 2, 'M');
        System.out.println(human2);

        Lebewesen human3 = new Lebewesen("Reem", 5, 'f');
        System.out.println(human3);

//        System.out.println(animal1.name);
//        System.out.println(animal1.alter);
//        System.out.println(animal1.geschlecht);
//        System.out.println("-------");
//        String brschreibung_des_Objekt_attribute = animal1.toString();
//        System.out.println(brschreibung_des_Objekt_attribute);
//        System.out.println(animal1.printAttribute());
    }
}
