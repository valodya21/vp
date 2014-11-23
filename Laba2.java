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
public class Laba2 {
    int numberOfElement = 100;
    public FuncXi[] xiN12 = new FuncXi[numberOfElement];
    public FuncXi[] xiN48 = new FuncXi[numberOfElement];
    public FuncXi[] xiN3  = new FuncXi[numberOfElement];
    
    double maxXiN12, minXiN12;
    double maxXiN48, minXiN48;
    double maxXiN3 , minXiN3;
    
    double rXiN12, rXiN48, rXiN3;
    
    double dxXiN12, dxXiN48, dxXiN3;
    
    int inDxN12[] = new int[5];
    int inDxN48[] = new int[5];
    int  inDxN3[] = new int[5];
    
    int totalInDx12;
    int totalInDx48;
    int totalInDx3;
    
    double hi2N12, hi2N48, hi2N3;
    
    public void p2()
    {   
        for(int i=0; i<numberOfElement; i++)
        {
            xiN12[i] = new FuncXi();
            xiN48[i] = new FuncXi();
            xiN3[i] = new FuncXi();
            
            xiN12[i].Xi(12);
            xiN48[i].Xi(48);
            xiN3[i].Xi(3);
        }
        
        maxXiN12 = xiN12[0].value();
        maxXiN48 = xiN48[0].value();
        maxXiN3  = xiN3[0].value();
        
        minXiN12 = xiN12[0].value();
        minXiN48 = xiN48[0].value();
        minXiN3  = xiN3[0].value();
        
        for(int i=0; i< numberOfElement; i++)
        {
            if(maxXiN12 <= xiN12[i].value()) maxXiN12 = xiN12[i].value();
            if(minXiN12 >= xiN12[i].value()) minXiN12 = xiN12[i].value();
        
            if(maxXiN48 <= xiN48[i].value()) maxXiN48 = xiN48[i].value();
            if(minXiN48 >= xiN48[i].value()) minXiN48 = xiN48[i].value();
        
            if(maxXiN3  <= xiN3[i].value()) maxXiN3 = xiN3[i].value();
            if(minXiN3  >= xiN3[i].value()) minXiN3 = xiN3[i].value();
            
        }
                
        System.out.println("");
        System.out.println("minXiN12 "+minXiN12);
        System.out.println("maxXiN12 "+maxXiN12);
        
        System.out.println("minXiN48 "+minXiN48);
        System.out.println("maxXiN48 "+maxXiN48);
        
        System.out.println("minXiN3 "+minXiN3);
        System.out.println("maxXiN3 "+maxXiN3);
        
        
        rXiN12 = maxXiN12 - minXiN12;
        rXiN48 = maxXiN48 - minXiN48;
        rXiN3  = maxXiN3  - minXiN3;
        
        System.out.println("");
        System.out.println("rXiN12 "+rXiN12);
        System.out.println("rXiN48 "+rXiN48);
        System.out.println("rXiN3  "+rXiN3);
        
        dxXiN12 = rXiN12/5.0;
        dxXiN48 = rXiN48/5.0;
        dxXiN3  = rXiN3/5.0;
                
        System.out.println("");
        System.out.println("dxXiN12 "+dxXiN12);
        System.out.println("dxXiN48 "+dxXiN48);
        System.out.println("dxXiN3  "+dxXiN3);
        
        for(int i = 0; i < numberOfElement; i++)
        {
            if(xiN12[i].value() <= (minXiN12 + 1.0*dxXiN12))  inDxN12[0]++;
            
            if((xiN12[i].value() > (minXiN12 + 1.0*dxXiN12))
            &&(xiN12[i].value() <= (minXiN12 + 2.0*dxXiN12))) inDxN12[1]++;
            
            if((xiN12[i].value() > (minXiN12 + 2.0*dxXiN12))
            &&(xiN12[i].value() <= (minXiN12 + 3.0*dxXiN12))) inDxN12[2]++;
         
            if((xiN12[i].value() > (minXiN12 + 3.0*dxXiN12))
            &&(xiN12[i].value() <= (minXiN12 + 4.0*dxXiN12))) inDxN12[3]++;
            
            if((xiN12[i].value() > (minXiN12 + 4.0*dxXiN12))
            &&(xiN12[i].value() <= (minXiN12 + 5.0*dxXiN12))) inDxN12[4]++;
            
           
            if(xiN48[i].value() <= (minXiN48 + 1.0*dxXiN48))  inDxN48[0]++;
            
            if((xiN48[i].value() > (minXiN48 + 1.0*dxXiN48))
            &&(xiN48[i].value() <= (minXiN48 + 2.0*dxXiN48))) inDxN48[1]++;
            
            if((xiN48[i].value() > (minXiN48 + 2.0*dxXiN48))
            &&(xiN48[i].value() <= (minXiN48 + 3.0*dxXiN48))) inDxN48[2]++;
         
            if((xiN48[i].value() > (minXiN48 + 3.0*dxXiN48))
            &&(xiN48[i].value() <= (minXiN48 + 4.0*dxXiN48))) inDxN48[3]++;
            
            if((xiN48[i].value() > (minXiN48 + 4.0*dxXiN48))
            &&(xiN48[i].value() <= (minXiN48 + 5.0*dxXiN48))) inDxN48[4]++;
            
            
            if(xiN3[i].value() <= (minXiN3 + 1.0*dxXiN3))  inDxN3[0]++;
            
            if((xiN3[i].value() > (minXiN3 + 1.0*dxXiN3))
            &&(xiN3[i].value() <= (minXiN3 + 2.0*dxXiN3))) inDxN3[1]++;
            
            if((xiN3[i].value() > (minXiN3 + 2.0*dxXiN3))
            &&(xiN3[i].value() <= (minXiN3 + 3.0*dxXiN3))) inDxN3[2]++;
         
            if((xiN3[i].value() > (minXiN3 + 3.0*dxXiN3))
            &&(xiN3[i].value() <= (minXiN3 + 4.0*dxXiN3))) inDxN3[3]++;
            
            if((xiN3[i].value() > (minXiN3 + 4.0*dxXiN3))
            &&(xiN3[i].value() <= (minXiN3 + 5.0*dxXiN3))) inDxN3[4]++;
        }
        System.out.println("");
        System.out.println("for N12");
        System.out.println("1*dx: "+(double)inDxN12[0]/numberOfElement);
        System.out.println("2*dx: "+(double)inDxN12[1]/numberOfElement);
        System.out.println("3*dx: "+(double)inDxN12[2]/numberOfElement);
        System.out.println("4*dx: "+(double)inDxN12[3]/numberOfElement);
        System.out.println("5*dx: "+(double)inDxN12[4]/numberOfElement);
        float total= inDxN12[0]+inDxN12[1]+inDxN12[2]+inDxN12[3]+inDxN12[4];
        System.out.println("total:"+total/numberOfElement);
        
        System.out.println("");
        System.out.println("for N48");
        System.out.println("1*dx: "+(double)inDxN48[0]/numberOfElement);
        System.out.println("2*dx: "+(double)inDxN48[1]/numberOfElement);
        System.out.println("3*dx: "+(double)inDxN48[2]/numberOfElement);
        System.out.println("4*dx: "+(double)inDxN48[3]/numberOfElement);
        System.out.println("5*dx: "+(double)inDxN48[4]/numberOfElement);
        total= inDxN48[0]+inDxN48[1]+inDxN48[2]+inDxN48[3]+inDxN48[4];
        System.out.println("total:"+total/numberOfElement);
        
        System.out.println("");
        System.out.println("for N3");
        System.out.println("1*dx: "+(double)inDxN3[0]/numberOfElement);
        System.out.println("2*dx: "+(double)inDxN3[1]/numberOfElement);
        System.out.println("3*dx: "+(double)inDxN3[2]/numberOfElement);
        System.out.println("4*dx: "+(double)inDxN3[3]/numberOfElement);
        System.out.println("5*dx: "+(double)inDxN3[4]/numberOfElement);
        total= inDxN3[0]+inDxN3[1]+inDxN3[2]+inDxN3[3]+inDxN3[4];
        System.out.println("total:"+total/numberOfElement);
        
        
        System.out.println("\nxi^2 for n12");
        hi2N12=0;
	for(int i=0; i<5; i++)
	{
		hi2N12 += ((((double)inDxN12[ i ]/numberOfElement) - 0.2 )
                      *(((double)inDxN12[ i ]/numberOfElement) - 0.2 )) / 0.2;
	}
        System.out.println(hi2N12);
        
        System.out.println("\nxi^2 for n48");
        hi2N48=0;
	for(int i=0; i<5; i++)
	{
		hi2N48 += ((((double)inDxN48[ i ]/numberOfElement) - 0.2 )
                      *(((double)inDxN48[ i ]/numberOfElement) - 0.2 )) / 0.2;
	}
        System.out.println(hi2N48);
                
        System.out.println("\nxi^2 for n3");
        hi2N3=0;
	for(int i=0; i<5; i++)
	{
		hi2N3 += ((((double)inDxN3[ i ]/numberOfElement) - 0.2 )
                      *(((double)inDxN3[ i ]/numberOfElement) - 0.2 )) / 0.2;
	}
        System.out.println(hi2N3);
        
        System.out.println("\nEmpirical law for n12");
        for(short i=0; i<5; i++)
        {
            System.out.println(Math.exp( (double)-(2.0*minXiN12 + (2.0*i +1.0) * dxXiN12 )*(2*minXiN12 + (2*i +1) * dxXiN12 )/8 )/Math.sqrt( 2.0* 3.14));
        }
        
        System.out.println("\nEmpirical law for n48");
        for(short i=0; i<5; i++)
        {
            System.out.println(Math.exp( (double)-(2.0*minXiN48 + (2.0*i +1.0) * dxXiN48 )*(2*minXiN48 + (2*i +1) * dxXiN48 )/8 )/Math.sqrt( 2.0* 3.14));
        }
        
        System.out.println("\nEmpirical law for n3");
        for(short i=0; i<5; i++)
        {
            System.out.println(Math.exp( (double)-(2.0*minXiN3 + (2.0*i +1.0) * dxXiN3 )*(2*minXiN3 + (2*i +1) * dxXiN3 )/8 )/Math.sqrt( 2.0* 3.14));
        }
    }  
    
    public void p1()
    {
        FuncXi func0 = new FuncXi();
        System.out.println(func0.Xi());
        
        FuncXi func1 = new FuncXi01();
        System.out.println(func1.Xi());
        
        FuncXi func2 = new FuncXi02();
        System.out.println(func2.Xi());
    }        
          
}
