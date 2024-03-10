package kapitel9_OOP5;

interface Animal{
    void animal_sound();
    void sleep();
}

class Vogel implements Animal{
    public void animal_sound(){
        System.out.println("zakzak");
    }
    public void sleep(){
        System.out.println("Ich schlafe wenig");
    }
}

class Katze implements Animal{
    public void animal_sound(){
        System.out.println("Meow meow");
    }
    public void sleep(){
        System.out.println("Ich schlafe viel");
    }
}

public class Main_interface_5 {
    public static void main(String[] args) {

    }
}
