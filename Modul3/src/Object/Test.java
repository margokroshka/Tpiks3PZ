package Object;

import java.util.Objects;

public class Test implements Cloneable{
    private int a;
    private int b;

    public Test() {
    }

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Test{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return a == test.a && b == test.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try{
            return super.clone();
        }catch (CloneNotSupportedException ex){
            System.out.println("Ошибка при клонировании объекта");
        }
        return null;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Объект удален: а="+ a+", b="+b);
    }
}
