
import java.rmi.Naming;

public class ServidorVolumenArea {

    public ServidorVolumenArea() {
        try {
            RemotaVolumenArea vyc = new VolumenArea();
            Naming.rebind("rmi://127.0.0.1:1099/VolumenesYareasServer", vyc);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

    public static void main(String args[]) {
        new ServidorVolumenArea();
    }
}
