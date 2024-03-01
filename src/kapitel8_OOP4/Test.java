package kapitel8_OOP4;

class Handy{
    int nummer;

    Handy(){
        System.out.println("I Love Java");
    }

    Handy(int nummer){
        System.out.println("I Hate Java");
        this.nummer = nummer;
    }
}
public class Test {
    public static void main(String[] args) {
        Handy handy1 = new Handy();
        handy1.nummer = 1;
        System.out.println(handy1.nummer);

        Handy handy2 = new Handy(2);
        System.out.println(handy2.nummer);
    }
}
