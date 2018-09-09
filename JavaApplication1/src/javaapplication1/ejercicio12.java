/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author JOSEPH
 */
public class ejercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//import Scanner
        ArrayList<Integer> numbers = new ArrayList<>();//ArrayList tipo String

        System.out.print("Count>> ");//cantidad de colores a agregar
        int x = sc.nextInt();//capturando entrada 'int'
        System.out.println("\n");
        try {
            for (int i = 1; i <= x; i++) {//ciclo for  i<=x
                System.out.print("Number " + i + ": ");//salida number
                int n = sc.nextInt();//capturando entrada del usuario tipo 'int'
                numbers.add(n);//add numeros capturados al ArrayList
            }
            Collections.sort(numbers);//Ordenando de menor a mayor
            System.out.println("\nNumeros de ArrayList: " + numbers);//salida
            System.out.println("Numero mayor del ArrayList: "
                    + Collections.max(numbers));//salida del numero mayor
            System.out.println("Numero menor del ArrayList: "
                    + Collections.min(numbers));//salida del numero menor

        } catch (Exception e) {
            System.out.println("Error: " + e);//capturando error
        }
    }
}
