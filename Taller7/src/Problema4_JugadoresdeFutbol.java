
/**
 * Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:
 * Nombre el jugador
 * Posición en el campo de juego
 * Edad
 * Estatura
 * El ciclo de ingreso de información deberá terminar cuando el usuario lo decida. Se debe imprimir el siguiente reporte (usar una cadena de acumulación):
 *
 * Listado de Jugadores
 * 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
 * 2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
 * 3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
 * 4. Ángel Mena -Delantero-, edad 32, estatura 1.75
 * 5. Michael Estrada -Delantero-, edad 27, estatura 1.93
 * Promedio de edades:  26.8
 * Promedio de estaturas: 1.87
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Problema4_JugadoresdeFutbol {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre, posicion, reporte = "";
        int edad, contador = 1, limite;
        double estatura, promedioEdad = 0, promedioEstatura = 0;
        System.out.print("Ingrese el numero de jugadores: ");
        limite = tcl.nextInt();
        tcl.nextLine();
        while (contador <= limite) {
            System.out.print("Ingrese el nombre: ");
            nombre = tcl.nextLine();
            System.out.print("Ingrese la edad del jugador: ");
            edad = tcl.nextInt();
            System.out.print("Ingrese la  estatura del jugador: ");
            estatura = tcl.nextDouble();
            System.out.print("Ingrese la posicion del jugador: ");
            posicion = tcl.next();
            tcl.nextLine();
            promedioEstatura += estatura;
            promedioEdad += edad;
            reporte += contador + "." + nombre + " -" + posicion + "-, edad " + edad + " , estatura " + estatura + "\n";
            contador++;
        }
        System.out.println("Listado de jugadores:");
        promedioEstatura /= limite;
        promedioEdad /= limite;
        reporte += "\nPromedio de Edades: " + promedioEdad + "\n";
        reporte += "Promedio de Estaturas: " + promedioEstatura + "\n";
        System.out.println(reporte);
    }
}
/**
 * run: Ingrese el numero de jugadores: 5 Ingrese el nombre: Alexander Dominguez
 * Ingrese la edad del jugador: 32 Ingrese la estatura del jugador: 1,95 Ingrese
 * la posicion del jugador: Arquero Ingrese el nombre: Xavier Arreaga Ingrese la
 * edad del jugador: 24 Ingrese la estatura del jugador: 1,85 Ingrese la
 * posicion del jugador: Defensa Ingrese el nombre: Moises Caicedo Ingrese la
 * edad del jugador: 19 Ingrese la estatura del jugador: 1,88 Ingrese la
 * posicion del jugador: Mediocentro Ingrese el nombre: Angel Mena Ingrese la
 * edad del jugador: 32 Ingrese la estatura del jugador: 1,75 Ingrese la
 * posicion del jugador: Delantero Ingrese el nombre: Michael Estrada Ingrese la
 * edad del jugador: 27 Ingrese la estatura del jugador: 1,93 Ingrese la
 * posicion del jugador: Delantero Listado de jugadores: 1.Alexander Dominguez
 * -Arquero-, edad 32 , estatura 1.95 2.Xavier Arreaga -Defensa-, edad 24 ,
 * estatura 1.85 3.Moises Caicedo -Mediocentro-, edad 19 , estatura 1.88 4.Angel
 * Mena -Delantero-, edad 32 , estatura 1.75 5.Michael Estrada -Delantero-, edad
 * 27 , estatura 1.93
 *
 * Promedio de Edades: 26.8 Promedio de Estaturas: 1.8719999999999999
 */
