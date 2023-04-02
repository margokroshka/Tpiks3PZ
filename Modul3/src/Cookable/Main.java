package Cookable;

public class Main {
    public static void main(String[] args) {
        Food food = new Food();
        Cookable cookable=new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println("STR");
            }
        };
        food.prepare(cookable, " string");
    }
}
