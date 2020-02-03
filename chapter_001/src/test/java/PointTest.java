package ru.Job4j.condition;
import org.junit.Assert;
import org.junit.Test;
import ru.Job4j.calculator.Fit;

public class PointTest {
    @Test
    public void distance() {
        double expected = 2.8284;
        double out = Point.distance(3,4,5,6);
        Assert.assertEquals(expected, out, 0.01);
    }
}
