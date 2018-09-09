/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.FileNotFoundException;
import java.util.Formatter;

/**
 *
 * @author JOSEPH
 */
public class ejercicio14 {

    public static void main(String[] args) {
        try {
            try (Formatter f = new Formatter("E:\\test.txt")) {
                f.format("%s  %s  %s", "1.-","Joseph","Whoami\r\n");
                f.format("%s  %s  %s", "2.-","Daniel","Whoami");
                f.close();
            }
        }catch (FileNotFoundException e) {
            System.out.println("Error: "+e);
        }
    }
    
}
