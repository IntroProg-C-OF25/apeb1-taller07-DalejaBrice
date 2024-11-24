
/**
 * Una empresa de comercialización de computadoras realiza el proceso de venta haciendo
 * un descuento por tipo de cliente: Si es cliente tipo 1 hay un descuento del 10% Si es cliente tipo
 * 2 hay un descuento del 20% En caso que sea otro tipo de cliente, no hay descuento.
 * Generar un proceso que permita ingresar 7 ventas: por cada venta preguntar los siguiente datos:
 * Nombre del cliente
 * Costo de la computadora (solo se vende una computadora por transacción)
 * Tipo de cliente
 * Presentar el siguiente reporte: Cliente tipo 1, compra computadora con precio $100
 *
 * @author Daniela Briceño
 */
import java.util.Scanner;

public class Problema6_Ventas {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre;
        double descuento1 = 0.10, descuento2 = 0.20, costoCompu, precioFinal;
        int numVenta = 7, contador = 1, tipoCliente;
        while (contador <= numVenta) {
            System.out.println("Venta_" + contador);
            System.out.print("Ingrese el nombre del cliente: ");
            nombre = tcl.next();
            System.out.print("Ingrese el costo de la computadora: ");
            costoCompu = tcl.nextDouble();
            System.out.print("Ingrese el tipo de cliente (1, 2, etc): ");
            tipoCliente = tcl.nextInt();
            if (tipoCliente == 1) {
                precioFinal = costoCompu - (costoCompu * descuento1);
            } else if (tipoCliente == 2) {
                precioFinal = costoCompu - (costoCompu * descuento2);
            } else {
                precioFinal = costoCompu;
            }
            System.out.println("Cliente tipo" + tipoCliente + " compra computadora con precio $" + precioFinal);
            contador++;
        }
    }
}
/**
 * run:
 * Venta_1
 * Ingrese el nombre del cliente: Juan
 * Ingrese el costo de la computadora: 200
 * Ingrese el tipo de cliente (1, 2, etc): 1
 * Cliente tipo1 compra computadora con precio $180.0
 * Venta_2
 * Ingrese el nombre del cliente: Carlos
 * Ingrese el costo de la computadora: 100
 * Ingrese el tipo de cliente (1, 2, etc): 2
 * Cliente tipo2 compra computadora con precio $80.0
 * Venta_3
 * Ingrese el nombre del cliente: Andres
 * Ingrese el costo de la computadora: 20
 * Ingrese el tipo de cliente (1, 2, etc): 5
 * Cliente tipo5 compra computadora con precio $20.0
 * Venta_4
 * Ingrese el nombre del cliente: Javier
 * Ingrese el costo de la computadora: 300
 * Ingrese el tipo de cliente (1, 2, etc): 2
 * Cliente tipo2 compra computadora con precio $240.0
 * Venta_5
 * Ingrese el nombre del cliente: Ana
 * Ingrese el costo de la computadora: 420
 * Ingrese el tipo de cliente (1, 2, etc): 1
 * Cliente tipo1 compra computadora con precio $378.0
 * Venta_6
 * Ingrese el nombre del cliente: Andrea
 * Ingrese el costo de la computadora: 234,68
 * Ingrese el tipo de cliente (1, 2, etc): 2
 * Cliente tipo2 compra computadora con precio $187.744
 * Venta_7
 * Ingrese el nombre del cliente: Erick
 * Ingrese el costo de la computadora: 150,90
 * Ingrese el tipo de cliente (1, 2, etc): 1
 * Cliente tipo1 compra computadora con precio $135.81
 * BUILD SUCCESSFUL (total time: 1 minute 34 seconds)
 */
