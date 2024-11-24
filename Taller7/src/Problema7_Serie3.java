
/**
 *Generar e imprimir la siguiente serie:
 * sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 *
 * @author Daniela Briceño
 */
import java.util.Scanner;

public class Problema7_Serie3 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int contador = 1, limite, contador2 = 1;
        String signo = "-";
        System.out.print("Ingrese el limite: ");
        limite = tcl.nextInt();
        while (contador2 <= limite) {
            System.out.print(signo + "(" + contador + "/" + (contador2) + ")");
            contador2++;
            if (contador2 % 2 == 1) {
                signo = "+";
            } else {
                signo = "-";
            }
        }
        System.out.println("");
    }
}
/**
 * run:
 * Ingrese el limite: 10
 * -(1/1)-(1/2)+(1/3)-(1/4)+(1/5)-(1/6)+(1/7)-(1/8)+(1/9)-(1/10)
 * BUILD SUCCESSFUL (total time: 2 seconds)
 */
