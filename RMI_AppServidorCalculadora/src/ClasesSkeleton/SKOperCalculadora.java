
package ClasesSkeleton;
import IROperaciones.IROperCalculadora;
import java.rmi.RemoteException;
import java.rmi.server.RemoteRef;
import java.rmi.server.UnicastRemoteObject;


public class SKOperCalculadora extends UnicastRemoteObject implements IROperCalculadora {
    
    public SKOperCalculadora() throws RemoteException {
        super();
    }

    @Override
    public int sumar(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int restar(int a, int b) throws RemoteException {
        return a - b;
    }

    @Override
    public int multiplicar(int a, int b) throws RemoteException {
        return a * b;
    }

    @Override
    public int dividir(int a, int b) throws RemoteException {
       if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division por cero");
        }
    }

}