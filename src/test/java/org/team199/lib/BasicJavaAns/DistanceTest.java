/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.team199.lib.BasicJavaAns;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Random;

import org.junit.Test;
import org.team199.lib.BasicJava.Distance;

/**
 * Add your docs here.
 */
public class DistanceTest {
    @Test
    public void testDistance() {
        for (int i = 0; i < 20; i++) {
            int a = 1 + (int) (Math.random()*100);
            int b = 1 + (int) (Math.random()*100);
            if (b > a)
            {
                int temp = b;
                b = a;
                a = temp;
            }
            int c = (int)(Math.random()*90);
            int d = (int)(Math.random()*60) - 30;
            assertEquals(DistanceAns.dist(a, b, c, d), Distance.dist(a, b, c, d), 0.01);
        }
    }
}
