package kapitel1_introduction;

public class WiederholungZusammenfassung_6 {

    public static void main(String[] args) {
        // 1. Literale
        // 2. Variablen und Datentypen
        // 3. Operatoren
        // 4. If-Else
        // 5. switch, case, default, break
        // 6. while schleife
        // 7. for schleife

        // Operatoren
        // 1. zuweisung: =
        // +=: i += 3      i = i + 3
        // i++             i = i + 1
        // ----------
        // 2. Algebraische Operatoren
        // + - * / ** ^ %
        // ----------
        // 3. Vergleichoperatoren
        // < > <= >= == !=
        // 5 < 6
        // ----------
        // 4. Logische operatoren
        // && || !

        //    1. optioen dasselbe Programm zu implementieren
        int zaehler = 0;
        while(true)
        {
            zaehler++;
            System.out.println(zaehler);

            if (zaehler >= 20)
            {
                break;
            }

        }
        System.out.println("wir sind ausserhjalb der schleife");


        //    2. optioen dasselbe Programm zu implementieren
        zaehler = 0;
        while(zaehler <= 20)
        {
            System.out.println(zaehler);
            zaehler++;
        }
        System.out.println("wir sind ausserhjalb der schleife");

    }



}
