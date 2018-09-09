/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author JOSEPH
 */
public class ejercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//import 'Scanner sc'
        LinkedList<String> country = new LinkedList<>();//LinkedList tipo 'String'

        System.out.println("How many countries will you add?: ");//salida
        int q = sc.nextInt();//captura de valor tipo 'int q'

        for (int i = 1; i <= q; i++) {//ciclo for (recorre la cantidad solicitada)
            System.out.println("Country " + i + ": ");//entrada de pais 
            String c = sc.next();//capturando entrada de valor tipo 'String c'
            country.add(c);//add valores capturados al LinkedList
        }
        Collections.sort(country);//Ordenando alfebaticamente
        
        //Iterator que permite recorrer una colección, obtener o eliminar elementos. 
        Iterator<String> it = country.iterator();//Iterator tipo String
        
        while(it.hasNext()){//En cada iteración del ciclo, puede acceder al elemento de lista correspondiente. 
            String value = it.next();//captura de valor 'it.next()' se guarda en 'String value'
            System.out.println("Name country: "+value);//Salida de LinkedList
        }
    }

}
