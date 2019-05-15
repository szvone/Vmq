package com.vone.mq.utils;

import org.junit.Assert;
import org.junit.Test;

public class ArithTest {

    @Test
    public void testAdd() {
        Assert.assertEquals(6.0, Arith.add(2.5, 3.5), 0);
        Assert.assertEquals(6.06, Arith.add(2.53, 3.53), 0);
    }

    @Test
    public void testSub() {
        Assert.assertEquals(4.5, Arith.sub(10.5, 6.0), 0);
        Assert.assertEquals(4.56, Arith.sub(10.58, 6.02), 0);
    }

    @Test
    public void testMul() {
        Assert.assertEquals(7.5, Arith.mul(2.5, 3.0), 0);
        Assert.assertEquals(7.6356, Arith.mul(2.52, 3.03), 0);
    }

    @Test
    public void testDiv() {
        Assert.assertEquals(4.4, Arith.div(8.8, 2.0), 0);
        Assert.assertEquals(4.3762376238, Arith.div(8.84, 2.02), 0);
    }

    @Test
    public void testRound() {
        Assert.assertEquals(9.0, Arith.round(8.8, 0), 0);
        Assert.assertEquals(8.9, Arith.round(8.86, 1), 0);
        Assert.assertEquals(8.87, Arith.round(8.867, 2), 0);
    }
}
