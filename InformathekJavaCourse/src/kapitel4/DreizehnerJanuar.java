package kapitel4;

public class DreizehnerJanuar {
    static int[] doSomething(int a, int b){
//        System.out.println(a);
//        System.out.println(b);

        int sum = a + b;
        int sub = a - b;
        int mult = a * b;
        double div = a / b;
//
//        System.out.println(sum);
//        System.out.println(sub);
//        System.out.println(mult);
//        System.out.println(div);

        int[] arr = {sum, mult};
        return arr;
    }

    public static void main(String[] args) {
        int x = 6;
        int[] ergebnis = doSomething(100, 2);
        System.out.println(ergebnis[0]);
        System.out.println(ergebnis[1]);

    }
}
