
package LogicaServidor;

import ClasesSkeleton.SKOperCalculadora;
import java.net.InetAddress;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.RemoteException;


public class Servidor {
    
private int puerto = 8080;
    private SKOperCalculadora objSKCalculadora;

    public Servidor() {
        try {
            this.objSKCalculadora = new SKOperCalculadora();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void iniciarServidor(){
        try {
            String ip = InetAddress.getLocalHost().getHostAddress();
            System.out.println("IP del servidor: " + ip);
            System.out.println("Puerto: " + puerto);
            
            // Crear el registro RMI
            Registry registry = LocateRegistry.createRegistry(puerto);
            
            // Registrar el objeto remoto con un nombre identificador
            registry.rebind("Calculadora", objSKCalculadora);
            
            System.out.println("Servidor iniciado y objeto remoto registrado.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Servidor().iniciarServidor();
    }
}
