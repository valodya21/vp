package vp1;

//@author valodya21

public class Laba3 {
    public void p1()
    {
        FuncEpsilon func = new FuncEpsilon();
        int M = 55;
        
        double []Z1         = new double[M];
        double []Z2         = new double[M];
        double []GArr       = new double[M];
        double []x_i        = new double[M];
        double []y_i        = new double[M];
        double []lambda1    = new double[M];
        double []lambda2    = new double[M];
        double []epsilon1   = new double[100];
        double []epsilon2   = new double[100];
        int    []interval1;
        int    []interval2;
        
        for(int j=0;j<100;j++)
        { 
            for(int i=0;i<M;i++)
            {
                Z1[i]=func.Xi01();
                Z2[i]=func.Xi02();
                GArr[i]=func.G(i);

                x_i[i]=GArr[i]*Z1[i];
                y_i[i]=GArr[i]*Z2[i];

                lambda1[i]= (double)i*Math.PI;
                lambda2[i]= lambda1[i]+(Math.PI*Math.random());
            }
            epsilon1[j]=func.Epsilon(lambda1, x_i, y_i, j, M);
            epsilon2[j]=func.Epsilon(lambda2, x_i, y_i, j, M);
        }
        interval1=TerVer.variance(epsilon1, 5);
        interval2=TerVer.variance(epsilon2, 5);
        
        System.out.println("for Xi1(t)");
        System.out.println("min: "+TerVer.min(epsilon1));
        System.out.println("max: "+TerVer.max(epsilon1));
        System.out.println("Average: "+TerVer.avarge(epsilon1));
        System.out.println("Intervals");
        for(int i=1; i<6; i++)
            System.out.println(i+": "+interval1[i-1]);
        
        System.out.println("");
        
        System.out.println("for Xi2(t)");
        System.out.println("min: "+TerVer.min(epsilon2));
        System.out.println("max: "+TerVer.max(epsilon2));
        System.out.println("Average: "+TerVer.avarge(epsilon2));
        System.out.println("Intervals");
        for(int i=1; i<6; i++)
            System.out.println(i+": "+interval2[i-1]);
        
        System.out.println("~~~~~~~~~~~~~~~~~~");
    }
}
