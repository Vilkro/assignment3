package com.company;

public class Square extends Rectangle{
    public Square(){
        super();
    }

    public Square(double side){
        super(side, side);
        setSide(side);
    }

    public Square(double side, String color, boolean filled){
        setSide(side);
        setColor(color);
        setFilled(filled);
    }

    public double getSide(){
        return length;
    }

    public void setSide(double side){
        this.width = side;
        this.length = side;
    }
    //sorry but I didn't get the way you described in the assignment task

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    public double getArea(){
        return getSide() * getSide();
    }

    public double getPerimeter(){
        return getSide() * 4;
    }

    @Override
    public String toString() {
        return "A Square with side=" + getSide() +
                ", which is a subclass of " + super.toString();
    }
}
