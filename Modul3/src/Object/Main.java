package Object;

public class Main {
    public static void main(String[] args) throws Throwable {
        Test ob=new Test();
        ob.setA(1);
        ob.setB(2);
        Test ob2=new Test(1, 2);
        if(ob.equals(ob2)){
            System.out.println("Объкты равны");
        }
        System.out.println(ob);
        System.out.println(ob.hashCode());
        System.out.println(ob2.hashCode());
        Test ob3=(Test) ob.clone();
        System.out.println(ob3);
        System.out.println(ob3.hashCode());
        ob3.finalize();
        ob=null;
        System.gc();
    }
}
