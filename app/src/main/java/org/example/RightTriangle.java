package org.example;

//Also implements newly made Polygon with the function to combine classes to the interface
public class RightTriangle extends Shape implements Polygon {
    protected final double base;
    protected double height;

    public RightTriangle(int par, int par1) {
        this.base = height;
        this.height = base;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public double getPerimeter() {
        double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse;
    }

    @Override
    public int numberOfSides() {
        return 3;
    }

}
