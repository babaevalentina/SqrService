package ru.netology.sqr;

import junit.framework.TestCase;
import org.junit.Test;

public class SqrServiceTest {

    private TestCase Assertions;

    @Test
    public void shouldCalc() {
        SqrService service = new SqrService();
        int actual = service.calcSqr(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCalcZero() {
        SqrService service = new SqrService();
        int actual = service.calcSqr(0, 0);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCalcOver() {
        SqrService service = new SqrService();
        int actual = service.calcSqr(1000000, 1000000);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCalcExactMin() {
        SqrService service = new SqrService();
        int actual = service.calcSqr(100, 101);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCalcExactMax() {
        SqrService service = new SqrService();
        int actual = service.calcSqr(9801, 9802);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
}