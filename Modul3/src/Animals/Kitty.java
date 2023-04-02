package Animals;

public class Kitty extends Cat{
    double timeToEat;
    Kitty(String name, int weight,int age, int mouses, double timeToEat){
        super(name, age, weight, mouses);
        this.timeToEat = timeToEat;
    }

    public Kitty(Kitty ob) {
        super(ob);
        this.timeToEat = ob.timeToEat;
    }

    @Override
    public String toString() {
        return "Animals.Kitty{" +
                "time=" + timeToEat +
                ", mouses=" + mouses +
                ", weight=" + weight +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
