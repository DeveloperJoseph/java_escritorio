/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.HashMap;//importando HashMap

/**
 *
 * @author JOSEPH
 */
public class ejercicio10 {

    public static void main(String[] args) {
        //HashMap con 'Integer' como sus claves y 'String' como sus valores.
        HashMap<Integer, String> h = new HashMap<>();
        h.put(0001, "Joseph0");//add valor (clave, "valor") al HASHMAP
        h.put(0002, "Joseph1");
        h.put(0003, "Joseph2");
        h.put(0004, "Joseph3");
        h.put(0005, "Joseph3");
        //Los métodos put , remove y get se utilizan para agregar,
        //eliminar y acceder a valores en HashMap
        System.out.println("Valor: "+h.get(0001));//salida y caputura de valor con clave
        System.out.println(h);//salida de todos los valores del HashMap<Integer,String> 
    }
}
