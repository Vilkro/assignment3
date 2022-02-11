package com.company;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Square square = new Square();
        shape.setColor("Blue");
        shape.setFilled(false);
        rectangle.setLength(3.0);
        rectangle.setWidth(2.5);
        circle.setRadius(2.22);
        square.setSide(3.0);
        System.out.println(shape.toString());
        System.out.println(rectangle.toString());
        System.out.println(circle.toString());
        System.out.println(square.toString());
        System.out.println("Area of the circle is " + circle.getArea() + " and perimeter is " + circle.getPerimeter());
    }
}
