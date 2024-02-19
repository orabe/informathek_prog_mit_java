package Kapitel6_OOP2;

public class Methoden_Arrays_forSchleife_1_wiederholung {

    static void printArry(int[] arr){ // das ist die definition der methide.

        for(int i=0; i<arr.length; i++){ // i<3 is aequivalent  zu i<=2
            System.out.println(arr[i]);
        }
        System.out.println("--------------");
    }
    public static void main(String[] args) {

        int[] mona = {1, 2};
        System.out.println(mona[0]);
        System.out.println(mona[1]);

        int[] maya = {2345,4356,23,657,234,456,7,23,34,5456,23,24,5,6465,776,878,9,0,752,345,7,5,3,5,7,4,67,43,6,68,675,};
        for(int i=0; i<maya.length; i++){
            System.out.println(maya[i]);
        }

        int[] arr1 = {4, 6,3,2};
//        for(int i=0; i<arr1.length; i++){
//            System.out.println(arr1[i]);
//        }
        int[] arr2 = {4, 7, 9, 9,6,3,2};
//        for(int i=0; i<arr2.length; i++){
//            System.out.println(arr1[i]);
//        }
        int[] arr3 = {4, 7, 6,3,2};
        int[] arr4 = {4, 7, 9, 9,2};
        int[] arr5 = {4, 7, 9,2};
        int[] arr6 = {34, 17, 9, 9,2, 90};

        printArry(arr1); // aufruf der methide: wir benuzten jetzt die mehtode
        printArry(arr2);
        printArry(arr3);
        printArry(arr4);
        printArry(arr5);
        printArry(arr6);







    }

}
