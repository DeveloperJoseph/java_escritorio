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
public class ejercicio4 {

    //atributos
    private double purchase;

    // metodo privado de tipo double que retorna el IGV
    private static double sale(double purchase, double igv) {
        double venta = purchase * igv; //operación matemática(*)
        return venta;//retorna el IGV de tipo double
    }

    // metodo privado de tipo double que retorna el precio compra + igv
    private static double sale_total(double purchase, double igv) {
        double venta = purchase * igv; // igv
        double total = purchase + venta; // precio venta
        return total;// retorna PRECIO VENTA de tipo double
    }

    // metodo principal
    public static void main(String[] args) {
        // import Scanner (entrada de datos)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price of car $: ");//price of car
        double precio = sc.nextDouble();//reading entry price of car
        System.out.print("Enter I.G.V of car $: ");//i.g.v
        double igv = sc.nextDouble();//reading entry of igv
        
        System.out.println("\nPrecio de IGV of car is: "
                + ejercicio4.sale(precio, igv));//metodo IGV de la clase 'ejercicio4'
        System.out.println("TOTAL OF SALE: "
                + ejercicio4.sale_total(precio, igv));//metodo TOTAL de la clase 'ejercicio4'

    }
}
