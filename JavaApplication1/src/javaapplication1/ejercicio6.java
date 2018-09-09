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
public class ejercicio6 {
    public ejercicio6(){
        System.out.print("A");
    }

    public class datos extends ejercicio6{
        public datos(){
            System.out.println("B");
        }
    }
    
    public class datos2 extends ejercicio6{
       public datos2(){
           System.out.println("C");
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
    }
    
}
