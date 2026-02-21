package org.example;

public class RightTriangle extends Shape {
    private final double base;
    private double height;

    public RightTriangle() {
        this.base = height;
        this.height = base;
    }

    @Override
    public double getArea() {
        System.out.println("RightTriangle Area");
        return 0.5 * base * height;
    }

    @Override
    public double getPerimeter() {
        System.out.println("RightTriangle Perimeter");
        double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse;
    }

}
