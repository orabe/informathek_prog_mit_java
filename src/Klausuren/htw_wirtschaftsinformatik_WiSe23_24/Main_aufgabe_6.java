package Klausuren.htw_wirtschaftsinformatik_WiSe23_24;

public class Main_aufgabe_6 {
    /*
    * Die Methode countTrueBooleans, die für ein als Parameter übergebenes Array die Anzahl an booleschen Werten mit
    * dem Wert true zurückgibt.
    *
    * @param arr  an array of boolean values for which the true values are counted.
    * @return the number of true values of the input parameter `array`.
    * */
    static int countTrueBooleans(boolean[] arr){
        int counter  = 0;
      // RING: Wenn Du ein Array hast und du werte in diesem Array checken musst, dann soltest du das mit for oder while schleife machen.
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == true){
                counter = counter + 1;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        boolean[] arr = {true, false, false, true, true, true, false, true, true};

        // weil diese methode `countTrueBooleans` hat einen rueckgabewert (return)..
        // also gibt einen wert zuereuck, muessen wir diesen WErt,
        // der zuerueck gegebn wird in einer Variable speicern.
        // Wir haben diesen Variebl erg gennant.
        int erg = countTrueBooleans(arr);
        System.out.println(erg);
        // System.out.println(countTrueBooleans(arr));
    }
}
