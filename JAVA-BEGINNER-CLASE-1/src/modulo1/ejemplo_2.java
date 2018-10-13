package modulo1;

import java.util.Scanner;

/**
 *
 * @author JOSEPH
 */
public class ejemplo_2 {

    public static void main(String[] args) {
        System.out.println("****  STAR STAR STAR STAR STAR STAR  ****");
        System.out.println("===========================================");
        Scanner sc = new Scanner(System.in);//objeto scanner 

        //entrada de datos de usuario tipo double
        System.out.println(">>> Ingrese el precio del producto: ");
        Double precio_producto = sc.nextDouble();

        //variable booleana(False , verdadero)
        Boolean valorSuperado = precio_producto >= 100;//if nuestro producto cuesta màs de 100 dollars

        //nuestro porcentaje de descuento inicialisa en 0
        double porcentaje_descuento = 0.0;

        //si el valor superado es verdadero (true) mayor a 100 dollares
        String msg_descuento;
        double precioTotal;
        if (valorSuperado) {
            porcentaje_descuento = 5.0;
            double descuento = (precio_producto * porcentaje_descuento) / 100;
            precioTotal = precio_producto - descuento;
            System.out.println("*** Total de la compra es: " + String.valueOf(precioTotal));
        } else {
            precioTotal = precio_producto - porcentaje_descuento;
            System.out.println("*** Su producto obtenido no tiene descuento aplicado, lo sentimos.");
            System.out.println("*** Total de la compra es: " + String.valueOf(precioTotal));
        }
    }
}
