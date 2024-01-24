package kapitel1_introduction;

public class Operatoren_5 {
    public static void main(String[] args) {

        /*
        Java-Operatoren

        Operatoren sind Symbole, die Operationen an Variablen und Werten durchführen.
        Zum Beispiel ist + ein Operator, der für Addition verwendet wird,
        während * auch ein Operator ist, der für die Multiplikation verwendet wird.

        Java-Operatoren können hauptsächlich in 4 Typen eingeteilt werden:

        1. Arithmetische Operatoren
        2. Zuweisungsoperatoren
        3. Relationale Operatoren
        4. Logische Operatoren

        ------------------------------------------------------------------------------------------------------------
        1. Java Arithmetische Operatoren
        Arithmetische Operatoren werden verwendet, um arithmetische Operationen an Variablen und Daten durchzuführen.

        ---------------------------------------------------------
        Operator    | Operation
        ---------------------------------------------------------
        +           | Addition
        -           | Subtraktion
        *           | Multiplikation
        /           | Division
        %           | Modulo-Operation (Rest nach der Division)
        ---------------------------------------------------------
        */
        // Beispiele
        System.out.println("---------- 1. Arithmetische Operatoren ----------");

        // declare variables
        int a = 12, b = 5;

        // addition operator
        System.out.println("a + b = " + (a + b));

        // subtraction operator
        System.out.println("a - b = " + (a - b));

        // multiplication operator
        System.out.println("a * b = " + (a * b));

        // division operator
        System.out.println("a / b = " + (a / b));

        // modulo operator
        System.out.println("a % b = " + (a % b));

         /*
         Hinweis: Divisionsoperator (/):
         Wenn du den Divisionsoperator mit zwei ganzen Zahlen verwendest, wird der resultierende Quotient ebenfalls
         eine ganze Zahl sein.
         Und wenn einer der Operanden eine Gleitkommazahl ist, wird das Ergebnis auch in Gleitkommazahlen vorliegen.
         (9 / 2) ist 4
         (9.0 / 2) ist 4.5
         (9 / 2.0) ist 4.5
         (9.0 / 2.0) ist 4.5
         ---------------------
         Modulo Operator (%):
         Der Modulo-Operator % berechnet den Rest. Wenn a = 7 durch b = 4 geteilt wird, beträgt der Rest 3.
         Hinweis: Der % Operator wird hauptsächlich bei Ganzzahlen verwendet.

         ------------------------------------------------------------------------------------------------------------
         2. Java Zuweisungsoperatoren
         Zuweisungsoperatoren werden in Java verwendet, um Werte Variablen zuzuweisen. Zum Beispiel,*/

        int alter;
        alter = 5;
        // Hier ist = der Zuweisungsoperator. Er weist dem Wert auf seiner rechten Seite die Variable auf seiner linken Seite zu.
        // Das heißt, 5 wird der Variable "alter" zugewiesen.

        // Schauen wir uns einige weitere Zuweisungsoperatoren an, die in Java verfügbar sind.

        /*-------------------------------------------
        Operator    | Beispiel      | Äquivalent zu
        -------------------------------------------
        =           | a = b;        | a = b;
        +=          | a += b;       | a = a + b;
        -=          | a -= b;       | a = a - b;
        *=          | a *= b;       | a = a * b;
        /=          | a /= b;       | a = a / b;
        %=          | a %= b;       | a = a % b;
        -------------------------------------------*/
        // Beispiel 2: Zuweisungsoperatoren
        System.out.println("---------- 2. Zuweisungsoperatoren ----------");

        // Variablen erstellen
        int c = 4;
        int var;

        // Wert mit =
        var = c;
        System.out.println("var mit =: " + var);

        // Wert mit +=
        var += c;
        System.out.println("var mit +=: " + var);

        // Wert mit *=
        var *= c;
        System.out.println("var mit *=: " + var);

        /* ------------------------------------------------------------------------------------------------------------

         3. Java Relationale Operatoren
         - Relationale Operatoren werden verwendet, um die Beziehung zwischen zwei Operanden zu überprüfen.
         - Relationale Operatoren werden in Entscheidungen und Schleifen verwendet.
         - Zum Beispiel:

         Überprüfen, ob a kleiner als b ist
         a < b;
         Hier ist der < Operator der relationale Operator. Er prüft, ob a kleiner als b ist oder nicht.

        Er gibt entweder true oder false zurück.
        -------------------------------------------------------------------
        Operator    | Beschreibung              | Beispiel
        -------------------------------------------------------------------
        ==          | Gleich                    | 3 == 5 gibt false zurück
        !=          | Nicht gleich              | 3 != 5 gibt true zurück
        >           | Größer als                | 3 > 5 gibt false zurück
        <           | Kleiner als               | 3 < 5 gibt true zurück
        >=          | Größer als oder gleich    | 3 >= 5 gibt false zurück
        <=          | Kleiner als oder gleich   | 3 <= 5 gibt true zurück
        ------------------------------------------------------------------- */
        // 3. Beispiele Relationale Operatoren
        System.out.println("---------- 3. Relationale Operatoren ----------");
        // Variablen erstellen
        int f = 7, k = 11;

        // Wert von f und k
        System.out.println("f ist " + f + " und k ist " + k);

        // == Operator
        System.out.println(f == k);  // false

        // != Operator
        System.out.println(f != k);  // true

        // > Operator
        System.out.println(f > k);   // false

        // < Operator
        System.out.println(f < k);   // true

        // >= Operator
        System.out.println(f >= k);  // false

        // <= Operator
        System.out.println(f <= k);  // true

        /* ------------------------------------------------------------------------------------------------------------

        4. Java Logische Operatoren
        Logische Operatoren werden verwendet, um zu überprüfen, ob ein Ausdruck wahr oder falsch ist.
        Sie werden in Entscheidungsfindung verwendet.

        ------------------------------------------------------------------------------------------------------------------------
        |   Operator              |   Beispiel                       | Bedeutung
        ------------------------------------------------------------------------------------------------------------------------
        |   && (Logisches UND)    |   expression1 && expression2     | Wahr nur, wenn sowohl expression1 als auch expression2 wahr sind
        |   || (Logisches ODER)   |   expression1 || expression2     | Wahr, wenn entweder expression1 oder expression2 wahr ist
        |   ! (Logisches NICHT)   |   !expression                    | Wahr, wenn expression falsch ist und umgekehrt
        ------------------------------------------------------------------------------------------------------------------------*/
        // Beispiele Logische Operatoren:
        System.out.println("---------- 4. Logische Operatoren ----------");

        // && Operator
        System.out.println((5 > 3) && (8 > 5));  // true
        System.out.println((5 > 3) && (8 < 5));  // false

        // || Operator
        System.out.println((5 < 3) || (8 > 5));  // true
        System.out.println((5 > 3) || (8 < 5));  // true
        System.out.println((5 < 3) || (8 < 5));  // false

        // ! Operator
        System.out.println(!(5 == 3));  // true
        System.out.println(!(5 > 3));  // false

        // Arbeitsweise des oberen code:

        // - (5 > 3) && (8 > 5) gibt true zurück, da sowohl (5 > 3) als auch (8 > 5) wahr sind.
        // - (5 > 3) && (8 < 5) gibt false zurück, da der Ausdruck (8 < 5) falsch ist.
        // - (5 < 3) || (8 > 5) gibt true zurück, da der Ausdruck (8 > 5) wahr ist.
        // - (5 > 3) || (8 < 5) gibt true zurück, da der Ausdruck (5 > 3) wahr ist.
        // - (5 < 3) || (8 < 5) gibt false zurück, da sowohl (5 < 3) als auch (8 < 5) falsch sind.
        // - !(5 == 3) gibt true zurück, da 5 == 3 falsch ist.
        // - !(5 > 3) gibt false zurück, da 5 > 3 wahr ist.
    }
}