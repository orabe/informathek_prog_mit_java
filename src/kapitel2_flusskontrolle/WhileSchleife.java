package kapitel2_flusskontrolle;

public class WhileSchleife {
    public static void main(String[] args) {
        /* 1. Java while-Schleifen
        - In der Programmierung werden Schleifen verwendet, um einen Codeblock zu wiederholen.
        - Java while-Schleife wird verwendet, um einen bestimmten Code auszuführen, bis eine bestimmte Bedingung erfüllt ist.
        - Zum Beispiel, wenn Sie eine Nachricht 100 Mal anzeigen möchten, kannst du eine Schleife verwenden.
        - Das ist nur ein einfaches Beispiel; Du kannst mit Schleifen viel mehr erreichen.

        - Im vorherigen Tutorial haben wir über die Java for-Schleife gelernt.
        - Hier werden wir über die while Schleife lernen.
        - Die Syntax der while-Schleife ist:

        while (testAusdruck) {
            // Schleifenkörper
        }

        Hier:
        1. Eine while-Schleife bewertet den testAusdruck in den Klammern ().
        2. Wenn der testAusdruck als true bewertet wird, wird der Code innerhalb der while-Schleife ausgeführt.
        3. Der testAusdruck wird erneut bewertet.
        4. Dieser Prozess wird fortgesetzt, bis der testAusdruck als false bewertet wird.
        5. Wenn der testAusdruck als false bewertet wird, wird die Schleife beendet.*/

        // Beispiel 1: Zahlen von 1 bis 5 anzeigen
        System.out.println("--------------- Beispiel 1: Zahlen von 1 bis 5 anzeigen ---------------");
        // Variablen deklarieren
        int i = 1;
        int n = 5;

        // while-Schleife von 1 bis 5
        while(i <= n) {
            System.out.println(i);
            i++;
        }

        /* Hier ist, wie das obige Programm funktioniert:
        ------------------------------------------------------------------------------------------
        Iteration    | Variable  | Condition: i <= n | Action
        ------------------------------------------------------------------------------------------
        1st          | i = 1     | n = 5             | true    | 1 is printed. i is increased to 2.
        2nd          | i = 2     | n = 5             | true    | 2 is printed. i is increased to 3.
        3rd          | i = 3     | n = 5             | true    | 3 is printed. i is increased to 4.
        4th          | i = 4     | n = 5             | true    | 4 is printed. i is increased to 5.
        5th          | i = 5     | n = 5             | true    | 5 is printed. i is increased to 6.
        6th          | i = 6     | n = 5             | false   | The loop is terminated.
        ------------------------------------------------------------------------------------------*/


        /* ---------------------------------------------------------------------------------------
        2. Unendliche While-Schleife
        - Wenn die Bedingung einer Schleife immer wahr ist, läuft die Schleife unendlich oft (bis der Speicher voll ist).
        - Zum Beispiel:

        // Unendliche While-Schleife
        while(true){
            // Schleifenkörper
        }

       */

        /* ---------------------------------------------------------------------------------------

        3. Wann nutzen wir for- und wann while-Schleifen?
        - Die for-Schleife wird verwendet, wenn die Anzahl der Iterationen bekannt ist.
        Zum Beispiel:

        for (int i = 1; i <= 5; ++i) {
            // Schleifenkörper
        }

        - Die while-Schleife wird im Allgemeinen verwendet, wenn die Anzahl der Iterationen unbekannt ist.
         Zum Beispiel:

        while (Bedingung) {
            // Schleifenkörper
        }
        */



    }
}
