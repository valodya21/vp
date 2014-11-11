/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vp1;

/**
 *
 * @author valodya21
 */
public class FuncXi01 extends FuncXi{
    
    public double Xi(double alpha1, double alpha2)
    {
        double answer;
        answer = (Math.sqrt( -2.0*Math.log10(alpha1))*Math.cos(2.0*3.14*alpha2));
        value = answer;
        return value;
    }
    
    public double Xi()
    {
        return Xi(Math.random(),Math.random());
    }
    
}
