package kapitel4;

class Animal{
    boolean fliegen;

}

public class MyClass4 {
    public static void main(String[] args) {
//    int[] arr = new int[5];
    Animal vogel = new Animal();
    Animal katze = new Animal();

    vogel.fliegen = true;
    katze.fliegen = false;

    System.out.println(vogel.fliegen);
    System.out.println(katze.fliegen);



    }
}
