
package IROperaciones;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IROperCalculadora extends Remote {
    // Métodos de comportamiento
    int sumar(int a, int b) throws RemoteException;
    int restar(int a, int b) throws RemoteException;
    int multiplicar(int a, int b) throws RemoteException;
    int dividir(int a, int b) throws RemoteException;
}
