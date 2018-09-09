/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author JOSEPH
 */
public class ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iter_While = 0;
        while (iter_While < 10) {
            System.out.print(iter_While + " ");
            // Increment the counter
            // Iterated 10 times, iter_While 0,1,2...9
            iter_While++;
        }
        System.out.println("");
        System.out.println("iter_While Value: " + iter_While);

        System.out.println("Numero: ");
        int n = sc.nextInt();
        int c = 1;
        int par = 0;
        int impar = 0;
        int contador = 0;
        while (c <= n) {
            System.out.print(c + " ");
            if (c % 2 == 0) {
                contador += 1;
                par += c;
            } else {
                impar += c;
            }
            c++;
        }
        System.out.println("");
        System.out.println("Número generadors: " + c);
        System.out.println("Número pares: " + contador);
        System.out.println("Suma de número pares: " + par);
        System.out.println("Suma de número impares: " + impar);

    }

}
