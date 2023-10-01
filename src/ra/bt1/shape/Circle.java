package ra.bt1.shape;


import ra.bt1.edittable.Resizeable;

public class Circle implements Resizeable {
    private final double PI = 3.14 ;
    private double radius ;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double dienTich() {
        return PI * radius *radius ;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius * ( 1 + percent / 100) ;
    }
}
