/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author JOSEPH
 */
public class ejercicio7 {

    //METODOS DE SOBRECARGA
    static double max(double a, double b) {//metodo estatico tipo double 'max'(a,b)
        if (a > b) {//condición si 'a' es mayor que 'b'
            return a;//si cumple la condición retorna el valor de 'a'
        } else {//si no
            return b; //retonar el valor de la variable double 'b'
        }
    }

    static int max(int a, int b) {//metodo estatico tipo int 'max'(a,b)
        if (a > b) {//condición si 'a' es mayor que 'b'
            return a;//si cumple la condición retorna el valor de 'a'
        } else {//si no
            return b;//retonar el valor de la variable double 'b'
        }
    }

    static double min(double a, double b) {//metodo static double 'min'(a,b)
        double x = Math.min(a, b);//almacenando el resultado de la clase MATH.MIN
                                  //en el variable tipo double 'x'
        return x;//retornado el valor de 'x'
    }

    static int min(int a, int b) {//metodo static int 'min'(a,b)
        int x = Math.min(a, b);//almacenando el resultado de la clase MATH.MIN
                                  //en el variable tipo int'x'
        return x;//retornando el valor de 'x'
    }

    public static void main(String[] args) {
        System.out.println("Máximo (int): "+ max(10, 5));//salida del resultado metodo int 'max'
        System.out.println("Máximo (double): "+ max(10.0, 5.0));//salida del resultado metodo double 'max'
        System.out.println("\n");//salto de linea
        System.out.println("Minimo (int): "+ min(10, 5));//salida del resultado metodo int 'min'
        System.out.println("Minimo (double): "+ min(10.0, 5.0));//salida del resultado metodo double 'min'

    }
}
