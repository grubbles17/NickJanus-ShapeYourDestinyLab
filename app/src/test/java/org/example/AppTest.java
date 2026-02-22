package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class AppTest {
  // You can write your unit tests here.
  @Test
  void appWorks() {
    assertEquals(true, true);
  }

  @Test
    public void testCircle() {
        Circle c = new Circle(3);
        assertEquals(Math.PI * 25, c.getArea());
        assertEquals(2 * Math.PI * 5, c.getPerimeter());
    }

    @Test
        public void testRectangle() {
        Rectangle r = new Rectangle(4, 6);
        assertEquals(24, r.getArea());
        assertEquals(20, r.getPerimeter());
    }

    @Test
    public void testRightTriangle() {
        RightTriangle t = new RightTriangle(3, 4);
        assertEquals(6, t.getArea());
        assertEquals(12, t.getPerimeter()); // 3 + 4 + (12 - 7)
    }

    @Test
    void testRectangleAreaAndPerimeter() {
        Rectangle rect = new Rectangle(4, 6);
        assertEquals(24.0, rect.getArea(), 0.0001, "Area should be width * height");
        assertEquals(20.0, rect.getPerimeter(), 0.0001, "Perimeter should be 2*(width+height)");
    }

    @Test
    void testSquareAreaAndPerimeter() {
        Square square = new Square(5);
        assertEquals(25.0, square.getArea(), 0.0001, "Area should be side^2");
        assertEquals(20.0, square.getPerimeter(), 0.0001, "Perimeter should be 4*side");
    }

    @Test
    void testInheritance() {
        Square square = new Square(5);
        assertTrue(square instanceof Rectangle, "Square should be a Rectangle");
        assertTrue(square instanceof Shape, "Square should be a Shape");
    }

     @Test
    public void testRectangleSides() {
        Polygon rect = new Rectangle(5, 10);
        assertEquals(4, rect.numberOfSides(), "Rectangle should have 4 sides");
    }

    @Test
    public void testSquareSides() {
        Polygon square = new Square(6);
        assertEquals(4, square.numberOfSides(), "Square should have 4 sides");
    }

    @Test
    public void testRightTriangleSides() {
        Polygon triangle = new RightTriangle(3, 4);
        assertEquals(3, triangle.numberOfSides(), "Right triangle should have 3 sides");
    }

    @Test
    public void testIsoscelesRightTriangleSides() {
        Polygon isoTriangle = new IsoscelesRightTriangle(5);
        assertEquals(3, isoTriangle.numberOfSides(), "Isosceles right triangle should have 3 sides");
    }

    private static class IsoscelesRightTriangle implements Polygon {

        public IsoscelesRightTriangle(int i) {
        }

        @Override
        public int numberOfSides() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

}
