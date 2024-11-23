
/**
 *Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados. Por cada empleado se debe solicitar el nombre, numero de días trabajados y costo del día trabajo. Calcular el valor a cancelar por la empresa para cada empleado. Presentar un reporte como el siguiente:
 *
 * Nombre 1	10	$2.5	$25
 * Nombre 2	11	$2	$22
 * Nombre 3	9	$3	$27
 * Nombre 4	5	$4	$20
 * Nombre 5	12	$2	$24
 *
 * @author Daniela Briceño
 */
import java.util.Scanner;

public class Problema3_Reporte {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre;
        double costoPorDia, costoTotal, numerodeDias;
        int contador = 1;
        while (contador <= 5) {
            System.out.print("Ingrese el nombre, dias trabajados y costo por dia del trabajador_" + contador + ": ");
            nombre = tcl.next();
            numerodeDias = tcl.nextDouble();
            costoPorDia = tcl.nextDouble();
            costoTotal = (numerodeDias * costoPorDia);
            System.out.printf("|%s| %s|\t%s|\t%s|\n", "Nombre", "Dias Trabajados", "Costo Por Dia", "Pago");
            System.out.printf("|%s\t|\t%.2f\t|\t%.2f\t|\t%.2f\t|\n", nombre, numerodeDias, costoPorDia, costoTotal);
            contador++;
        }
    }
}
/**
 * run:
 * Ingrese el nombre, dias trabajados y costo por dia del trabajador_1: Juan 10 2,5
 * |Nombre| Dias Trabajados|	Costo Por Dia|	Pago|
 * |Juan	|	10,00	|	2,50	|	25,00	|
 * Ingrese el nombre, dias trabajados y costo por dia del trabajador_2: Carlos 11 2
 * |Nombre| Dias Trabajados|	Costo Por Dia|	Pago|
 * |Carlos	|	11,00	|	2,00	|	22,00	|
 * Ingrese el nombre, dias trabajados y costo por dia del trabajador_3: Maria 9 3
 * |Nombre| Dias Trabajados|	Costo Por Dia|	Pago|
 * |Maria	|	9,00	|	3,00	|	27,00	|
 * Ingrese el nombre, dias trabajados y costo por dia del trabajador_4: Dario 5 4
 * |Nombre| Dias Trabajados|	Costo Por Dia|	Pago|
 * |Dario	|	5,00	|	4,00	|	20,00	|
 * Ingrese el nombre, dias trabajados y costo por dia del trabajador_5: Andres 12 2
 * |Nombre| Dias Trabajados|	Costo Por Dia|	Pago|
 * |Andres	|	12,00	|	2,00	|	24,00	|
BUILD SUCCESSFUL (total time: 48 seconds)
 */