package __klausuren__.frauen_informatik_und_wirtschaft;


import javax.xml.namespace.QName;
import java.util.Random;
class Bit{
    private boolean value; // 1. teilausgabe

    Bit(boolean value){
        this.value = value; // 2. teilaufgabe
    }

    int bitToInt(){ // 3.teilaufgabe
        if(value == true){
            return 1;
        }
        else{
            return 0;
        }
        //return 0;
    }

    Bit mymethod(){
//        Bit b = new Bit(true);
        return new Bit(true);
    }

    Bit and(Bit b){
//        boolean erg = this.value && b.value; // erste moeglichkeit

        Bit bit_obj = new Bit(this.value && b.value); // zweite moeglichkeit
//        bit_obj.value = erg; // erste moeglichkeit

        return bit_obj;

//        return new Bit(this.value && b.value); // 3.moeglichkeit
    }

    public String toString(){
        if(value == true){
            return "1";
        }
        else{
            return "0";
        }
    }
}



//--------------------------------------------------------

class Byte{
    private Bit[] bits; // [bit_obj1, bit_obj2, ..] // teilaufgabe1

    Byte(){ // konstruktor-- teilaufgabe 2
        Bit[] arr_von_bit_objekten = new Bit[8]; // beispuel: [bit_obj1,bit_obj2,4,7,8,5,4,4]
        bits = arr_von_bit_objekten;

    }

    void createByte(){
        Random random = new Random();

        for (int i=0; i<bits.length; i++){
            bits[i] = new Bit(random.nextBoolean());
        }
    }

    void createByte(String nr){ // nr = "1 0 0 1 0 0 1 0"
        for (int i=0; i<bits.length; i++){
            if (nr.charAt(i) == '0'){
                bits[i] = new Bit(false);
            }
            else{
                bits[i] = new Bit(true);
            }
        }
    }

    public String toString(){
        String erg = "";
        for (int i=0; i<bits.length; i++){
            if (i == 4){
                erg = erg + " ";
            }
            erg = erg + bits[i].bitToInt();
        }
        return erg;

    }
}

//--------------------------------------------------------

public class Aufgabe11 {
    public static void main(String[] args) {
        Bit b1 = new Bit(true);
        Bit b2 = new Bit(true);
        Bit b3 = new Bit(false);
        Bit b4 = new Bit(false);

        Bit bb1 = b2.and(b1);
        Bit bb2 = b2.and(b3);

        System.out.println("------------------ Bit-Objekte ----------------------");
        System.out.println("b1 = " + b1);
        System.out.println("b3 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);

//        int[] bits;
//        int[] bits = new int[8]; // beispuel: [1,8,4,7,8,5,4,4]

//        Bit[] bits;


        // wir erstellen 2 byte objekte vom typ Byte naemlich byte1 und byte2
        // byte1:
        // byte1 ist ein objekt. byte1 hat attribute (name, alter, farbe), bzw. nur einen attribut, naemlich `bits`
        //          bits: - bits ist eine Variable, ein Class attribute
        //                - bits ist ein Array. das heisst, da drinne sind mehere ELEMENTE enthalten
        //                - Die elemente in diesem Bit array sind komplexe Datyen und nicht so einfach wie int und float
        //                - Diese Elemente in diesem Bit array sind naemlich objekte. Diese objekte koennen normalerweise alles sein (wie tier_objekte, mensch_objkte).
        //                - Wichjtig ist, dass diese Elemente (also diese Objekte) den selben Typen haben mussen, WEIL bits ein ARRAY ist!!!!!!!!!
        //                - In dem bits array, haben wir weder tier_objekte noch mensch_objekte gespeichert. Wir haben jedoch Bit objekte.
        //                - Jedes dieser bit Objekte (wir sind immer noch in dem bits array) hat attribute, naemlich den Attribute `value`.

        Byte byte1 = new Byte();

        Byte byte2 = new Byte();
        Byte byte3 = new Byte();
        Byte byte4 = new Byte();
        Byte byte5 = new Byte();
        Byte byte6 = new Byte();

        byte1.createByte(); // [bit_obj0, .... bit_obj7], bit_obj0.value=false ..

        byte2.createByte("10010010"); // [bit_obj0, .... bit_obj7], bit_obj0.value=false ..
        byte3.createByte("10010001"); // [bit_obj0, .... bit_obj7], bit_obj0.value=
        byte4.createByte("10010010"); // [bit_obj0, .... bit_obj7], bit_obj0.value=
        byte5.createByte("11110000"); // [bit_obj0, .... bit_obj7], bit_obj0.value= false,  bit_obj0.value= true, ..
        byte6.createByte("11100000"); // [bit_obj0, .... bit_obj7], bit_obj0.value= false,  bit_obj0.value= true, ..


        System.out.println("byte5 -> " + byte1);
        System.out.println("byte6 -> " + byte6);
    }
}
