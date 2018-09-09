package javaapplication1;

import java.util.*;

public class JavaApplication1 {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            String rojo1 = "\033[31m";
            System.out.println(rojo1 + "♔ WELCOME W3JOS TECHNOLOGY ♔");
            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicación");
            System.out.println("4.- División");
            System.out.println("5.- Ver tabla del 1");
            System.out.print("¿Qué operación desea realizar?-> ");
            int respuesta = sc.nextInt();

            try {
                switch (respuesta) {
                    case 1:
                        String azul = "\033[34m";
                        System.out.println("\n");
                        System.out.println(azul + "##  😆 OPERACIÓN MATEMÁTICA SUMA  😆 ##");
                        System.out.print("Numero 1: ");
                        long n1 = sc.nextInt();
                        System.out.print("Numero 2: ");
                        long n2 = sc.nextInt();
                        long s;

                        s = n1 + n2;
                        System.out.println("\u266A Respuesta: " + s);
                        break;

                    case 2:
                        String morado = "\033[35m";
                        System.out.println("\n");
                        System.out.println(morado + "##  😆 OPERACIÓN MATEMÁTICA RESTA  😆 ##");
                        System.out.print("Numero 1: ");
                        long n3 = sc.nextInt();
                        System.out.print("Numero 2: ");
                        long n4 = sc.nextInt();
                        long r;

                        r = n3 - n4;
                        System.out.println("\u266A Respuesta: " + r);
                        break;
                    case 3:
                        String verde = "\033[32m";
                        System.out.println("\n");
                        System.out.println(verde + "##  😆 OPERACIÓN MATEMÁTICA MULTIPLICACIÓN  😆 ##");
                        System.out.print("Numero 1: ");
                        long n5 = sc.nextInt();
                        System.out.print("Numero 2: ");
                        long n6 = sc.nextInt();
                        long m;

                        m = n5 * n6;
                        System.out.println("\u266A Respuesta: " + m);
                        break;
                    case 4:
                        String naranja = "\033[33m";
                        System.out.println("\n");
                        System.out.println(naranja + "##  😆 OPERACIÓN MATEMÁTICA DIVISIÓN  😆 ##");
                        System.out.print("Numero 1: ");
                        long n7 = sc.nextInt();
                        System.out.print("Numero 2: ");
                        long n8 = sc.nextInt();
                        double d;

                        d = (double)n7 / (double)n8;
                        System.out.println("\u266A Respuesta: " + d);
                        break;
                    case 5:
                        String rojo = "\033[31m";
                        System.out.println("\n");
                        System.out.println(rojo + "## ⌨ TABLA PERIODICA DEL 1 ⌨ ##\n");
                        System.out.println("Numero     Tabla|Nro°1   Respuesta ");
                        System.out.println("====================================");
                        System.out.printf("%3d      x      %3d      =  %3d\n", 1, 1, 1);
                        System.out.printf("%3d      x      %3d      =  %3d\n", 2, 1, 2);
                        System.out.printf("%3d      x      %3d      =  %3d\n", 3, 1, 3);
                        System.out.printf("%3d      x      %3d      =  %3d\n", 4, 1, 4);
                        System.out.printf("%3d      x      %3d      =  %3d\n", 5, 1, 5);
                        System.out.printf("%3d      x      %3d      =  %3d\n", 6, 1, 6);
                        System.out.printf("%3d      x      %3d      =  %3d\n", 7, 1, 7);
                        System.out.printf("%3d      x      %3d      =  %3d\n", 8, 1, 8);
                        System.out.printf("%3d      x      %3d      =  %3d\n", 9, 1, 9);
                        System.out.printf("%3d      x      %3d      =  %3d\n", 10, 1, 10);
                        break;

                    default:
                        System.err.println("Opción no valida, vuelva a intentarlo!");
                        break;

                }
            } catch (Exception e) {
                System.err.println("Error en Switch: " + e);
            }

        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }

}
