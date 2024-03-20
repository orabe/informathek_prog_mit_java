package __klausuren__.medizin_technik;

public class ApproxApplication {
    public static double approximatePi(long kMax){
        double pi = 0L;

        for (int k = 0; k < kMax; k++){
            pi = pi + Math.pow(-1, k) / (2*k + 1);
        }

        return pi;
    }


    public static void main(String[] args) {
        double result = approximatePi(1000000L); // 3.145
        System.out.println(result);
        System.out.println(Math.PI/4);
    }
}
