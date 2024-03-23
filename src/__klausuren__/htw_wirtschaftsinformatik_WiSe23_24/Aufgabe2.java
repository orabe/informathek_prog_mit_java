package __klausuren__.htw_wirtschaftsinformatik_WiSe23_24;

public class Aufgabe2 {
    public static int sum(int a, int b, int c){
        a = 4; // keinen Sinn!
        b = 7;
        c = 8;

        return (a + b + c);

    }
    public static void main(String[] args) {
        sum(5,3,8);
    }
}
