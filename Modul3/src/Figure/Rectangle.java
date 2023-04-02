package Figure;

public class Rectangle extends TwoDShape{
    public Rectangle() {
        super();

    }

    public Rectangle(double wight, double height) {
        super(wight, height, "triangle");
    }

    public Rectangle(double x) {
        super(x, "Rectangle");

    }

    public Rectangle(Rectangle ob) {
        super(ob);
    }
    public boolean isSquare(){
        if(getWight()==getHeight()){
            return true;
        }
        return false;
    }
    @Override
    public double area() {
        return getHeight() * getWight();
    }
}
