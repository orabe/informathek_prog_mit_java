package kapitel2_flusskontrolle;


public class FlusskontrolleWiederholung_5 {
    static void verzweifache_ohne_rueckgabewert(int[] arr){
        System.out.println("wir sind in der `verzweifache` methode");
        System.out.println("alle elemente des arrays auf ihren zweifachen setzen");
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i]*2;
            System.out.println(arr[i]);
        }
    }

    static int[] verzweifache_mit_rueckgabewert(int[] arr){
        System.out.println("wir sind in der `verzweifache` methode");
        System.out.println("alle elemente des arrays auf ihren zweifachen setzen");
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i]*2;
        }
        return arr;
    }

    public static void main(String[] args) {
        // wiederhung fuer
        // 1. if else
        // 2. for schleife
        // 3. while schleife
        // 4. arrays
        // 5. methoden
        // --------------------
        /*
        int x = 10000;
        System.out.println("hi");

        // 1. if else
        if(x > 6){
            System.out.println("in der if anweisung");
        }
        else {
            System.out.println("in der else anweisung");
        }
        System.out.println("Bye");
        */

        // --------------------
        // auf der konsolue sollen die zahlen von 0  bis 10 ausgegeben;
//        System.out.println("Hi");
//        for (int i=0; i<=10; i++){
//            System.out.println(i);
//        }
//        System.out.println("bye");

        // auf der konsole soll die summe von zahlen von 1 bis n ausgegebn werden
//        int n = 10;
//        int sum = 0;
//        for(int i=1; i < n; i++){
//            sum = sum + i;
//        }
//        System.out.println("bye");
//

        // --------------------
        //    3. while scheife

//        int n = 10;
//        int sum = 0;
//        int i=1;
//        while(i < n){
//            sum = sum + i;
//            i++;
//            System.out.println(sum);
//        }
//        System.out.println("bye");
//

        //------------------------------
        //

        int zahl1 = 6; // deklarieren und initislaiseren
        int[] zahlen_arr1 = {4,6,8};  // deklarieren und initislaiseren
        String[] str_arr1 = {"rsdfr", "sdf", "sd"}; // deklarieren und initislaiseren

        int zahl2; //deklarieren
        zahl2 = 5; // initialisieren

        // deklarieren: entweder mach ich das folgenden
        int[] zahlen_arr2 = new int[5]; // deklareierne schrit 1 (den Inhaltstyp bestimmen: int []) und schritt 2 (die groesse bestimmen: new int[5])

        // ODER das folgende
        int[] zahlen_arr3; // deklareierne schrit 1 (den Inhaltstyp bestimmen: int [])
        zahlen_arr3 = new int[5]; // deklarieren schritt 2 (die groesse bestimmen: new int[5])

        // ---------------------
        // zusammwn fassung

        // 1. ich nutze deise schreibweise, wqenn ich den inhalt des arrays kenne. die groesse ist egal, also man muss sie nicht angeben, weil man schon den inhalt gegeben hat
        int[] zahlen_array1 = {4,6,8,7,8,9}; // [4,6,8]

        // 2. ich nutze diese schreibweuse, wenn ich nur die groesse kenne. ich kenne den onhalt noch nicht
        int[] zahlen_array2 = new int[5]; // [0,0,0,0,0]

        // 3. ich kenne nur den namen und den typ. ich kenne aber die groesse noch icht. auch den inhalt noch nicht
        int[] zahlen_array3;
        zahlen_array3 = new int[5]; // [0,0,0,0,0]

        // ----- Zugriff auf Array elemente
        // wenn man index eines elementes aus dem Array sagt, dann meint man die position dises Elemetes
        // 1.a element aus der array printen
        System.out.println(zahlen_array1[2]);


        // 1.b alle elemente printen
        System.out.println("alle elemente printen");
        for (int i = 0; i < 3; i++){
            System.out.println(zahlen_array1[i]);
        }


        // -----------
        // 2.a ein wert fuer ein elment aus der array setzen
        zahlen_array1[2] = 9;
        System.out.println(zahlen_array1[2]);
        System.out.println("-----------");

        System.out.println(zahlen_array2[4]);
        zahlen_array2[4] = 100;
        System.out.println(zahlen_array2[4]);

        // 2.b. merhere elemente setzen
        //int[] zahlen_array1 = {4,6,8,7,8,9};
        // int[] zahlen_array1 = {4,6,8,7};
        System.out.println("------");
        System.out.println("alle elemente des arrays auf ihren zweifachen setzen");
        for (int i = 0; i < zahlen_array1.length; i++){
            zahlen_array1[i] = zahlen_array1[i]*2;
            System.out.println(zahlen_array1[i]);
        }

        System.out.println("------");
        System.out.println("alle elemente des arrays auf ihren zweifachen setzen");
        for (int i = 0; i < zahlen_arr1.length; i++){
            zahlen_arr1[i] = zahlen_arr1[i]*2;
            System.out.println(zahlen_arr1[i]);
        }

        // -----------------
        // 5. methoden
        // aufruf der Methode (also die verwendug und nicht die definition)
        System.out.println("===========");
        System.out.println("===========");
        System.out.println("===========");

        int[] myArr1 = {1,2,3,4};
        int[] myArr2 = {10,20,30,40};

        System.out.println(myArr1[0]);
        verzweifache_ohne_rueckgabewert(myArr1);
        //verzweifache_ohne_rueckgabewert(myArr2);
        System.out.println(myArr1[0]);
//        int[] arr = verzweifache_mit_rueckgabewert(myArr);
//        System.out.println("-----");
//        System.out.println(myArr[0]);
    }
}
