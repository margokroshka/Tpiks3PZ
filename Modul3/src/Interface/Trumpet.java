package Interface;

public class Trumpet implements Tool{
    public String diameter;
    @Override
    public void play() {
        System.out.println("Играет труба, диаметр трубы="+diameter+"\n"+KEY);
    }

    public Trumpet(String diameter) {
        this.diameter = diameter;
    }
}
