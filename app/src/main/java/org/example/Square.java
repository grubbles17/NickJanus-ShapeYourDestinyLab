package org.example;

//Square Class for inheritance of the Rectangle class behavior
//By extending Rectangle which also extends the initial Shape class
//Also implements newly made Polygon with the function to combine classes to the interface
public class Square extends Rectangle implements Polygon {

    //All squares have identical width/height
    public Square(double side) {
        super(side, side); //Square calls Rectangle with the constructed super
    }

    @Override
    public String toString() {
        return String.format("Square [side=%.2f]", width);
    }

     @Override
    public int numberOfSides() {
        return 4;
    }
    
}

