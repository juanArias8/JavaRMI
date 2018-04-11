import java.rmi.*;
//import java.rmi.registry.*;
import java.rmi.server.*;
import java.net.*;

public class VolumenYarea extends UnicastRemoteObject implements VolumenYareaRemota{
    
     public double calcularACilindro (double radio, double altura) throws RemoteException{
        
        double r = radio, h = altura,areaC;               
        areaC = 2*Math.PI*r*(h+r);         
        return areaC;       
     }
       public double calcularVCilindro (double radio, double altura) throws RemoteException{
        
        double r = radio, h = altura,volC;                        
        volC = Math.PI*(r*r)*h;        
        return volC;       
     }
     
      public double calcularAEsfera (double radio) throws RemoteException{
        
        double r = radio, areaE;                       
        areaE = 4*Math.PI*(r*r);          
        return areaE;         
     }
      public double calcularVEsfera (double radio) throws RemoteException{
        
        double r = radio,volE;        
        volE = (4/3)*Math.PI*Math.pow(r, 3);        
        return volE; 
       
     }
      public double calcularACubo (double lado) throws RemoteException{
        
        double l = lado,areaC;    
        areaC = 6*(l*l);        
        return areaC;     
       
     }
      public double calcularVCubo (double lado) throws RemoteException{
        
        double l = lado,volC;       
        volC = Math.pow(l, 3);        
        return volC;     
       
     }
       public double calcularACono (double radio,  double generatriz) throws RemoteException{
        
        double r = radio,g= generatriz,areaC;           
        areaC = r*Math.PI*(g+r);         
        return areaC;       
     }
       public double calcularVCono (double radio, double altura) throws RemoteException{
        
        double r = radio, h = altura,volC;                   
        volC =  (1/3)*Math.PI*(r*r)*h;      
        return volC;       
     }
       public double calcularAOrtoedro (double alto, double ancho, double profundo){
        double h = alto, a = ancho, b = profundo,areaO;
        areaO = 2*((a*b)+ (a*h)+ (b*h));
        return areaO;
       }
       public double calcularVOrtoedro (double alto, double ancho, double profundo){
        double h = alto, a = ancho, b = profundo,volO;
        volO = a*b*h;
        return volO;
       }
       
     
}
