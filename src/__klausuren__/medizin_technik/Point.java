package __klausuren__.medizin_technik;

interface movable{
    public void move(double dx, double dy);
}

public class Point implements movable{
    private double x; // x coordinate
    private double y;

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(double dx, double dy){
        x = dx;
        y = dy;
    }

    double getX(){
        return x;
    }

    double getY(){
        return this.y; // oder einfach y.
    }

    void setX(double x){
        this.x = x;
    }

    void setY(double y){
        this.y = y;
    }

    public static void main(String[] args) {
        Point p1 = new Point(5.0,6.7);
        Point p2 = new Point(0.1,6.2);
        Point p3 = new Point(7,4.0);

        // extra voon Mohamad
        System.out.println(p1.getX());
        System.out.println(p1.getY());
    }
}
