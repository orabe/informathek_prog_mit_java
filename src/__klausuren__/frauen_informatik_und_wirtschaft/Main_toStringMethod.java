package __klausuren__.frauen_informatik_und_wirtschaft;

//class Object{
//    String toString(){
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    }
//}

//class Car extends Object {
class Car{
    String model;
    int baujahr;
    int price;

//    void printAttribute(){
//        System.out.println("das model ist: " + model);
//        System.out.println(baujahr);
//        System.out.println(price);
//    }

    public String toString(){
        //return packagename.packagename.Car@addressedesobjektes
//        return  "Das model ist: " + model + "\nDas Baujahrist" + baujahr + "\nDer Price ist:" + price + "\nMohammad";
        return model;
    }

}

public class Main_toStringMethod {
    public static void main(String[] args) {
        Car car_obj1 = new Car();
        car_obj1.model = "audi";
        car_obj1.baujahr = 1000;
        car_obj1.price = 199999;

        // System.out.println(car_obj.model);

//        car_obj1.printAttribute();
        System.out.println("========");
        //System.out.println(car_obj.toString());
        System.out.println(car_obj1);

        System.out.println("========");
        System.out.println("car_obj1 = " +car_obj1);
    }
}
