package org.example;

public class App {
  public static void main(String[] args) {

    System.out.println("You can write a driver program for your code here!");


try {
//For Circle Area/Perimeter
  Circle myCircle = new Circle(3);

  System.out.println(myCircle);
  System.out.println("Circle Area: " + myCircle.getArea());
  System.out.println("Circle Perimeter: " + myCircle.getPerimeter());

  System.out.println(" ");
//For Rectangle and Square
  Rectangle myRectangle = new Rectangle(4, 8);
  Square mySquare = new Square(6);

//For Rectangle Area/Perimeter
  System.out.println(myRectangle);
  System.out.println("Rectangle Area: " + myRectangle.getArea());
  System.out.println("Rectangle Perimeter: " + myRectangle.getPerimeter());

  System.out.println(" ");
//For Square Area/Perimeter
  System.out.println(mySquare);
  System.out.println("Square Area: " + myRectangle.getArea());
  System.out.println("Square Perimeter: " + myRectangle.getPerimeter());

  System.out.println(" ");
//For RightTriangle and IsocelesRightTriangle
  RightTriangle myRightTriangle = new RightTriangle(3, 4, 5);
  IsocelesRightTriangle myIsocelesRightTriangle = new IsocelesRightTriangle(4);

  System.out.println(" ");
//For RightTriangle Area/Perimeter
  System.out.println(myRightTriangle);
  System.out.println("RightTriangle Area: " + myRightTriangle.getArea());
  System.out.println("RightTriangle Perimeter: " + myRightTriangle.getPerimeter());

//For IsocolesRightTriangle Area/Perimeter
  System.out.println(myIsocelesRightTriangle);
  System.out.println("IsocelesRightTriangle Area: " + myIsocelesRightTriangle.getArea());
  System.out.println("IsocelesRightTriangle Perimeter: " + myIsocelesRightTriangle.getPerimeter());

} catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
}
  }
}

