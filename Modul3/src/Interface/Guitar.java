package Interface;

public class Guitar implements Tool{
    public String number_of_strings;
    @Override
    public void play() {
        System.out.println("Играет гитара, количество струн="+number_of_strings+"\n"+KEY);
    }

    public Guitar(String number_of_strings) {
        this.number_of_strings = number_of_strings;
    }
}
