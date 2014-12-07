package vp1;

//@author valodya21

public class Func {
    double value;
    double alfa[];
    
    public double value(){return value;}
    
    public double alfa(int n)
    {
        if(alfa.length >= n) return alfa[n];
        else return -1;
    }
    
    public double Xi(){return Xi(12);}
    
    public double Xi(int nForXi)
    {
        if(nForXi <= 0) return -1;
        alfa = new double[nForXi];
        double answer;
        answer = Math.sqrt((double)12/nForXi);
        double sum = 0;
        for(int i= 0; i<nForXi ; i++){
            alfa[i] = Math.random();
            sum += (alfa[i] -  0.5);    
        }
        answer *= sum;
        value = answer;
        return answer;
    }
    
    static double[] toDouble(Func[] func)
    {
        double[] answer = new double[func.length];
        for(int i = 0; i<func.length; i++)
            answer[i] = func[i].value();
        return answer;
    }
    
    static double max(Func[] arr)
    {
        double max=arr[0].value();
        for (Func arr1 : arr) if (max <= arr1.value()) max = arr1.value();
        return max;
    }
    
    static double min(Func[] arr)
    {
        double min=arr[0].value();
        for (Func arr1 : arr) if (min >= arr1.value()) min = arr1.value();
        return min;
    }
}
