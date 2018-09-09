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
public class ejercicio3 {

    public static void main(String[] args) {
        String[] myNames = {"A", "B", "C", "D"};
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for (int x = 0; x < myNames.length; x++) {
            for (int y = 0; y < numbers.length; y++) {
                System.out.println(myNames[x]+" || "+numbers[y]);
                if(numbers[y]==10){
                    System.out.println("\n");
                    break;
                }
            }
        }

         int [] arr = new int [10];
         
         for(int x=1;x < 11;x++){
             arr[x]=x;
         }
         int suma = (arr[5]+arr[2]);
         System.out.println(suma);
      
        
        
    }
}
