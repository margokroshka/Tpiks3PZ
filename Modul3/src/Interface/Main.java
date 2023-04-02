package Interface;

public class Main {
    public static void main(String[] args) {
        Tool[] mas =new Tool[5];
        mas[0]=new Guitar("5");
        mas[1]=new Trumpet("30cm");
        mas[2]=new Guitar("6");
        mas[3]=new Trumpet("50cm");
        mas[4]=new Drum("Big");
        for (Tool ma : mas) {
            ma.play();
        }
    }
}
