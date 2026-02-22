package org.example;

//IsocelesRightTriangle Class for inheritance of the RightTriangle class behavior
//By extending RightTriangle which also extends the initial Shape class
public class IsocelesRightTriangle extends RightTriangle {

    //A Isocles Right Triangle can be hypotenuse
    //Where the legs are congruent in length and width
    public IsocelesRightTriangle(int par) {
        super(par, par, par);  //IsocelesRightTriangle calls RightTriangle with the constructed super
    }

    @Override
    public String toString() {
        return String.format("IsocelesRightTriangle [par=%.2f]", base);
    }
}

