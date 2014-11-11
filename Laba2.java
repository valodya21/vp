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
    int numberOfElement = 1000;
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
    
    public void makeFunc()
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
        System.out.println("1*dx: "+(double)inDxN12[0]/10);
        System.out.println("2*dx: "+(double)inDxN12[1]/10);
        System.out.println("3*dx: "+(double)inDxN12[2]/10);
        System.out.println("4*dx: "+(double)inDxN12[3]/10);
        System.out.println("5*dx: "+(double)inDxN12[4]/10);
        int total= inDxN12[0]+inDxN12[1]+inDxN12[2]+inDxN12[3]+inDxN12[4];
        System.out.println("total:"+total/10);
        
        System.out.println("");
        System.out.println("for N48");
        System.out.println("1*dx: "+(double)inDxN48[0]/10);
        System.out.println("2*dx: "+(double)inDxN48[1]/10);
        System.out.println("3*dx: "+(double)inDxN48[2]/10);
        System.out.println("4*dx: "+(double)inDxN48[3]/10);
        System.out.println("5*dx: "+(double)inDxN48[4]/10);
        total= inDxN48[0]+inDxN48[1]+inDxN48[2]+inDxN48[3]+inDxN48[4];
        System.out.println("total:"+total/10);
        
        System.out.println("");
        System.out.println("for N3");
        System.out.println("1*dx: "+(double)inDxN3[0]/10);
        System.out.println("2*dx: "+(double)inDxN3[1]/10);
        System.out.println("3*dx: "+(double)inDxN3[2]/10);
        System.out.println("4*dx: "+(double)inDxN3[3]/10);
        System.out.println("5*dx: "+(double)inDxN3[4]/10);
        total= inDxN3[0]+inDxN3[1]+inDxN3[2]+inDxN3[3]+inDxN3[4];
        System.out.println("total:"+total/10);
        
    }  
    
}
