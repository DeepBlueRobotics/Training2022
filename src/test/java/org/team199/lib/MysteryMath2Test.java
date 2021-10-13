package org.team199.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class MysteryMath2Test {
    @Test
    public void testQuadratic() {
        //assertEquals(-1, MysteryMath2.quadraticFormula(1, -7, 12), 0.01);
        assertEquals(-1, MysteryMath2.quadraticFormula(1, 1, 4), 0.01);
    }
}