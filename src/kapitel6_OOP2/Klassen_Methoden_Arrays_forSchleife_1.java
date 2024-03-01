package kapitel6_OOP2;

// Klassen_Methoden_Arrays_forSchleife:
// ===================================
// 1.1 erstelle ein Array
// 1.2. Erstelle 1 Methode: Print das komplette Array
//
//
// MyClass:
// =======
// 2.1 Erstelle eine Klasse names myClass
// 2.2 Erstelle 1 Methode: Print das komplette Array
// 2.3. Erstelle ein Array

class MyClass {
    String name;
    static int wohnort;

    static void printMyArray_methode(int[] theArray){
        for(int i=0; i < theArray.length; i++){
            System.out.println(theArray[i]);
        }
        System.out.println("==========");

    }

}

public class Klassen_Methoden_Arrays_forSchleife_1 {
    String name;
    static int wohnort;

    static void printMyArray_methode(int[] theArray){
        for(int i=0; i < theArray.length; i++){
            System.out.println(theArray[i]);
        }
        System.out.println("==========");

    }

    public static void main(String[] args) {

        Klassen_Methoden_Arrays_forSchleife_1 obj1 = new Klassen_Methoden_Arrays_forSchleife_1();
        Klassen_Methoden_Arrays_forSchleife_1 obj2 = new Klassen_Methoden_Arrays_forSchleife_1();

        obj1.name = "reem";
        obj2.name = "esraa";

        // die nachhste 4 zeilen sind alle equivalent

        obj1.wohnort = 5;
        obj2.wohnort = 2;
        Klassen_Methoden_Arrays_forSchleife_1.wohnort = 4;
        wohnort = 3;


        int[] arr1 = {5, 95, 0, 4};
        int[] arr2 = {5, 9, 6, 0, 4};
        int[] arr3 = {5, 100};


        printMyArray_methode(arr1);
        printMyArray_methode(arr2);
        printMyArray_methode(arr3);


        MyClass obj3 = new MyClass();
        MyClass obj4 = new MyClass();

        obj3.name = "Mohammad";

        System.out.println(obj1.name);
        System.out.println(obj2.name);
        System.out.println(obj3.name);

        obj3.wohnort = 10;
        obj4.wohnort = 10;
        MyClass.wohnort = 10;

        System.out.println(Klassen_Methoden_Arrays_forSchleife_1.wohnort);
        System.out.println(MyClass.wohnort);
        System.out.println(wohnort);

    }
}
