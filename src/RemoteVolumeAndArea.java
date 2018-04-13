
import java.rmi.*;

public interface RemoteVolumeAndArea extends Remote{
    
    public double calculateCylinderArea (double radio, double height) throws RemoteException;
    public double calculateCylinderVolume (double radio, double altura) throws RemoteException;
    public double calculateSphereArea (double radio) throws RemoteException;
    public double calculateSphereVolume (double radio) throws RemoteException;
    public double calculateCubeArea (double side) throws RemoteException;
    public double calculateCubeVolume (double side) throws RemoteException;
    public double calculateConeArea (double radio, double generatrix) throws RemoteException;
    public double calculateConeVolume (double radio, double height) throws RemoteException;
    public double calculateOrthohedronArea (double alto, double width, double deep) throws RemoteException;
    public double calculateOrthohedronVolume (double alto, double width, double deep) throws RemoteException;
    
 
}                                                                                                                                                                                          