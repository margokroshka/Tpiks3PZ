package Figure;

public abstract class TwoDShape {
    private double wight;
    private double height;
    private String name;

    public TwoDShape() {
        wight = height=0.0;
        name="null";
    }

    public TwoDShape(double wight, double height, String name) {
        this.wight = wight;
        this.height = height;
        this.name = name;
    }
    public TwoDShape(double x, String n) {
        wight = height=x;
        name=n;
    }

    public TwoDShape(TwoDShape ob) {
        this.wight = ob.wight;
        this.height = ob.height;
        this.name = ob.name;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showDim(){
        System.out.println("Wth and height are "+ wight+" and "+height);
    }

    public abstract double area();
}
