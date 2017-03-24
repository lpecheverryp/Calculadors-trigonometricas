/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorstrigonometrica;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.tan;

/**
 *
 * @author estudiantes
 */
public class Operar {
      double n1;
    double n2;
    double n3;
  
    
    public double Sumar(){
        
        return(n1+n2);
        
    }
    
    public double Multiplicar(){
        
        return(n1*n2);
        
    }

    public double Dividir(){
        
        return(n1/n2);
        
    }
    
    public double Restar(){
        
        return(n1-n2);
        
    }
    
    public double Seno(){
   
    return(sin(n3* Math.PI/180.0));
    }
    
    
    public double Coseno(){
   
    return(cos(n3* Math.PI/180.0));
    }
    
    
     public double Tangente(){
   
    return(tan(n3* Math.PI/180.0));
    }
     
     public double Cotangente(){
   
    return(1/tan(n3* Math.PI/180.0));
    }
     
   
     
     public double Secante(){
   
    return(1/cos(n3* Math.PI/180.0));
    }
     
     public double Cosecante(){
   
    return(1/sin(n3* Math.PI/180.0));
    }

     
    
   
}
