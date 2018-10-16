package modulo1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author JOSEPH
 */
public class ejemplo_9 {

    static int DIVISOR = 3;

    public static void main(String[] args) {

        //objeto scanner
        Scanner sc = new Scanner(System.in);

        Integer[] numeros = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (Integer n : numeros) {

            Integer divisorDeTres = n % DIVISOR;
            if (divisorDeTres.equals(0)) {
                System.out.println("Número " + n + " es divisible por 3.");
            }
        }

        System.out.println("==================================================");
        
        
        Integer[] codigo = new Integer[]{10, 20, 30, 40, 50};//new array tipo entero

        System.out.println(" >> Codigo de productos en stock: " + Arrays.toString(codigo));//salida array
        System.out.print(" >> Ingresa un codigo: ");//entrada usuario
        int codigo_producto = sc.nextInt();//captura de entrada usuario

        //ciclo for para recorrer los items de nuestro array + nuevo Integer 'codigo_for' = recorre array
        for (Integer codigo_for : codigo) {
            //si la entrada de nuestro usuario existe en nuestro array
            if (codigo_for.equals(codigo_producto)) {
                System.out.println("Codigo " + codigo_producto + " ha sido encontrado.");//salida de  mensaje
                break;
            } else {//sino ha sido encontrado
                System.err.println("Codigo " + codigo_producto + " no ha sido registrado.");//salida de mensaje
                break;
            }

        }

        System.out.println("==================================================");

        String[] animals = new String[]{"Conejo", "Perro", "Gato", "Loro"};

        System.out.println("** Lista de animales: " + Arrays.toString(animals));
        System.out.print(">> Ingrese un nombre de animal: ");
        String nombre_animal = sc.next();

        for (String animal : animals) {

            if (animal.equals(nombre_animal)) {
                System.out.println("# El animal " + nombre_animal + " si existe en nuestra lista.");
                break;
            } else {
                System.err.println("# El animal " + nombre_animal + " no existe en nuestra lista.");
            }
            break;
        }
    }
}
