package Kapitel6_OOP2;

class Student{ // class definition
    String vorname;
    static char geschlecht;

    static void printArray(int[] arr){

        int age = 0;
        Student.geschlecht = 7;
        geschlecht = 8;
        System.out.println("-----------------");

        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("-----------------");
    }
}

public class Klassen_Methoden_und_static_Wiederholung_2 {
    float laenge;
    static float breite;

    public static void main(String[] args) {
        String myname;

        int[] arr1 = {45,567,789,890};

        Student.geschlecht = 'W';
        System.out.println(Student.geschlecht);

        Student.printArray(arr1);

        // objekt initialisieung
        Student student1 = new Student();
        Student student2 = new Student();

        student1.vorname = "reem";
        student2.vorname = "esraa";

//        ---------------------------------------
        Klassen_Methoden_und_static_Wiederholung_2 klassen_methoden1 = new Klassen_Methoden_und_static_Wiederholung_2();
        klassen_methoden1.laenge = 13;
        Klassen_Methoden_und_static_Wiederholung_2.breite = 17;
        breite = 17;

//        ---------------------------------------



//        student1.geschlecht = 'W';
//        System.out.println(Student.geschlecht);
//        System.out.println(student1.geschlecht);
//
//         student2.geschlecht = 'A';
//
//        System.out.println(student1.geschlecht);
//        System.out.println(Student.geschlecht);
//        System.out.println(student2.geschlecht);
//
//
//        student1.printArray(arr1);
//        student2.printArray(arr1);
//        Student.printArray(arr1);



//        String vorname1 = "Reem1";
//        String nachname1 = "Reem2";
//        int alter1 = 1;
//        char geschlecht1 = 'W';
//
//        String vorname2 = "esraa";
//        String nachname2 = "esraa2";
//        int alter2 = 2;
//        char geschlecht2 = 'W';
//
//        String vorname3 = "Reem1";
//        String nachname3 = "Reem2";
//        int alter = 20;
//        char geschlecht = 'W';
//
//        String vorname = "Reem1";
//        String nachname = "Reem2";
//        int alter = 20;
//        char geschlecht = 'W';
    }
}
