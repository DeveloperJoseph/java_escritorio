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
public class ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//import Scanner
        ArrayList<String> colors = new ArrayList<>();//ArrayList tipo String

        System.out.print("Count>> ");//cantidad de colores a agregar
        int x = sc.nextInt();//capturando entrada 'int'

        try {
            for (int i = 0; i < x; i++) {//ciclo for 
                System.out.print("\nColor: ");//salida
                String c = sc.next();//capturando entrada 'String'
                colors.add(c);//add al 'ArrayList colors'
            }
            
            Collections.sort(colors);//Ordenando alfabeticamente nuestro ArrayList
            
            System.out.println("=========================================");
            System.out.println("Colores ingresados:\n");//salida
            colors.forEach((color) -> {//forEach == 'for(String color: colors)'
                System.out.println("Color>> " + color);//salida de valores
            });
            //Capturando tamaño de nuestro ArrayList tipo String
            System.out.println("Size of ArrayList: " + colors.size());//salida
            System.out.println("=========================================");
        
        } catch (Exception e) {
            System.out.println("Error: " + e);//Captura de error
        }
    }

}
