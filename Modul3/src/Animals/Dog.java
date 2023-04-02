package Animals;

public class Dog extends Animals{

    public Dog(String name, int weight, int age) {
        super(name, weight, age);
    }

    @Override
    public void voice() {
        System.out.println("Animals.Dog say - Bow-wow!!");
    }


}
