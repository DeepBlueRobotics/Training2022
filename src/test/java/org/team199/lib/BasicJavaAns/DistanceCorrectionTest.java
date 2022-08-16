package org.team199.lib.BasicJavaAns;

import org.junit.Ignore;
import org.junit.Test;
import org.team199.lib.BasicJava.DistanceCorrection;

public class DistanceCorrectionTest {
    @Ignore
    public void testDistance() {
        for (int i = 0; i < 20; i++) {
            double error = (Math.random()*100);
            for (int j = 0; j < 20; j++)
            {
                //error -= DistanceCorrection.correct(error);
            }
            //assertEquals(0, DistanceCorrection.correct(error), 0.01);
        }
    }
}
