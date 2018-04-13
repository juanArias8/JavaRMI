
import java.rmi.*;
import java.rmi.server.*;
import java.net.*;

public class VolumeAndArea extends UnicastRemoteObject implements RemoteVolumeAndArea {

    public VolumeAndArea() throws RemoteException {
        try {
            System.out.println("constructor!!");  
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public double calculateCylinderArea(double radio, double height) throws RemoteException {
        double r = radio;
        double h = height;
        double areaCylinder = 0;
        try {
            areaCylinder = 2 * Math.PI * r * (h + r);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return areaCylinder;
    }

    @Override
    public double calculateCylinderVolume(double radio, double height) throws RemoteException {
        double r = radio;
        double h = height;
        double volumeCylinder = 0;
        try {
            volumeCylinder = Math.PI * (r * r) * h;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return volumeCylinder;
    }

    @Override
    public double calculateSphereArea(double radio) throws RemoteException {
        double r = radio;
        double areaSphere = 0;
        try {
            areaSphere = 4 * Math.PI * (r * r);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return areaSphere;
    }

    @Override
    public double calculateSphereVolume(double radio) throws RemoteException {
        double r = radio;
        double volumeSphere = 0;
        try {
            volumeSphere = (4 / 3) * Math.PI * Math.pow(r, 3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return volumeSphere;
    }

    @Override
    public double calculateCubeArea(double side) throws RemoteException {
        double s = side;
        double areaCube = 0;
        try {
            areaCube = 6 * (s * s);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return areaCube;
    }

    @Override
    public double calculateCubeVolume(double side) throws RemoteException {
        double s = side;
        double volumeCube = 0;
        try {
            volumeCube = Math.pow(s, 3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return volumeCube;
    }

    @Override
    public double calculateConeArea(double radio, double generatrix) throws RemoteException {
        double r = radio;
        double g = generatrix;
        double areaCone = 0;
        try {
            areaCone = r * Math.PI * (g + r);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return areaCone;
    }

    @Override
    public double calculateConeVolume(double radio, double height) throws RemoteException {
        double r = radio;
        double h = height;
        double volumeCone=  0;
        try {
            volumeCone = (1 / 3) * Math.PI * (r * r) * h;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return volumeCone;
    }

    @Override
    public double calculateOrthohedronArea(double heigth, double width, double deep) {
        double h = heigth;
        double w = width;
        double d = deep;
        double areaOrthohedron = 0;
        try {
            areaOrthohedron = 2 * ((w * d) + (w * h) + (d * h));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return areaOrthohedron;
    }

    @Override
    public double calculateOrthohedronVolume(double heigth, double width, double deep) {
        double h = heigth;
        double w = width;
        double d = deep;
        double volO = 0;
        try {
            volO = w * d * h;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return volO;
    }
}
