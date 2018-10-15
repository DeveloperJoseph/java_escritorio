package modulo1;

import java.util.Scanner;

/**
 *
 * @author JOSEPH
 */
public class ejemplo_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre u apodo: ");
        String name = sc.next();
        System.out.print("Ingrese su peso (kg): ");
        Double peso = sc.nextDouble();

        Boolean peso_leve = peso <= 60;
        if (peso_leve) {
            System.out.println("> " + name + " Usted tiene un peso level (0 <= 60kg).");
        } else {
            Boolean peso_medio = peso >= 60 && peso <= 90;
            if (peso_medio) {
                System.out.println("> " + name + " Usted tiene un peso medio (60 <= 90kg).");
            } else {
                Boolean sobre_peso = peso > 90;
                if (sobre_peso) {
                    System.out.println("> " + name + " Usted tiene un sobre peso , acuda a un médico(+90kg).");
                }   
            }
        }
        
        sc.close();

    }

}
