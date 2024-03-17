package kapitel9_OOP5;

import java.util.SortedMap;

public class Methoden_Lina {
    public static void main(String[] args) {
        // Arrays deklarieren, und werten mitangeben bei ertellung des arrays direkt laenge bestimmen,
        // 1. mthode, um ein array zu deklarieren und initialisieren
        // ich nutze diese methode, wenn ich den Inhalt des Arrays kenne. Die laenge kenne ich auch natuerliuch, weil ich den Inhalt (die elemente des arrays) zaehlen kann.
        // Deswegen schreibt man die laenge nicht, weil es unwichtig ist, weil man ja die lemente des arrays immer zahln kann.
        int[] arr1 = {6,4,7}; // {} fuer den INHALT des arrays
        String[] linaArry_STRING = {"5", ".", "l", "2000", "$", "_"};

        // -------------
        // 2. methode, um ein array zu deklarieren: manschreibt den Typ und AUCH die laenge des arrays
        // ich nutze diese methode, wenn ich den inhalt noch nicht habe oder kenne. aber ich kenne die laenge
        int[] linaArry_INTEGER = new int[6];
        String[] arr2 = new String[6]; // 6 ist die laenge des arrays. Dabei wird ein Array mit 6 elemenen, die alle den 0 wert haben


        // --------------
        // 3. methode, um ein array zu deklarieren: ist genau wie methode 2, ber halt in zwei Schritten geteilt.
        int[] arr3; // in diesem moment kenne ich weder die laeneg noch den inhalt
        // ten years later...
        arr3 = new int[5]; // ich kenne nur die laenge. Den inhalt kenne ich immer noch nicht. ich will 5 elmente in dieser liste speichern

        // ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // Zugriff auf Elemente des Arrays
        // 1. Inhalt printen (von der Idee her funktioniert das wie getter methode)
        System.out.println(arr1[2]); // 3 die position, oder der index. Gehe zu arr1 und gib mir das Element an der Stelle 3. Beachte: Wir fangen bei 0 an zu zaehlen.
        System.out.println(arr2[5]); //  Auf der Konsole wird `null` angezeigt. Weil arr2 hat den Type String. und sie ist "leer". Per Default wird dass array mit null ausgefuellt.
        System.out.println(linaArry_STRING[4]);
        System.out.println(arr3[2]); // auf der Konsole wird 0 angezeigt.


        for(int i=0; i<arr1.length; i++){
            System.out.println("print inhalt des arrays mit for schleife an der Position " + i + " : " + arr1[i]);
        }


        // ----------------------------------------------------------------
        System.out.println("================");
        // 2. wir wollen Werte fuer die Elmente des Arrays setzen, oder geben ("ausfuellen", oder ueberschreiben)
        // (von der Idee her funktioniert das wie setter methode)
        System.out.println(arr1[1]);
        arr1[0] = 9;
        arr1[1] = 1000;
        System.out.println(arr1[1]);

        System.out.println("================");
        arr2[0] = "A";
        arr2[1] = "--";
        //arr2[2] = "asldgihu";
        arr2[3] = "lina";
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);
    }
}
