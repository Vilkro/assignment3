package com.company;

public class Circle extends Shape{
    private double radius;

    public Circle(){
        radius = 1.0;
    }

    public Circle(double radius){
        setRadius(radius);
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area = 3.14 * Math.pow(getRadius(), 2);
        return area;
    }

    public double getPerimeter(){
        double perimeter = 3.14 * 2 * getRadius();
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle with " +
                "radius=" + getRadius() +
                ", which is a subclass of " + super.toString();
    }
}
