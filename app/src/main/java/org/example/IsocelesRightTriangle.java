package org.example;

//IsocelesRightTriangle Class for inheritance of the RightTriangle class behavior
//By extending RightTriangle which also extends the initial Shape class
//Also implements newly made Polygon with the function to combine classes to the interface
public class IsocelesRightTriangle extends RightTriangle implements Polygon {

    //A Isocles Right Triangle can be hypotenuse
    //Where the legs are congruent in length and width
    public IsocelesRightTriangle(int par) {
        super(par, par);  //IsocelesRightTriangle calls RightTriangle with the constructed super
    }

    @Override
    public String toString() {
        return String.format("IsocelesRightTriangle [par=%.2f]", base);
    }

    @Override
    public int numberOfSides() {
        return 3;
    }

}


