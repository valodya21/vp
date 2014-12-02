package vp1;

//@author valodya21

public class Laba2
{
    static void p2_(int nForXi, int numberOfElement)
    {
        Func[] xi = new Func[numberOfElement];
    
        double max, min;
        double r, dx;
        double total;
        double hi2;
        
        int inDx[];
        double Emp[];
        
        for(int i=0; i<numberOfElement; i++)
        {
            xi[i] = new Func();
            xi[i].Xi(nForXi);
        }
        
        max = Func.max(xi);        
        min = Func.min(xi);
        
        r = max - min;      
        dx = r/5.0;
                
        inDx=Func.variance(xi, 5);
        
        total= inDx[0]+inDx[1]+inDx[2]+inDx[3]+inDx[4];
        
        Emp=TerVer.EmpiricalLaw(min, dx);
        hi2=TerVer.Hi2(inDx, Emp, numberOfElement);
        
        System.out.println("\n------------------");
        System.out.println("Xi for n = "+nForXi);
        System.out.println("Number of elements: "+numberOfElement);
        System.out.println("min of Xi: "+min);
        System.out.println("max of Xi: "+max);
        System.out.println("R = max - min: "+r);
        System.out.println("dx = R/5: "+dx);
        System.out.println("\nhits in the gap between");
        for(int i=0; i<5;i++)
            System.out.println(i+"*dx and "+(i+1)+"*dx: "+ (double)inDx[i]/numberOfElement);
        System.out.println("total hits: "+total/numberOfElement);
      
        System.out.println("\nEmpirical law");
        for(short i=0; i<5; i++)
            System.out.println(Emp[i]);
        
        System.out.println("\nxi^2: "+hi2);
        System.out.println("==================\n");
    };
    
    static void p2()
    {
        p2_(12, 100);
        p2_(48, 100);
        p2_(3, 100);
    }
    
    static void p1()
    {
        FuncXi02 func = new FuncXi02();
        System.out.println("Fucn Xi  = "+func.Xi());
        System.out.println("Fucn Xi1 = "+func.Xi01());
        System.out.println("Fucn Xi2 = "+func.Xi02());
    }
}
