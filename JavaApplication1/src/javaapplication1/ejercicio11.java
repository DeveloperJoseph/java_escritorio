/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;//import 'ArrayList'
import java.util.Collections;//import 'Collections'

/**
 *
 * @author JOSEPH
 */
public class ejercicio11 {//clase publica ejercicio11 

    public static void main(String[] args) {//metodo principal 
        //Declarando nuestro ArrayList de tipo String
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Rabbit");//.add 'ArrayList'
        animals.add("Dog");
        animals.add("Snake");
        animals.add("Shark");
        animals.add("Bird");
        
        Collections.sort(animals);//Ordenando alfabeticamente 'ArrayList'
        animals.forEach((x) -> {// == for(String x: animals)
            System.out.println("Animal>> "+ x);//salida de nuesta ArrayList
        });
    }

}
