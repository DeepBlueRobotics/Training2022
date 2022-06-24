package org.team199.lib.BasicJavaAns;

public class DistanceAns {

    /** This problem is more "mathy" then actual programming, but math is used heavily in more advanced topics
     *  This specific code is actually very useful for functions relating to limelight. When you have the time and
     *  experience, I'd suggest looking at the case studies of limelight. This is a direct application of the
     *  first case study: https://docs.limelightvision.io/en/latest/cs_estimating_distance.html
     * 
     *  We can solve for d using the following equation
     *  tan(mounting angle + angle to target) = (height of goal - height of robot) / d
     *  d = (heihgt of goal - height of robot) / tan(mounting angle + angle to target)
     *  
     */
    public static double dist(double heightGoal, double heightRobot, double mountAngle, double targetAngle)
    {
        double rad = Math.toRadians(mountAngle + targetAngle);
        return (heightGoal - heightRobot) / Math.tan(rad);
    }
    
}
