package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {
  // You can write your unit tests here.
  @Test
  void appWorks() {
    assertEquals(true, true);
  }

  @Test
    public void testCircle() {
        Circle c = new Circle();
        assertEquals(Math.PI * 25, c.getArea(), 0.0001);
        assertEquals(2 * Math.PI * 5, c.getPerimeter(), 0.0001);
    }

    @Test
    public void testRectangle() {
        Rectangle r = new Rectangle();
        assertEquals(24, r.getArea(), 0.0001);
        assertEquals(20, r.getPerimeter(), 0.0001);
    }

    @Test
    public void testRightTriangle() {
        RightTriangle t = new RightTriangle();
        assertEquals(6, t.getArea(), 0.0001);
        assertEquals(12, t.getPerimeter(), 0.0001); // 3 + 4 + (12 - 7)
    }

}
