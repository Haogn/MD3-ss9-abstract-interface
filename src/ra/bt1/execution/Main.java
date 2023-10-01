package ra.bt1.execution;

import ra.bt1.shape.Circle;
import ra.bt1.shape.Rectangle;
import ra.bt1.shape.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // hinh tron
        Circle circle = new Circle() ;
        circle.setRadius(100);
        System.out.println(circle);
        circle.resize(20);
        System.out.println(circle);
        System.out.println("Dien tich hinh tron " + circle.dienTich());

        System.out.println("_________________________________________");
        // hinh chua nhat
        Rectangle rectangle = new Rectangle() ;
        rectangle.setWidth(10);
        rectangle.setHeight(5);
        System.out.println(rectangle.toString());
        rectangle.resize(50);
        System.out.println("Dien tich hinh chu nhat "+ rectangle.dienTich());

        System.out.println("_________________________________________");
        Square square = new Square() ;
        square.setA(10);
        System.out.println(square.toString());
        square.resize(50);
        System.out.println("Dien tich hinh vuong " + square.dienTich());
    }
}
