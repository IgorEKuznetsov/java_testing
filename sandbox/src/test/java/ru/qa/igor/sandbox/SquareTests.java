package ru.qa.igor.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.qa.igor.sandbox.Square;

public class SquareTests {
    @Test
    public void testArea() {
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25);
    }
      public void testDistance(){
            Point p = new Point(2, 5, 6, 7);
             Assert.assertEquals(p.distance(), 16.1245154965971);
    }
}
