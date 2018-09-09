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
public class Cat extends Animal{//clase heredada 'extends'
    @Override
    public void makeSound(){//metodo publico polimorfismo de la clase car
        System.out.println("Cat: Miau-Miau");//salida del metodo vacio
    }
}
