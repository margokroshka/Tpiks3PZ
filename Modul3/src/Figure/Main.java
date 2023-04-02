package Figure;

public class Main {
    public static void main(String[] args) {
        TwoDShape shape[] = new TwoDShape[4];
        shape[0]=new Triangle(8.0,12.0,"right");
        shape[1]=new Rectangle(8.0);
        shape[2]=new Rectangle(8.0,12.0);
        shape[3]=new Triangle(8.0);
        for (int i = 0; i < shape.length; i++) {
            System.out.println("object is "+shape[i].getName());
            System.out.println("Area is "+shape[i].area());
            System.out.println();
        }
    }
}
