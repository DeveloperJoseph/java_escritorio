package modulo1;

import java.util.Scanner;

/**
 *
 * @author JOSEPH
 */
public class ejemplo_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=======================================");
        Scanner sc = new Scanner(System.in);

        System.out.print("# Digite un primer número: ");
        Double n1 = sc.nextDouble();
        System.out.print("# Digite un tipo de operador(1 = Suma || 2 = Resta || "
                + " 3 = Multiplicación || 4 = División): ");
        Integer operador = sc.nextInt();
        System.out.print("# Digite un segundo número: ");
        Double n2 = sc.nextDouble();

        Double resultado;

        switch (operador) {
            case 1:
                resultado = n1 + n2;
                System.out.println("> La suma es: " + resultado);
                break;
            case 2:
                resultado = n1 - n2;
                System.out.println("> La resta es: " + resultado);
                break;
            case 3:
                resultado = n1 * n2;
                System.out.println("> La multiplicación es: " + resultado);
                break;
            case 4:
                resultado = n1 / n2;
                System.out.println("> La division es: " + resultado);
                break;
            default:
                System.out.println("******** TIPO DE OPERACION NO VALIDA ****");
        }

    }
}
