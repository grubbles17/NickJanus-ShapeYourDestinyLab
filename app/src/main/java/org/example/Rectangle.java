package org.example;

//Also implements newly made Polygon with the function to combine classes to the interface
public class Rectangle extends Shape implements Polygon {
    protected final double width;
    protected double height;

    //Begin the constructor
    public Rectangle(double width, double height) {
        if ( width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Enter a positive integer.");
        }
        this.width = height;
        this.height = width;
    }

    public Rectangle(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return String.format("Rectangle [width=%.2f, height=%.2f]", width, height);
    }

    @Override
    public int numberOfSides() {
        return 4;
    }

}

