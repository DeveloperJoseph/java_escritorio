/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Objects;

/**
 *
 * @author JOSEPH
 */
public class ejercicio8 {

    String name;
    
    ejercicio8(String n){
        name = n;
    }

    /*
El método hashCode () generado automáticamentese usa para determinar dónde 
almacenar el objeto internamente. Siempre que implemente iguales , DEBE
también implementar hashCode . 
Podemos ejecutar la prueba nuevamente, usando el método equals.   
     */
    
//HASHCODE - AUTOGENERADO 
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.name);
        return hash;
    }

//EQUALS - AUTOGENERADO 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ejercicio8 other = (ejercicio8) obj;
        return Objects.equals(this.name, other.name);
    }

    public static void main(String[] args) {
           ejercicio8 x = new ejercicio8("Joseph");
           ejercicio8 y = new ejercicio8("Joseph");
           
           System.out.println(x.equals(y));//condición para verificar
                                            //igualdad entre objetos
    }
}
