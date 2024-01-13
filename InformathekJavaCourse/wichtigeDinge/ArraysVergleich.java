package wichtigeDinge;

import java.util.Arrays;

public class ArraysVergleich {
    public static void main(String[] args) {

        // In Java wird der Operator `==` verwendet, um die Referenzen von Objekten zu vergleichen, nicht jedoch die Inhalte der Arrays.
        // Wenn du zwei Arrays mit `==` vergleichst, überprüfst du, ob beide Referenzen auf dasselbe Array-Objekt verweisen,
        // nicht ob die Array-Inhalte gleich sind.
        // Hier ist ein Beispiel:


        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};



        System.out.println(array1 == array2);  // false, da unterschiedliche Objekte

        int[] array3 = array1;
        System.out.println(array1 == array3);  // true, da beide Referenzen auf dasselbe Objekt zeigen


        // Um den Inhalt der Arrays zu vergleichen, musst du die Methode `Arrays.equals()` verwenden, die Teil der
        // * `java.util`-Klasse ist.
        // * Hier ist ein Beispiel:
        //import java.util.Arrays;

        int[] array4 = {1, 2, 3};
        int[] array5 = {1, 2, 3};

        System.out.println(Arrays.equals(array4, array5));  // true, da die Inhalte gleich sind

        // Die Methode Arrays.equals() vergleicht die Inhalte der Arrays und gibt `true` zurück, wenn sie gleich sind,
        // andernfalls `false`.

    }
}
