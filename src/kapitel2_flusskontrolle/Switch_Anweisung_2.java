package kapitel2_flusskontrolle;

public class Switch_Anweisung_2 {
    public static void main(String[] args) {
        /*
        1. Java switch-Anweisung

        Die switch-Anweisung ermöglicht es uns, einen Codeblock unter vielen Alternativen auszuführen.

        Die Syntax der switch-Anweisung in Java lautet:

        ----------------------------
        switch (expression) {

          case value1:
            // Code
            break;

          case value2:
            // Code
            break;

          // ...
          // ...

          default:
            // Standard-Anweisungen
        }
        ----------------------------

        Wie funktioniert die switch-case-Anweisung?
        - Die Expression wird einmal ausgewertet und mit den Werten jeder Case verglichen.
        - Wenn die Expression mit value1 übereinstimmt, wird der Code von case value1 ausgeführt. Ähnlich wird der Code von case value2 ausgeführt, wenn die Expression mit value2 übereinstimmt.
        - Wenn keine Übereinstimmung vorliegt, wird der Code des Default-Cases ausgeführt.
        */

        // Beispiel: Java switch-Anweisung
        int number = 44;
        String size;

        // switch-Anweisung zur Überprüfung der Größe
        switch (number) {
            case 29:
                System.out.println("Wir sind hier im case 29");
                size = "Klein";
                break;
            case 42:
                System.out.println("Wir sind hier im case 42");
                size = "Mittel";
                break;
            // Wert der Woche abgleichen
            case 44:
                System.out.println("Wir sind hier im case 44");
                size = "Groß";
                break;
            case 48:
                System.out.println("Wir sind hier im case 48");
                size = "Extra Groß";
                break;
            default:
                System.out.println("Wir sind hier beim default");
                size = "Unbekannt";
                break;
        }
        System.out.println("Size: " + size);

        // Im obigen Beispiel haben wir die switch-Anweisung verwendet, um die Größe zu ermitteln.
        // Hier haben wir eine Variable namens "number". Die Variable wird mit dem Wert jeder Case-Anweisung verglichen.
        // Da der Wert mit 44 übereinstimmt, wird der Code von case 44 ausgeführt.

        // -----------------------------------------------------------------------------------------------------------
        /*
        2. `break`-Anweisung in Java switch...case

        - Die `break`-Anweisung wird verwendet, um die switch-case-Anweisung zu beenden.
        - Wenn `break` nicht verwendet wird, werden alle Cases nach dem übereinstimmenden Case ebenfalls ausgeführt.
        - Im obigen Beispiel stimmt der Ausdruck mit Case 44 überein. Hier haben wir die `break`-Anweisung nach jedem Case verwendet.
        - Daher werden die Cases nach Case 44 nicht ausgeführt.
        - Deshalb ist die `break`-Anweisung erforderlich, um die switch-case-Anweisung nach dem übereinstimmenden Case zu beenden.
        */

        // -----------------------------------------------------------------------------------------------------------

        /* `default`-Case in Java switch-case

        - Die switch-Anweisung enthält auch einen OPTIONALEN `default`-Case.
        - Dieser wird ausgeführt, wenn der Ausdruck mit keinem der Cases übereinstimmt.
        - In unserem obigen Beispiel wird der default-Block ausgeführt, wenn keiner der vorherigen Cases mit der Variable "number" übereinstimmt.
        - Zum Beispiel wenn im Fall von number = 20 wird keiner der vorherigen Cases (29, 42, 44, 48) übereinstimmen,
          daher wird der Code innerhalb des default-Blocks ausgeführt, und die Größe wird auf "Unknown" gesetzt.
        */
    }
}
