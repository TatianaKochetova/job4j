package ru.job4j.condition;
import org.hamcrest.Matchers;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class SqMaxTest {
    @Test
    public void whenFirstMax() {
        SqMax check = new SqMax();
        int result = SqMax.max(6, 4, 7, 5);
        assertThat(result, Matchers.is(7));
    }
    @Test
    public void whenSecondMax() {
        SqMax check = new SqMax();
        int result = SqMax.max(2, 9, 4, 3);
        assertThat(result, Matchers.is(9));
    }
    @Test
    public void whenThirdMax() {
        SqMax check = new SqMax();
        int result = SqMax.max(0, 2, 4, 3);
        assertThat(result, Matchers.is(4));
    }
    @Test
    public void whenThereIsNoMax() {
        SqMax check = new SqMax();
        int result = SqMax.max(2, 2, 2, 2);
        assertThat(result, Matchers.is(2));
    }
}
