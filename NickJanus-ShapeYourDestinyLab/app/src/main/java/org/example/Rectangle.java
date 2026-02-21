package org.example;

public class Rectangle extends Shape {
    private final double width;
    private double height;

    public Rectangle() {
        this.width = height;
        this.height = width;
    }

    @Override
    public double getArea() {
        System.out.println("Rectangle Area");
        return width * height;
    }

    @Override
    public double getPerimeter() {
        System.out.println("Rectangle Perimeter");
        return 2 * (width + height);
    }

}
