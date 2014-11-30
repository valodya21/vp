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
public class FuncG extends FuncXi02
{
    public double G(double n, int i)
    {
        value  = 1.0/Math.pow((1.0+Math.PI*i), 2*n);
        return value;
    }
    
    public double G(int i)
    {
        return G(2, i); 
    }
    
}
