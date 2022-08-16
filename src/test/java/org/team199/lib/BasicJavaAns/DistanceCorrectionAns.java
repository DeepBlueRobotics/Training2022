package org.team199.lib.BasicJavaAns;

public class DistanceCorrectionAns {
    /** This is a very primitive implementation of something called "PID"
     *  You will use PID a lot when programming. We actually have a lib199 class that does it for you (I think)
     *  The specific implementation does involve calculus and whatnot, so we won't cover it in the main course
     *  However, just know that its basically error correction done with fancy calculus
     *  https://deep-blue-training.readthedocs.io/en/latest/section-7/pid-control/
     */
    public double correct(double error)
    {
        double kp = 0.5;
        return kp * error;
    }
}
