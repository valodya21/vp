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
    
    static double avarge(double[] arr)
    {
        double answer=0;
        for(int i=0; i<arr.length;i++)
            answer+= arr[i];
        answer /= 100;
        return answer;
    }
    
    static double min(double[] arr)
    {
        double min=arr[0];
        for (double arr1 : arr) if (min >= arr1) min = arr1;
        return min;
    }
    
    static double max(double[] arr)
    {
        double max=arr[0];
        for (double arr1 : arr) if (max <= arr1) max = arr1;
        return max;
    }
    
    static int[] variance(double[] arr,int interval)
    {
        double min = min(arr), max = max(arr);
        double dx = (max-min)/interval;
        int []hits = new int[interval];
        for(int i = 0; i < arr.length; i++)
        {
            for(int j=0;j<interval;j++)
            {
                if((arr[i] >= (min + j*dx))
                &&(arr[i] <= (min + (j+1)*dx))) hits[j]++;
            }
        }
                
        return hits;
    }

}
