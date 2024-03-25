//package __klausuren__.frauen_informatik_und_wirtschaft;
//
//class Bit{
//     private boolean value; // teil 1
//
//    // teil 2
//    Bit(boolean value){
//        this.value = value;
//    }
//
//    // teil 3
//    int bitToInt(){
//        if(value == true){
//            return 1;
//        }
//        else{
//            return 0;
//        }
//    }
//
//    Bit and(Bit b){
//        b.value = (this.value && b.value);
//        return b;
//    }
//
//    boolean isBigger(Bit b){
//        if (this.value == true && b.value == false){
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
//}
//
//public class Aufgabe1 {
//    public static void main(String[] args) {
//        Bit b1 = new Bit(true);
//        Bit b2 = new Bit(true);
//        Bit b3 = new Bit(false);
//        Bit b4 = new Bit(false);
//
//        b1.and(b2);
//        b1.and(b3);
//        b3.and(b4);
//
//        b1.isBigger(b2);
//        b1.isBigger(b3);
//        b3.isBigger(b4);
////        auch noch: das gleiche auch fuer or methode
//
//    }
//
//}
