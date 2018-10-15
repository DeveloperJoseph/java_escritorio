package modulo1;

import java.util.Scanner;

/**
 *
 * @author JOSEPH
 */
public class ejemplo_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("============================");
        System.out.println(" ---     BANCO W3JOS    --- ");
        System.out.println("============================");
        Scanner sc = new Scanner(System.in);

        System.out.print("\n>> Digite su nombre?: ");
        String name = sc.next();

        System.out.print(">> Cliente " + name + " digite su monto solicitado(préstamo): S/.");
        Double monto_solicito = sc.nextDouble();

        System.out.print(">> Cliente " + name + " digite su monto de ingreso(mensual): S/.");
        Double monto_mensual = sc.nextDouble();

        if ((monto_mensual * 2) >= monto_solicito) {
            System.out.println("\n>> ¡FELICITACIONES! Cliente " + name + " usted si puede solicitar su prestamo!.");
        } else {
            System.out.println("\n>> ¡LO SENTIMOS! Cliente "+ name+" usted no puede solicitar un prestamo!.");
        }
        
        sc.close();

        System.out.println("============================");
        System.out.println(" ---     BANCO W3JOS    --- ");
        System.out.println("============================");
    }
}
