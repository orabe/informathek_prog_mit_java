package kapitel10_Arrays;

import java.util.ArrayList;

public class Main_arraylist {
    public static void main(String[] args) {
        // java standard arrays haben eine fixe laenge
        int[] myArray1 = {5,3,67,8};
        int[] myArray2 = new int[5]; // alle werte sind =0
        myArray2[0] = 34;
        myArray2[1] = 344;
        System.out.println(myArray2.length);

        System.out.println("---------");
        // ArrayList die laenge ist dynamisch und kann isch aendern
        ArrayList<Integer> myArrayList = new ArrayList<Integer>(); // []
        System.out.println("------print die groesse (size)");
        System.out.println(myArrayList.size());

        myArrayList.add(3876895); // [3876895]
        System.out.println(myArrayList.size());

        myArrayList.add(-498076); // [3876895, -498076]
        System.out.println(myArrayList.size());

        myArrayList.add(-67); // [3876895, -498076, -67]
        System.out.println(myArrayList.size());

        // myArrayList.add(1, 88);  // [3876895, 88, -498076, -67]
        System.out.println("-------get den inhalt");
        System.out.println(myArrayList.get(0)); // der inhalt an der stelle 0
        System.out.println(myArrayList.get(1)); // der inhalt an der stelle 1
        System.out.println(myArrayList.get(2)); // der inhalt an der stelle 2

        System.out.println("-------set den inhalt und printe die neuen werte aus");
        myArrayList.set(0, 99); // setze den Wert an der position 0 auf den Wert 99 (ueberschreibe den wert auf position 0)
        //myArrayList.set(1, 5555); // setze den Wert an der position 2 auf den Wert 8888
        myArrayList.set(2, 99); // setze den Wert an der position 2 auf den Wert 99

        for (int i = 0; i<myArrayList.size() ; i++){ // print den gesamten inhalt des Arraylist
            System.out.println(myArrayList.get(i));
        }

        System.out.println("------ print after remove the value at postion 1");

        myArrayList.remove(1);

        for (int i = 0; i<myArrayList.size() ; i++){ // print den gesamten inhalt des Arraylist
            System.out.println(myArrayList.get(i));
        }


        // insert
        myArrayList.add(1, 88);  // [99, 88, 99]

        System.out.println("------ print after adding the value 88 at postion 1");
        for (int i = 0; i<myArrayList.size() ; i++){ // print den gesamten inhalt des Arraylist
            System.out.println(myArrayList.get(i));
        }

        myArrayList.clear();
        for (int i = 0; i<myArrayList.size() ; i++){ // print den gesamten inhalt des Arraylist
            System.out.println(myArrayList.get(i));
        }



    }
}
