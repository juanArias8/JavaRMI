
import java.rmi.*;
import java.rmi.server.*;
import java.net.*;

public class VolumenArea extends UnicastRemoteObject implements RemotaVolumenArea {

    public VolumenArea() throws RemoteException {
        try {
            System.out.println("constructor!!");  
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public double calcularACilindro(double radio, double altura) throws RemoteException {
        double r = radio;
        double h = altura;
        double areaC = 0;
        try {
            areaC = 2 * Math.PI * r * (h + r);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return areaC;
    }

    @Override
    public double calcularVCilindro(double radio, double altura) throws RemoteException {
        double r = radio;
        double h = altura;
        double volC = 0;
        try {
            volC = Math.PI * (r * r) * h;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return volC;
    }

    @Override
    public double calcularAEsfera(double radio) throws RemoteException {
        double r = radio;
        double areaE = 0;
        try {
            areaE = 4 * Math.PI * (r * r);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return areaE;
    }

    @Override
    public double calcularVEsfera(double radio) throws RemoteException {
        double r = radio;
        double volE = 0;
        try {
            volE = (4 / 3) * Math.PI * Math.pow(r, 3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return volE;
    }

    @Override
    public double calcularACubo(double lado) throws RemoteException {
        double l = lado;
        double areaC = 0;
        try {
            areaC = 6 * (l * l);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return areaC;
    }

    @Override
    public double calcularVCubo(double lado) throws RemoteException {
        double l = lado;
        double volC = 0;
        try {
            volC = Math.pow(l, 3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return volC;
    }

    @Override
    public double calcularACono(double radio, double generatriz) throws RemoteException {
        double r = radio;
        double g = generatriz;
        double areaC = 0;
        try {
            areaC = r * Math.PI * (g + r);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return areaC;
    }

    @Override
    public double calcularVCono(double radio, double altura) throws RemoteException {
        double r = radio;
        double h = altura;
        double volC = 0;
        try {
            volC = (1 / 3) * Math.PI * (r * r) * h;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return volC;
    }

    @Override
    public double calcularAOrtoedro(double alto, double ancho, double profundo) {
        double h = alto;
        double a = ancho;
        double b = profundo;
        double areaO = 0;
        try {
            areaO = 2 * ((a * b) + (a * h) + (b * h));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return areaO;
    }

    @Override
    public double calcularVOrtoedro(double alto, double ancho, double profundo) {
        double h = alto;
        double a = ancho;
        double b = profundo;
        double volO = 0;
        try {
            volO = a * b * h;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return volO;
    }
}
