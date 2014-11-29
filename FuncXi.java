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
public class FuncXi {
    
    double value;
    
    double alfa[];
    
    public double value()
    {
        return value;
    }
    
    public double alfa(int n)
    {
        if(alfa.length >= n) return alfa[n];
        else return -1;
    }
    
    public double Xi()
    {
        return Xi(12);   
    }
    
    public double Xi(int nForXi)
    {
        if(nForXi <= 0) return -1;
        alfa = new double[nForXi];
        double answer;
        double toDevision = (double)12/nForXi;
        answer = Math.sqrt(toDevision);
        
        double sum = 0;
        for(int i= 1; i<=nForXi ; i++)
        {
            alfa[i-1] = Math.random();
            sum += (alfa[i-1] -  0.5);    
        }
        answer *= sum;
        value = answer;
        return answer;
    }
    
    static double max(FuncXi[] arr)
    {
        double max=arr[0].value();
        for(int i=0; i<arr.length;i++) if(max <= arr[i].value()) max = arr[i].value();
        return max;
    }
    
    static double min(FuncXi[] arr)
    {
        double min=arr[0].value();
        for(int i=0; i<arr.length;i++) if(min >= arr[i].value()) min = arr[i].value();
        return min;
    }
    
}
