package org.example;

public class RightTriangle extends Shape {
    protected final double base;
    protected double height;

    public RightTriangle(int par, int par1, int par2) {
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

}
