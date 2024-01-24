package kapitel2_flusskontrolle;

public class IfElse_Anweisung_1 {
    public static void main(String[] args) {
        /* Java if...else Anweisung
        In der Programmierung verwenden wir die if...else-Anweisung, um einen Codeblock unter mehreren Alternativen auszuführen.
        Beispielsweise können Noten (A, B, C) basierend auf dem Prozentsatz, den ein Schüler erreicht hat, zugewiesen werden.

        - Wenn der Prozentsatz über 90 liegt, wird die Note A zugewiesen.
        - Wenn der Prozentsatz über 75 liegt, wird die Note B zugewiesen.
        - Wenn der Prozentsatz über 65 liegt, wird die Note C zugewiesen.

        1. Java if (if-then) Anweisung
        Die Syntax einer if-then-Anweisung ist:

        if (condition) {
          // statements
        }

        Hier ist "Bedingung" ein boolescher Ausdruck wie age >= 18.
        - Wenn die Bedingung als wahr ausgewertet wird, werden die Anweisungen ausgeführt.
        - Wenn die Bedingung als falsch ausgewertet wird, werden die Anweisungen übersprungen.*/

        // Beispiel 1: Java if -Anweisung
        System.out.println("----------- Beispiel 1: if -Anweisung -----------");
        int number = 10;

        // Überprüft, ob die Zahl kleiner als 0 ist
        if (number < 0) {
            System.out.println("Die Zahl ist negativ.");
        }
        System.out.println("Anweisung außerhalb des if-Blocks");

        // Im obigen Programm ist number < 0 falsch. Daher wird der Code innerhalb des Körpers der if-Anweisung übersprungen.

        // Beispiel 2: Java if mit String
        // String-Variable erstellen
        String language = "Java";

        // if statement
        if (language == "Java") {
            System.out.println("Best Programming Language");
        }
        // In dem obigen Beispiel vergleichen wir zwei Zeichenketten im if-Block.

        /* ------------------------------------------------------------------------------------------------------------
        Beispiel 2: Java if...else (if-then-else) Anweisung
        Die if-Anweisung führt einen bestimmten Codeabschnitt aus, wenn der Testausdruck als wahr ausgewertet wird.
        Wenn der Testausdruck als falsch ausgewertet wird, geschieht nichts.
        In diesem Fall können wir einen optionalen else-Block verwenden. Anweisungen im Körper des else-Blocks werden ausgeführt, wenn der Testausdruck als falsch ausgewertet wird. Dies ist als die if-...else-Anweisung in Java bekannt.

        if (test-Ausdruck) {
            // Code, der ausgeführt wird, wenn der Testausdruck wahr ist
        } else {
            // Code, der ausgeführt wird, wenn der Testausdruck falsch ist
        }

        Hier wird das Programm eine Aufgabe ausführen (Codes innerhalb des if-Blocks), wenn die Bedingung wahr ist,
        und eine andere Aufgabe (Codes innerhalb des else-Blocks), wenn die Bedingung falsch ist.
        */
        // Beispiel 2: Java if...else Anweisung
        // Überprüft, ob die Zahl größer als 0 ist
        System.out.println("\n----------- Beispiel 2: if -Anweisung -----------");

        if (number > 0) {
            System.out.println("Die Zahl ist positiv.");
        }
        // Führe diesen Block aus, wenn die Zahl nicht größer als 0 ist
        else {
            System.out.println("Die Zahl ist nicht positiv.");
        }

        System.out.println("Anweisung außerhalb des if...else-Blocks");

        // Im obigen Beispiel haben wir eine Variable namens "number". Hier überprüft der Testausdruck "number > 0", ob die Zahl größer als 0 ist.
        // Da der Wert der Zahl 10 ist, wird der Testausdruck als wahr ausgewertet. Daher wird der Code innerhalb des if-Blocks ausgeführt.

    }
}
