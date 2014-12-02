package vp1;

// @author valodya21

public class FuncEpsilon extends FuncG
{
    public double Epsilon(double lambda, double X, double Y, double t)
    {
        double answer = Math.cos(lambda*t)*X + Math.sin(lambda*t)*Y;
        value= answer;
        return answer;
    }
    
    public double Epsilon(double[] lambda, double[] X, double[] Y, double t, int M)
    {
        double answer=0;
        for(int i=0; i<M; i++)
            answer += Epsilon(lambda[i], X[i], Y[i], t);
        value= answer;
        return answer;
    }
}
