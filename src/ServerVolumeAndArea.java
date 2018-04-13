
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class ServerVolumeAndArea {

    public ServerVolumeAndArea() {
        try {
            RemoteVolumeAndArea volumeAndArea = new VolumeAndArea();
            Naming.rebind("rmi://127.0.0.1:1099/ServerVolumeAndArea", volumeAndArea);
        } catch (MalformedURLException | RemoteException e) {
            System.out.println("Error: " + e);
        }

    }

    public static void main(String args[]) {
        new ServerVolumeAndArea();
    }
}
