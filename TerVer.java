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
public class TerVer {
    
    static double Hi2(int[] falling ,double[] EmperialLaw, int numberOfElements)
    {
        double value=0;
        for(int i=0; i<5; i++)
        {
            value += ((((double)falling[ i ]/numberOfElements) - EmperialLaw[i] )
                    *(((double)falling[ i ]/numberOfElements) - EmperialLaw[i] )) / EmperialLaw[i] ;
        }
        return value;//System.out.println(hi2N3);
    }
    
    static double[] EmpiricalLaw(double min, double dx)
    {
        double [] value = new double[5];
        for (int i=0; i<5; i++) 
            value[i]=Math.exp((double)-(2.0*min + (2.0*i +1.0) * dx )*(2*min + (2*i +1) * dx )/8 )/Math.sqrt( 2.0* Math.PI);
        return value;
    }

}
