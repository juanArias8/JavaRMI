
import java.rmi.Naming;

public class VolumenesYareasServer {

    public VolumenesYareasServer() {
        try {
            VolumenYarea vyc = new VolumenYarea();
            Naming.rebind("rmi://127.0.0.1:1099/VolumenesYareasServer", vyc);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

    public static void main(String args[]) {
        new VolumenesYareasServer();
    }
}
