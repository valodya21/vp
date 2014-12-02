package vp1;

//@author valodya21

public class FuncG extends FuncXi02
{
    public double G(double n, int i)
    {
        double answer = 1.0/Math.pow((1.0+Math.PI*i), 2*n);
        value = answer;
        return value;
    }
    
    public double G(int i){return G(2, i);}
}
