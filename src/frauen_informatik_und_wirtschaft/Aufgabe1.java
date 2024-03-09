package frauen_informatik_und_wirtschaft;

class Bit{
     private boolean value; // teil 1

    // teil 2
    Bit(boolean value){
        this.value = value;
    }

    // teil 3
    int bitToInt(){
        if(value == true){
            return 1;
        }

        else{
            return 0;
        }
    }

    Bit and(Bit b){
        b.value = (this.value && b.value);
        return b;
    }
}

public class Aufgabe1 {
    public static void main(String[] args) {
        Bit bitA = new Bit(true);
        Bit bitB = new Bit(false);

        bitA.and(bitB);

    }
}
