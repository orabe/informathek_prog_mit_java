package kapitel3;

public class arrays {
    public static void main(String[] args) {
        // Java Arrays
        // Ein Array ist eine Sammlung von ähnlichen Datentypen.
        // Wenn wir zum Beispiel die Namen von 100 Personen speichern möchten, können wir ein Array des Datentyps
        // "String" erstellen, das 100 Namen speichern kann.

        String[] array = new String[100];

        // decklarieren an array: defineire
        int[] meinArray;

        // allozieren memory: reserviere speicher
        meinArray = new int[5];

        // decklarieren and allozieren
        int[] deinArray =  new int[5];
        // Access Elements of an Array
        deinArray[0] = 4;
        deinArray[1] = 7;
        deinArray[2] = 8;
        deinArray[3] = 5;
        deinArray[4] = 8;

        // ---------------------------------------

        char[] username;
        username = new char[5];
        // ten years later
        // Access Elements of an Array
        username[0] = 'm';
        username[1] = 'o';
        username[2] = 'n';
        username[3] = 'a';
        username[4] = 'a';
        // System.out.println(username);

        // ---------------------------------------

        // das gleichwe wie
        char[] password = new char[4];
        password[0] = '5';
        password[1] = 'o';
        password[2] = 'k';
        password[3] = 'a';

        // ---------------------------------------

        char[] karemArray = {'k', 'a', 'r', 'e', 'm', '!'};

        // ---------------------------------------

        int[] intArray = {1, 2, 3, 4, 9, 10};
        // Access Elements of an Array
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
        System.out.println(intArray[3]);

        int i = 0;
        while(i < 4)
        {
            System.out.println(intArray[i]);
            i++;
        }

        // Print das array rueckwaerts
        // Looping Through Array Elements
        int[] htwArray = {3, 4, 9, 10};

        int r = htwArray.length ; // = 6
        while(r >= 0)
        {
            System.out.println(htwArray[r]);
            r--;
        }

    }
}
