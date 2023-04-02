package Animals;

import java.util.Scanner;

public abstract class Animals {
    int weight, age;
    String name;

    public Animals(String name, int weight, int age) {
        this.weight = weight;
        this.age = age;
        this.name = name;
    }

    public Animals(Animals ob) {
        this.weight = ob.weight;
        this.age = ob.age;
        this.name = ob.name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite ves, vozrast, imya:");
        if (sc.hasNextInt()) {
            this.weight = sc.nextInt();
            this.age = sc.nextInt();
            this.name = sc.nextLine();
        } else System.out.println("Vvedite vse korrektno");
        this.name = sc.nextLine();

    }

    public void show() {
        System.out.println("Animals.Cat "+name+", wth age "+age+", and weight "+weight);
    }

    @Override
    public String toString() {
        return "Animals.Animals{" +
                "weight=" + weight +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public abstract void voice();
}
