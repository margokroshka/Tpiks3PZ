package Figure;

public class Triangle extends TwoDShape{
    private String style;

    public Triangle() {
        super();
        style = null;
    }

    public Triangle(double wight, double height, String style) {
        super(wight, height, "triangle");
        this.style = style;
    }

    public Triangle(double x) {
        super(x, "triangle");
        this.style = "isosceles";
    }

    public Triangle(Triangle ob) {
        super(ob);
        style = ob.style;
    }

    @Override
    public double area() {
        return getHeight() * getWight() / 2;
    }

    void showStyle(){
        System.out.println("Triangle is "+style);
    }
}
