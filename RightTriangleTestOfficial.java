
import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Triangle
 * 
 * @author Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class RightTriangleTestOfficial
{
    /**
     * the right triangle test
     */
    @Test
    public void testTriangle()
    {
        RightTriangle a = new RightTriangle(new Point(100, 100), 200, 200, Color.BLUE, true);
        RightTriangle b = new RightTriangle(new Point(100, 100), 200, 200, Color.RED, false);
        
        Assert.assertEquals(new Point(100, 100), a.getLocation()[1]);
        Assert.assertEquals(new Point(100, 100), b.getLocation()[1]);
        
        Assert.assertEquals(new Point(100, 300), a.getLocation()[0]);
        Assert.assertEquals(new Point(100, 300), b.getLocation()[0]);
        
        Assert.assertEquals(new Point(300, 100), a.getLocation()[2]);
        Assert.assertEquals(new Point(300, 100), b.getLocation()[2]);
        
        Assert.assertEquals(Color.BLUE, a.getColor());
        Assert.assertEquals(Color.RED, b.getColor());
        
        Assert.assertEquals(true, a.isFilled());
        Assert.assertEquals(false, b.isFilled());
        
    }
}
