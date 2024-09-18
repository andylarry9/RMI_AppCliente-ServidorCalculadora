
package consola;

import LogicaCliente.Cliente;
import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        
Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            opcion = menuOpciones();
            int a, b;
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el primer número: ");
                    a = scanner.nextInt();
                    System.out.println("Ingrese el segundo número: ");
                    b = scanner.nextInt();
                    System.out.println("Resultado de la suma: " + cliente.sumar(a, b));
                    break;
                case 2:
                    System.out.println("Ingrese el primer número: ");
                    a = scanner.nextInt();
                    System.out.println("Ingrese el segundo número: ");
                    b = scanner.nextInt();
                    System.out.println("Resultado de la resta: " + cliente.restar(a, b));
                    break;
                case 3:
                    System.out.println("Ingrese el primer número: ");
                    a = scanner.nextInt();
                    System.out.println("Ingrese el segundo número: ");
                    b = scanner.nextInt();
                    System.out.println("Resultado de la multiplicación: " + cliente.multiplicar(a, b));
                    break;
                case 4:
                    System.out.println("Ingrese el primer número: ");
                    a = scanner.nextInt();
                    System.out.println("Ingrese el segundo número: ");
                    b = scanner.nextInt();
                    System.out.println("Resultado de la división: " + cliente.dividir(a, b));
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
        scanner.close();
    }

    public static int menuOpciones() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        return scanner.nextInt();
    }
}
