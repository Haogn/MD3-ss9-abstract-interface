package ra.bt4;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(15.0, "red");
        shapes[1] = new Retangle(15.0, 15.0, "blue");

        System.out.println(shapes[0].getArea());
        shapes[0].display();

        System.out.println(shapes[1].getArea());
        shapes[1].display();
    }
}
