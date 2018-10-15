package modulo1;

import java.util.Scanner;

/**
 *
 * @author JOSEPH
 */
public class ejemplo_6 {

    static final Double NOTA_CLASIFICATORIA = 18.0;
    static final Double NOTA_MINIMA = 13.0;

    public static void main(String[] args) {

        System.out.println("=============================================");
        System.out.println(" ---          HIGH SCHOOL W3JOS          --- ");
        System.out.println(" ---                                     --- ");
        System.out.println(" ---          By. Joseph Whoami          --- ");
        System.out.println("=============================================");
        Scanner sc = new Scanner(System.in);

        System.out.print("\n> Ingresar nota de lenguaje C#: ");
        Double nota_csharp = sc.nextDouble();

        System.out.print("> Ingresar nota de lenguaje Java: ");
        Double nota_java = sc.nextDouble();

        System.out.print("> Ingresar nota de lenguaje Python: ");
        Double nota_python = sc.nextDouble();

        Boolean estadoNotaCsharp = nota_csharp >= NOTA_MINIMA;
        Boolean estadoNotaJava = nota_java >= NOTA_MINIMA;
        Boolean estadoNotaPython = nota_python >= NOTA_MINIMA;

        Double nota_total_obtenida = nota_csharp + nota_java + nota_python;

        Boolean nota_superada = nota_total_obtenida >= NOTA_CLASIFICATORIA;

        Boolean succesfull = nota_superada && estadoNotaCsharp && estadoNotaJava && estadoNotaPython;

        System.out.println("\n=============================================");
        if (succesfull) {
            System.out.println("Nota obtenida: " + nota_total_obtenida);
            System.out.println(">* MENSAJE: ¡CONGRULATIONS STUDENT!");
        } else {
            System.out.println("Nota obtenida: " + nota_total_obtenida);
            System.out.println(">* MENSAJE: ¡NO CONGRULATIONS STUDENT!");
        }
        System.out.println("=============================================");
        sc.close();

        System.out.println("\n=============================================");
        System.out.println(" ---          HIGH SCHOOL W3JOS          --- ");
        System.out.println(" ---                                     --- ");
        System.out.println(" ---          By. Joseph Whoami          --- ");
        System.out.println("=============================================");
    }
}
