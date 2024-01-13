package kapitel4;

public class Test {

//    static void meineSpezielleMethode(){
//        System.out.println("Hello , I love java");
//        System.out.println("mr robot");
//        System.out.println("lets do it");
//        System.out.println("lets go");
//        System.out.println("sos");
//        System.out.println("help");
//        System.out.println("-------------");
//    }
//
    static void berechneUmfang(int lange, int breite){

        double umfang = (lange + breite) * 2;
        System.out.println(umfang);
    }

    public static void main(String[] args) {
//        System.out.println("00000000000000000");
//        meineSpezielleMethode();
//        meineSpezielleMethode();
//        meineSpezielleMethode();
//        System.out.println("1111111111111111111");

        // 1. viereck
        int lange1 = 6;
        int breite1 = 7;

        int lange2 = 65;
        int breite2 = 76;

        int lange3 = 6;
        int breite3 = 73;

        berechneUmfang(lange1, breite1);
        berechneUmfang(lange2, breite2);
        berechneUmfang(lange3, breite3);

        berechneUmfang(6,7);
        berechneUmfang(8, 9);

//        // 2. viereck
//        int lange2 = 8;
//        int breite2= 9;
//
//        berechneUmfang(lange2, breite2);
//
//        // 3. viereck
//        berechneUmfang(5, 7);
//        // 4. viereck
//        berechneUmfang(6, 8);
//        // 5. viereck
//        berechneUmfang(5, 3);
    }
}
