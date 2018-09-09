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
public class ejercicio5 {
    //metodo privado estatico entero 'maximo' de la clase ejercicio5
    private static int maximo(int a, int b) {//variable int a y b
        int max = Math.max(a, b);//resultado del numero mayor con la clase
                                 //Math.max(a,b)
        return max;//retornado el resultado del variable 'int max'
    }
   //metodo privado estatico entero 'minimo' de la clase ejercicio5
    private static int minimo(int a, int b) {//variable int  a y b
        int min = Math.min(a, b); //resultado del numero mayor con la clase
                                 //Math.min(a,b)
        return min;//retornado el resultado del variable 'int max'
    }

    public static void main(String[] args) {
        //importando Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Number one >> ");//nro 1
        int A = sc.nextInt();//capturando entrada 'int A' con Scanner
        System.out.print("Number one >> ");//nro 2
        int B = sc.nextInt();//capturando entrada 'int B'con Scanner
        
        //salida de number mayor entre(A,B) accediendo a la clase ejercicio 5
        //con su metodo privado int 'maximo'
        System.out.println("\nBigger number is >>> " + ejercicio5.maximo(A, B));
        
        //salida de number mayor entre(A,B) accediendo a la clase ejercicio 5
        //con su metodo privado int 'minimo'
        System.out.println("Smaller number is >>> " + ejercicio5.minimo(A, B));
    }
}
