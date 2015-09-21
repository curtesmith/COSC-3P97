package com.github.curtesmith.libtests;



import com.github.curtesmith.lib.SimpleMath;

import org.junit.Test;
import org.junit.Assert;

public class SimpleMathTests {

    @Test
    public void addOnePlusOneShouldBeTwo() {
        Assert.assertEquals("1 + 1 did not equal 2", 2, SimpleMath.add(1,1));
    }
}
