package ra.bt4;

public class Retangle extends Shape{
    double width, height;

    public Retangle() {
    }

    public Retangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public void display() {
        super.display();
    }
}
