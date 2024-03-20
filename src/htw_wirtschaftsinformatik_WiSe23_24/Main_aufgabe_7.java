package htw_wirtschaftsinformatik_WiSe23_24;

public class Main_aufgabe_7 {
    /*
    * Die Methode calculateSquares berechnet fuer eine gegebene Liste von nicht- negativen ganzen Zahlen die Quadrate
    * dieser Zahlen und sie auf der Konsole ausgibt.
    * @param arr array von nicht-negativen ganzen zahlen
    * */
    static void calculateSquares(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(  arr[i] * arr[i]  );
//            System.out.println(  Math.pow(arr[i], 2)  );
        }

    }


    public static void main(String[] args) {
    }
}
