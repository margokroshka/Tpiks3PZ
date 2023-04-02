package Animals;

public class Main {
    public static void main(String[] args) {
        Cat check = new Cat("Maau", 12, 5, 15);
        Cat cat2=new Cat(check);
        check.show();
        check.setName("Mur");
        check.setAge(3);
        check.setWeight(8);

        System.out.println(check.getName());
        System.out.println(check.getAge());
        System.out.println(check.getWeight());

//        check.input();
//        check.changeMouse();

        System.out.println(check+"\n");
        System.out.println(cat2);


        Kitty kitty=new Kitty("Tom",2,1,0,2.0);
        System.out.println(kitty);

        Dog dog=new Dog("Tesla", 1, 1 );
        dog.voice();
        cat2.voice();
    }
}