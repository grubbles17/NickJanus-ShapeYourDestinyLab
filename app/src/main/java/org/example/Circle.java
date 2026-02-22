package org.example;

public class Circle extends Shape {
    private double radius;
    private final double newRadius;

    public Circle(int par) {
        if ( radius <= 0) {
            throw new IllegalArgumentException("Enter a positive integer.");
        }
        this.newRadius = radius;
        this.radius = newRadius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

}

