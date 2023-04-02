package Interface;

public class Drum implements Tool{
    public String size;
    @Override
    public void play() {
        System.out.println("Играет барабан, размером="+size+"\n"+KEY);
    }

    public Drum(String size) {
        this.size = size;
    }
}
