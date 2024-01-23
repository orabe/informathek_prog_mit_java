package hausaufgaben;

public class HA1 {
    public static void main(String[] args) {
        int[] tempArray = {22, 25, 18, 20, 23, 27, 24};

        double durchschnitt;
//        durchschnitt = (tempArray[0] + tempArray[1] + tempArray[2] + tempArray[3] + tempArray[4] + tempArray[5] + tempArray[6]) / tempArray.length;
//        System.out.println(durchschnitt);

        int i = 0;
        int sum = 0;
        while(i <= 6)
        {
            sum = sum + tempArray[i];

            i++;
        }
        System.out.println(sum);
        durchschnitt = sum / tempArray.length;
        System.out.println(durchschnitt);
    }
}
