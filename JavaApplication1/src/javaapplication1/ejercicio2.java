package javaapplication1;

import java.util.*;
import java.io.*;

public class ejercicio2 {

    public static void main(String[] args) throws IOException {
        try {
            BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
            String rojo1 = "\033[31m";
            System.out.println(rojo1 + "♔ WELCOME W3JOS TECHNOLOGY ♔");

            System.out.print("Ingresar tu edad: ");
            int age = Integer.parseInt(buff.readLine());
            //  tipo boleaan               if                         else if
            String rpta = (age >= 18) ? "Eres mayor de edad" : "No eres mayor de edad";
            String bye = "Thanks, Goodbye";
            if (age >= 18) {
                System.out.print("\nNro° de Ruc: ");
                long ruc = Integer.parseInt(buff.readLine());
                System.out.println("\n===================");
                System.out.println(rpta);
                System.out.println("Nro de ruc: " + ruc);
                System.out.println(bye);
                System.out.println("===================");
            } else if (age < 18) {
                System.out.print("\nNro° de DNI: ");
                long dni = Integer.parseInt(buff.readLine());
                System.out.println("\n===================");
                System.out.println(rpta);
                System.out.println("Nro de DNI: " + dni);
                System.out.println(bye);
                System.out.println("===================");
            }
        } catch (Exception e){ System.err.println("Error: " + e);}
    }
}
