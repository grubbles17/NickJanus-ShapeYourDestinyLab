package org.example;

public class Circle extends Shape {
    private double radius;
    private final double newRadius;

    public Circle() {
        this.newRadius = radius;
        this.radius = newRadius;
    }

    @Override
    public double getArea() {
        System.out.println("Circle Area");
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        System.out.println("Circle Perimeter");
        return 2 * Math.PI * radius;
    }

}
