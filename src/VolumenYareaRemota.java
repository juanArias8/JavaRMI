
import java.rmi.*;

public interface VolumenYareaRemota extends Remote{
    
    public double calcularACilindro (double radio, double altura) throws RemoteException;
    public double calcularVCilindro (double radio, double altura) throws RemoteException;
    public double calcularAEsfera (double radio) throws RemoteException;
    public double calcularVEsfera (double radio) throws RemoteException;
    public double calcularACubo (double radio) throws RemoteException;
    public double calcularVCubo (double radio) throws RemoteException;
    public double calcularACono (double radio, double generatriz) throws RemoteException;
    public double calcularVCono (double radio, double altura) throws RemoteException;
    public double calcularAOrtoedro (double alto, double ancho, double profundo) throws RemoteException;
    public double calcularVOrtoedro (double alto, double ancho, double profundo) throws RemoteException;
    
 
}                                                                                                                                                                                          