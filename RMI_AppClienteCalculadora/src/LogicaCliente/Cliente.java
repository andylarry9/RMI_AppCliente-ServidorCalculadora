
package LogicaCliente;

import IROperaciones.IROperCalculadora;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {
    
 private final String serverAddress = "localhost"; // 192.168.0.7
    private final int serverPort = 8080;
    private IROperCalculadora calculadoraStub;

    public Cliente() {
        try {
            Registry registry = LocateRegistry.getRegistry(serverAddress, serverPort);
            calculadoraStub = (IROperCalculadora) registry.lookup("Calculadora");
            System.out.println("Conectado al servidor.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int sumar(int a, int b) {
        try {
            return calculadoraStub.sumar(a, b);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int restar(int a, int b) {
        try {
            return calculadoraStub.restar(a, b);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int multiplicar(int a, int b) {
        try {
            return calculadoraStub.multiplicar(a, b);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int dividir(int a, int b) {
        try {
            return calculadoraStub.dividir(a, b);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        System.out.println("Resultado de la suma: " + cliente.sumar(4, 2));
        System.out.println("Resultado de la resta: " + cliente.restar(4, 2));
        System.out.println("Resultado de la multiplicación: " + cliente.multiplicar(4, 2));
        System.out.println("Resultado de la división: " + cliente.dividir(4, 2));
    }
}
