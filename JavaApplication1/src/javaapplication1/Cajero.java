/**
 * This is a documentation official of my program in Java
 * whit  NETBEANS IDE
 */
package javaapplication1;

import java.util.Scanner;

public class Cajero {

    public static void main(String[] args) {
        //import Scanner
        Scanner sc = new Scanner(System.in);
        //Consulta Nº1
        System.out.print("COUNTRY(LATIN AMERICA)> ");
        String country = sc.nextLine(); // capturamos entrada del usuario

        //condiciòn a la
        switch (country) {
            case "PERU":
                System.out.println("HELLO PERU!\n");
                System.out.print("Where do you live(district)?: ");//AGUSTINO
                String district = sc.nextLine();
                switch (district) {
                    case "AGUSTINO":
                        System.out.print("How old are you?: ");
                        int age = sc.nextInt();//18
                        if (age <= 0) {
                            System.out.println("\nENCUEST OF CUSTOMERS");
                            System.out.println("=======================");
                            System.out.println("COUNTRY>> " + country);
                            System.out.println("DISTRICT>> " + district);
                            System.out.println("AGE>> " + age + " age not valid");
                            System.out.println("SYSTEM>> Unknown, yours age not valid!");
                            System.out.println("<<WE ARE BITE CLOSE, AGUSTINO>>");
                            System.out.println("=========================\n");
                        } else if (age > 0 && age <= 17) {
                            System.out.println("\nENCUEST OF CUSTOMERS");
                            System.out.println("=======================");
                            System.out.println("COUNTRY>> " + country);
                            System.out.println("DISTRICT>> " + district);
                            System.out.println("AGE>> " + age + " younger");
                            System.out.println("SYSTEM>> You're not of legal age for system");//18
                             System.out.println("<<WE ARE BITE CLOSE, AGUSTINO>>");
                            System.out.println("========================\n");
                        } else if (age >= 18 && age <= 110) {
                            System.out.println("\nENCUEST OF CUSTOMERS");
                            System.out.println("========================");
                            System.out.println("COUNTRY>> " + country);
                            System.out.println("DISTRICT>> " + district);
                            System.out.println("AGE>> " + age + " adult");
                            System.out.println("SYSTEM>> You is acces to the system");
                             System.out.println("<<WE ARE BITE CLOSE, AGUSTINO>>");
                            System.out.println("======================\n");
                        } else {
                            System.out.println("\nENCUEST OF CUSTOMERS");
                            System.out.println("=======================");
                            System.out.println("COUNTRY>> " + country);
                            System.out.println("DISTRICT>> " + district);
                            System.out.println("AGE>> " + age + " dead");
                            System.out.println("SYSTEM>> Your age not valid, this dead!");
                             System.out.println("<<WE ARE BITE CLOSE, AGUSTINO>>");
                            System.out.println("======================\n");
                        }
                        break;
                    case "ATE":
                        System.out.println("WE ARE BITE FAR, ATE");
                        break;
                    case "LIMA":
                        System.out.println("WE ARE BITE FAR, LIMA");
                        break;
                    default:
                        System.out.println("YOUR DISTRICT ISN'T REGISTER AT "
                                + "SYSTEM!, WE ARE SORRY!");
                }

        }

    }

}
