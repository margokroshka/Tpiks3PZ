package Animals;

import java.util.Scanner;
public class Cat extends Animals{
    int mouses;

    public Cat(String name, int age, int weight, int mouses) {
        super(name, age, weight);
        this.mouses = mouses;
    }

    public Cat(Cat ob) {
        super(ob);
        this.mouses = ob.mouses;
    }
    public void show() {
        System.out.println("Animals.Cat "+name+", wth age "+age+", and weight "+weight+", number of mice caught "+mouses);
    }

    public void changeMouse(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во пойманых мышей");
        if (sc.hasNextInt()) {
            mouses = sc.nextInt();
        }
        else System.out.println("Введите корректно");
    }
    @Override
    public String toString() {
        return "Animals.Cat{" +
                "name=" + name +
                ", weight=" + weight +
                ", age=" + age +
                ", mouses='" + mouses + '\'' +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("Animals.Cat say - Meow meow!!");
    }
}
