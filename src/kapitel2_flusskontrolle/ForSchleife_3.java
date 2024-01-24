package kapitel2_flusskontrolle;

public class ForSchleife_3 {
    public static void main(String[] args) {
        /* Java for-Schleife

        In der Computerprogrammierung werden Schleifen verwendet, um einen Codeblock zu wiederholen.
        Wenn Du beispielsweise eine Nachricht 100 Mal anzeigen möchtest, kannst du anstelle des 100-maligen Tippen desselben Codes eine Schleife verwenden.
        In Java gibt es drei Arten von Schleifen.
        - for-Schleife
        - while-Schleife
        - do...while-Schleife
        Dieses Tutorial konzentriert sich auf die for-Schleife. Die anderen Arten von Schleifen werden in den kommenden Tutorials behandelt.*/

        // ----------------------------------------------------------------------------------------------------------------

        /* Java for-Schleife
        Die for-Schleife in Java wird verwendet, um einen Codeblock eine bestimmte Anzahl von Malen auszuführen.
        Die Syntax der for-Schleife lautet:

        for (initialExpression; testExpression; updateExpression) {
            // Body der Schleife
        }

        Hierbei gilt:

        1. initialExpression initialisiert und/oder deklariert Variablen und wird nur einmal ausgeführt.
        2. Die Bedingung wird überprüft. Wenn die Bedingung wahr ist, wird der Body der for-Schleife ausgeführt.
        3. updateExpression aktualisiert den Wert von initialExpression.
        4. Die Bedingung wird erneut überprüft. Dieser Prozess wird fortgesetzt, bis die Bedingung falsch ist. */

        // Beispiel 1: Print Text fünfmal
        System.out.println("--------- Beispiel 1: Text fünfmal anzeigen ----------");
        int n = 5;
        // for-Schleife
        for (int i = 1; i <= n; ++i) {
          System.out.println("Java macht Spaß");
        }

        // Hier ist, wie das obige Programm funktioniert:
        /*
        |--------------------------------------------------------------------------------
        | Iteration | Variable | Bedingung (i <= n) | Aktion
        |--------------------------------------------------------------------------------
        | 1         | i = 1    | true               | "Java macht Spaß" wird ausgegeben.
        |           |          |                    | i wird auf 2 erhöht.
        | 2         | i = 2    | true               | "Java macht Spaß" wird ausgegeben.
        |           |          |                    | i wird auf 3 erhöht.
        | 3         | i = 3    | true               | "Java macht Spaß" wird ausgegeben.
        |           |          |                    | i wird auf 4 erhöht.
        | 4         | i = 4    | true               | "Java macht Spaß" wird ausgegeben.
        |           |          |                    | i wird auf 5 erhöht.
        | 5         | i = 5    | true               | "Java macht Spaß" wird ausgegeben.
        |           |          |                    | i wird auf 6 erhöht.
        | 6         | i = 6    | false              | Die Schleife wird beendet.
        / -------------------------------------------------------------------------------- */

        /* Beispiel 2: Print Zahlen von 1 bis 5 */
        System.out.println("--------- Beispiel 2: Text fünfmal anzeigen ----------");
        int m = 5;
        // for-Schleife
        for (int i = 1; i <= m; ++i) {
            System.out.println(i);
        }

        // Hier ist, wie das obige Programm funktioniert:
        /*
        ---------------------------------------------------------------------------------------
        | Iteration | Variable | Bedingung (i <= n) | Aktion
        ---------------------------------------------------------------------------------------
        | 1         | i = 1    | true               | 1 wird ausgegeben. i wird auf 2 erhöht.
        | 2         | i = 2    | true               | 2 wird ausgegeben. i wird auf 3 erhöht.
        | 3         | i = 3    | true               | 3 wird ausgegeben. i wird auf 4 erhöht.
        | 4         | i = 4    | true               | 4 wird ausgegeben. i wird auf 5 erhöht.
        | 5         | i = 5    | true               | 5 wird ausgegeben. i wird auf 6 erhöht.
        | 6         | i = 6    | false              | Die Schleife wird beendet.
        ---------------------------------------------------------------------------------------
        */

        // /* Beispiel 3: Print die Summe natürlicher Zahlen von 1 bis 1000.
        System.out.println("--------- Beispiel 3: Print die Summe natürlicher Zahlen von 1 bis 1000 ----------");
        int sum = 0;
        int k = 1000;

        // for-Schleife für die Summe
        for (int i = 1; i <= k; ++i) {
            // Schleifenkörper
            sum += i;     // sum = sum + i
        }
        System.out.println("Summe = " + sum);
    }
    // Hier ist der Wert von "sum" zu Beginn 0. Dann wird die for-Schleife von i = 1 bis 1000 durchlaufen.
    // In jeder Iteration wird i zu "sum" hinzugefügt, und sein Wert wird um 1 erhöht.
    // Wenn i 1001 wird, ist die Testbedingung falsch, und "sum" wird gleich 0 + 1 + 2 + .... + 1000 sein.
}
