package Klausuren.medizin_technik;

import java.util.ArrayList;

public class Aufgabe_9 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Hamburg");
        cities.add("Berlin");
        cities.add("Leipzig");
        cities.add("Stuttgart");

        for (int i=0; i<cities.size(); i++){
            for (int j=i+1; j<cities.size(); j++){
                System.out.println(i + " "+ cities.get(i) + " <--> " + j + " " + cities.get(j));
            }
        }
    }
}
