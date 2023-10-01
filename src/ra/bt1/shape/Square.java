package ra.bt1.shape;

import ra.bt1.edittable.Resizeable;

public class Square implements Resizeable {
    private double a ;
    public Square() {

    }

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }

    public void setA(double a) {
        this.a = a;
    }

    public double dienTich() {
        return a*a ;
    }

    @Override
    public void resize(double percent) {
        this.a = this.a * ( 1 + percent / 100) ;
    }
}
