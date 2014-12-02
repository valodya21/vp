package vp1;

//@author valodya21

public class FuncXi02 extends FuncXi01
{
    public double Xi02(double alpha1, double alpha2)
    {
        double answer = (Math.sqrt( -2.0*Math.log10(alpha1))*Math.sin(2.0*Math.PI*alpha2));        
        value = answer;
        return value;
    }
    
    public double Xi02(){return Xi02(Math.random(),Math.random());}
}
