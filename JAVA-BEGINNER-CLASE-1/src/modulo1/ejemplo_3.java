package modulo1;

import java.util.Scanner;

/**
 *
 * @author JOSEPH
 */
public class ejemplo_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("=======================================");
        Scanner sc = new Scanner(System.in);
        System.out.print(">>> Ingrese el precio del auto $./ ");
        Double precio_auto = sc.nextDouble();

        Boolean aplica_descuento = precio_auto >= 5000;

        Double descuento = 0.0;
        Double aplicando_descuento;
        Double total_pagar_auto;
        if (aplica_descuento) {
            descuento = 18.0;
            aplicando_descuento = (precio_auto * descuento) / 100;
            total_pagar_auto = precio_auto - aplicando_descuento;
            System.out.println("\n====================================================================");
            System.out.println("**** Usted a obtenido un descuento de " + String.valueOf(descuento)+"%.");
            System.out.println("**** Descuento de la compra S/ " + String.valueOf(aplicando_descuento)+" soles.");
            System.out.println("**** Total de compra es S/ " + String.valueOf(total_pagar_auto)+" soles.");
            System.out.println("********************    COMPRA EXITOSA CON BENEFICIO ******************");
        } else {
            aplicando_descuento = (precio_auto * descuento) / 100;
            total_pagar_auto = precio_auto - aplicando_descuento;
            System.out.println("\n====================================================================");
            System.out.println("**** Usted a obtenido un descuento de " + String.valueOf(descuento)+"%.");
            System.out.println("**** Descuento de la compra S/" + String.valueOf(aplicando_descuento)+" soles.");
            System.out.println("**** Total de compra es S/ " + String.valueOf(total_pagar_auto)+" soles.");
            System.out.println("********************    COMPRA EXITOSA SIN BENEFICIO ******************");
        }
        sc.close();
    }

}
