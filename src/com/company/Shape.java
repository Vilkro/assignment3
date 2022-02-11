package com.company;

public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        color = "green";
        filled = true;
    }

    public Shape(String color, boolean filled){
        setColor(color);
        setFilled(filled);
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        if(isFilled())
            return "A Shape with a color of " +
                     getColor() +
                    " and filled";
        else
            return "A Shape with a color of " +
                    getColor() +
                    " and Not filled";
    }
}
