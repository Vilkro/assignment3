package com.company;

public class Rectangle extends Shape{
    double width;
    double length;

    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double width, double length){
        setWidth(width);
        setLength(length);
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        double area = getWidth() * getLength();
        return area;
    }

    public double getPerimeter(){
        double perimeter = getWidth() + getLength() + getWidth() + getLength();
        return perimeter;
    }

    @Override
    public String toString() {
        return "A Rectangle with width=" + getWidth() +
                " and length=" + getLength() +
                ", which is a subclass of " + super.toString();
    }
}
