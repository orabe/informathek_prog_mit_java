package htw_wirtschaftsinformatik_WiSe23_24;





public class Main_klausurAufgabe {
    /**
     * Diese Methode nimmt zwei aufsteigend sortierte Arrays von ganzzahligen Werten
     * entgegen, fügt sie zusammen und gibt ein aufsteigend sortiertes Array der
     * kombinierten Zahlen zurück.
     *
     * @param arr1 Das erste aufsteigend sortierte Array.
     * @param arr2 Das zweite aufsteigend sortierte Array.
     * @return Ein aufsteigend sortiertes Array, das aus der Verschmelzung von arr1 und arr2 besteht.
     */
    public static int[] mergeAndSortArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        // Verschmelzung der beiden Arrays, während sie sortiert bleiben
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Hinzufügen der restlichen Elemente aus arr1, falls vorhanden
        while (i < arr1.length) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }

        // Hinzufügen der restlichen Elemente aus arr2, falls vorhanden
        while (j < arr2.length) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 7};
        int[] arr2 = {2, 3, 6};

        int[] mergedSortedArray = mergeAndSortArrays(arr1, arr2);

        // Ausgabe des kombinierten und sortierten Arrays
        System.out.println("Kombiniertes und sortiertes Array:");
        for (int num : mergedSortedArray) {
            System.out.print(num + " ");
        }
    }
}
