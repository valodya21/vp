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
public class FuncEpsilon extends FuncG
{
    public double Epsilon(double lambda, double X, double Y, double t)
    {
        double answer;
        answer = Math.cos(lambda*t)*X + Math.sin(lambda*t)*Y;
        return answer;
    }
    
    public double Epsilon(double[] lambda, double[] X, double[] Y, double t, int M)
    {
        double answer=0;
        for(int i=0; i<M; i++)
            answer += Epsilon(lambda[i], X[i], Y[i], t);
        return answer;
    }
}
