/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2;

/**
 *
 * @author JOSEPH
 */
public class Animal {
    //metodo publico vacio 'makeSound()

    public void makeSound() {
        System.out.println("Grrr...!!");//salida
    }

     
    public static void main(String[] args) {

        //Creamos dos variables de referencia de tipo Animal 
        //y las señalamos a los objetos Rabbit , Cat and Dog
        Animal rabbit = new Rabbit();
        rabbit.makeSound();//accediendo al metodo poliformismo de la clase 'rabbit'

        System.out.println("\n");//salto de linea
        Animal cat = new Cat(); //variable de referencia tipo Animal
        cat.makeSound();//accediendo al metodo poliformismo de la clase 'cat'

        System.out.println("\n");//salto de linea
        Dog dog = new Dog();////variable de referencia tipo Animal
        dog.makeSound();//accediendo al metodo poliformismo de la clase 'dog'

    }
}
