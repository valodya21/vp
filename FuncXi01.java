package vp1;

// @author valodya21

public class FuncXi01 extends Func
{
    public double Xi01(double alpha1, double alpha2)
    {
        double answer = (Math.sqrt( -2.0*Math.log10(alpha1))*Math.cos(2.0*Math.PI*alpha2));
        value = answer;
        return value;
    }
    
    public double Xi01(){return Xi01(Math.random(),Math.random());}
}
