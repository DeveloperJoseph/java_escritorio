package modulo1;

import java.util.Scanner;

/**
 *
 * @author JOSEPH
 */
public class ejemplo_1 {

    public static void main(String[] args) {
        /*CAPTURA DE ENTRADA DE TIPO DE VARIABLES DE ENTRADA DE USUARIO*/
        System.out.println("****  INICIANDO  INICIANDO INICIANDO  ****");
        System.out.println("===========================================");
        Scanner sc = new Scanner(System.in);//objeto Scanner

        //Entrada de datos
        System.out.print(">>> Digite un texto: ");
        String texto = sc.nextLine();
        System.out.println("\n*** Su texto digitado es: '" + texto + "' y la"
                + " longitud de caracteres es: " + texto.length() + ", Goodbye.");

        System.out.println("==========================");
        System.out.print(">>> Digite un decimal: ");
        Double d = sc.nextDouble();
        System.out.println("\n*** Su decimal digitado es: " + d + " Goodbye.");

        System.out.println("==========================");
        System.out.print(">>> Digite un booleano (true , false): ");
        Boolean b = sc.nextBoolean();
        System.out.println("\n*** Su booleano digitado es: '" + b + "', Goodbye.");

        sc.close();
        System.out.println("===========================================");
        System.out.println("****  FIN  FIN  FIN   FIN   FIN   ****");
    }
}
