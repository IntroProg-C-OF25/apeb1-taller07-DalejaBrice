
/**
 * Generar un programa Java que permita ingresar 4 estudiantes; por cada uno de ellos
 * ingresar el nombre del estudiante, el promedio de ciclo. Presentar el siguiente reporte
 * Estudiante1	10	Aprobado
 * Estudiante2	6.9	Reprobado
 * Estudiante3	7	Aprobado
 * Estudiante4	5	Reprobado
 * Atención; con base al valor del promedio, usted debe asignar en cada registro
 * el tipo Aprobado o Reprobado.
 *
 * @author Daniela Briceño
 */
import java.util.Scanner;

public class Problema5_PromediosEstudiantes {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre, estado;
        double promedio;
        int contador = 1;
        while (contador <= 4) {
            System.out.print("Ingresa el nombre y promedio del Est_" + contador + ": ");
            nombre = tcl.next();
            promedio = tcl.nextDouble();
            if (promedio < 7) {
                estado = "Reprobado";
            } else {
                estado = "Aprobado";
            }
            System.out.printf("| \t%s | \t%s | \t%s |\n", "Nombre", "Promedio", "Estado");
            System.out.printf("|\t%s\t|\t%.2f\t|\t%s\t|\n", nombre, promedio, estado);
            contador++;
        }
    }
}
/**
 * run:
 * Ingresa el nombre y promedio del Est_1: Carlos 10
 * | 	Nombre | 	Promedio | 	Estado |
 * |	Carlos	|	10,00	|	Aprobado	|
 * Ingresa el nombre y promedio del Est_2: Juan 6,0
 * | 	Nombre | 	Promedio | 	Estado |
 * |	Juan	|	6,00	|	Reprobado	|
 * Ingresa el nombre y promedio del Est_3: Esteban 7
 * | 	Nombre | 	Promedio | 	Estado |
 * |	Esteban	|	7,00	|	Aprobado	|
 * Ingresa el nombre y promedio del Est_4: Ana 5
 * | 	Nombre | 	Promedio | 	Estado |
 * |	Ana	|	5,00	|	Reprobado	|
 * BUILD SUCCESSFUL (total time: 51 seconds)
 */