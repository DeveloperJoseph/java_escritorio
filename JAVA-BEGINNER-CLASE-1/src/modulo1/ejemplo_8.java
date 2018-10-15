package modulo1;

import java.util.Scanner;

/**
 *
 * @author JOSEPH
 */
public class ejemplo_8 {

    static String morado = "\033[35m";
    static String azul = "\033[34m";
    static String verde = "\033[32m";
    static String naranja = "\033[33m";
    static String rojo = "\033[31m";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=========================================================================");
        System.out.println("=============         ---------------------                  ============");
        System.out.println("=============        -    TRANSLATE W3JOS  -                 ============");
        System.out.println("=============         ---------------------                  ============");
        System.out.println("=============            By. Joseph J-10                     ============");
        System.out.println("=========================================================================");
        System.out.print("Cual es tu nombre?: ");
        String name = sc.nextLine();

        System.out.print(">* Hola " + name + ", ingresa un mes en  número(1-12): ");
        int mes = sc.nextInt();

        String in_english;
        String in_frances;
        String in_chinese;
        String mes_cadena;
        switch (mes) {
            case 1:
                System.out.println("\n=========================================================================");
                mes_cadena = "Enero";
                System.out.println(morado + ">>  " + morado + name + ",el mes que ingresaste en número es '" + mes_cadena + "'.");
                in_english = "January";
                in_frances = "Janvier";
                in_chinese = "一月";
                System.out.println(">> Enero en inglés es: '" + morado + in_english + "'.");
                System.out.println(">> Enero en fránces es: '" + morado + in_frances + "'.");
                System.out.println(">> Enero en chino es: '" + morado + in_chinese + "'.");
                System.out.println("=========================================================================");
                break;
            case 2:
                System.out.println("\n=========================================================================");
                mes_cadena = "Febrero";
                System.out.println(azul + ">>  " + azul + name + ",el mes que ingresaste en número es '" + mes_cadena + "'.");
                in_english = "February";
                in_frances = "Février";
                in_chinese = "二月";
                System.out.println(">> Febrero en inglés es: '" + azul + in_english + "'.");
                System.out.println(">> Febrero en fránces es: '" + azul + in_frances + "'.");
                System.out.println(">> Febrero en chino es: '" + azul + in_chinese + "'.");
                System.out.println("=========================================================================");
                break;
            case 3:
                System.out.println("\n=========================================================================");
                mes_cadena = "Marzo";
                System.out.println(verde + ">>  " + verde + name + ",el mes que ingresaste en número es '" + mes_cadena + "'.");
                in_english = "March";
                in_frances = "Mars";
                in_chinese = "三月";
                System.out.println(">> Marzo en inglés es: '" + verde + in_english + "'.");
                System.out.println(">> Marzo en fránces es: '" + verde + in_frances + "'.");
                System.out.println(">> Marzo en chino es: '" + verde + in_chinese + "'.");
                System.out.println("=========================================================================");
                break;
            case 4:
                System.out.println("\n=========================================================================");
                mes_cadena = "Abril";
                System.out.println(azul + ">>  " + azul + name + ",el mes que ingresaste en número es '" + mes_cadena + "'.");
                in_english = "April";
                in_frances = "Avril";
                in_chinese = "四月";
                System.out.println(">> Abril en inglés es: '" + azul + in_english + "'.");
                System.out.println(">> Abril en fránces es: '" + azul + in_frances + "'.");
                System.out.println(">> Abril en chino es: '" + azul + in_chinese + "'.");
                System.out.println("=========================================================================");
                break;
            case 5:
                System.out.println("\n=========================================================================");
                mes_cadena = "Mayo";
                System.out.println(naranja + ">>  " + naranja + name + ",el mes que ingresaste en número es '" + mes_cadena + "'.");
                in_english = "May";
                in_frances = "Mai";
                in_chinese = "五月";
                System.out.println(">> Mayo en inglés es: '" + naranja + in_english + "'.");
                System.out.println(">> Mayo en fránces es: '" + naranja + in_frances + "'.");
                System.out.println(">> Mayo en chino es: '" + naranja + in_chinese + "'.");
                System.out.println("=========================================================================");
                break;
            case 6:
                System.out.println("\n=========================================================================");
                mes_cadena = "Junio";
                System.out.println(rojo + ">>  " + rojo + name + ",el mes que ingresaste en número es '" + mes_cadena + "'.");
                in_english = "June";
                in_frances = "Juin";
                in_chinese = "六月";
                System.out.println(">> Junio en inglés es: '" + rojo + in_english + "'.");
                System.out.println(">> Junio en fránces es: '" + rojo + in_frances + "'.");
                System.out.println(">> Junio en chino es: '" + rojo + in_chinese + "'.");
                System.out.println("=========================================================================");
                break;
            case 7:
                System.out.println("\n=========================================================================");
                mes_cadena = "Julio";
                System.out.println(azul + ">>  " + azul + name + ",el mes que ingresaste en número es '" + mes_cadena + "'.");
                in_english = "July";
                in_frances = "Juillet";
                in_chinese = "七月";
                System.out.println(">> Julio en inglés es: '" + azul + in_english + "'.");
                System.out.println(">> Julio en fránces es: '" + azul + in_frances + "'.");
                System.out.println(">> Julio en chino es: '" + azul + in_chinese + "'.");
                System.out.println("=========================================================================");
                break;
            case 8:
                System.out.println("\n=========================================================================");
                mes_cadena = "Agosto";
                System.out.println(morado + ">>  " + morado + name + ",el mes que ingresaste en número es '" + mes_cadena + "'.");
                in_english = "August";
                in_frances = "Août";
                in_chinese = "八月";
                System.out.println(">> Agosto en inglés es: '" + morado + in_english + "'.");
                System.out.println(">> Agosto en fránces es: '" + morado + in_frances + "'.");
                System.out.println(">> Agosto en chino es: '" + morado + in_chinese + "'.");
                System.out.println("=========================================================================");
                break;
            case 9:
                System.out.println("\n=========================================================================");
                mes_cadena = "Septiembre";
                System.out.println(verde + ">>  " + verde + name + ",el mes que ingresaste en número es '" + mes_cadena + "'.");
                in_english = "September";
                in_frances = "Septembre";
                in_chinese = "九月";
                System.out.println(">> Septiembre en inglés es: '" + verde + in_english + "'.");
                System.out.println(">> Septiembre en fránces es: '" + verde + in_frances + "'.");
                System.out.println(">> Septiembre en chino es: '" + verde + in_chinese + "'.");
                System.out.println("=========================================================================");
                break;
            case 10:
                System.out.println("\n=========================================================================");
                mes_cadena = "Octubre";
                System.out.println(morado + ">>  " + morado + name + ",el mes que ingresaste en número es '" + mes_cadena + "'.");
                in_english = "October";
                in_frances = "Octobre";
                in_chinese = "十月";
                System.out.println(">> Octubre en inglés es: '" + morado + in_english + "'.");
                System.out.println(">> Octubre en fránces es: '" + morado + in_frances + "'.");
                System.out.println(">> Octubre en chino es: '" + morado + in_chinese + "'.");
                System.out.println("=========================================================================");
                break;
            case 11:
                System.out.println("\n=========================================================================");
                mes_cadena = "Noviembre";
                System.out.println(naranja + ">>  " + naranja + name + ",el mes que ingresaste en número es '" + mes_cadena + "'.");
                in_english = "November";
                in_frances = "Novembre";
                in_chinese = "十一月";
                System.out.println(">> Noviembre en inglés es: '" + naranja + in_english + "'.");
                System.out.println(">> Noviembre en fránces es: '" + naranja + in_frances + "'.");
                System.out.println(">> Noviembre en chino es: '" + naranja + in_chinese + "'.");
                System.out.println("=========================================================================");
                break;
            case 12:
                System.out.println("\n=========================================================================");
                mes_cadena = "Diciembre";
                System.out.println(rojo + ">>  " + rojo + name + ",el mes que ingresaste en número es '" + mes_cadena + "'.");
                in_english = "December";
                in_frances = "Décembre";
                in_chinese = "十二月";
                System.out.println(">> Diciembre en inglés es: '" + rojo + in_english + "'.");
                System.out.println(">> Diciembre en fránces es: '" + rojo + in_frances + "'.");
                System.out.println(">> Diciembre en chino es: '" + rojo + in_chinese + "'.");
                System.out.println("=========================================================================");
                break;

            default:
                System.err.println(">> " + name + " el més que digitaste en número no es válido, vuelva a intentarlo.");
        }
        sc.close();
        System.out.println("\n=========================================================================");
        System.out.println("=============         ---------------------                  ============");
        System.out.println("=============        -    TRANSLATE W3JOS  -                 ============");
        System.out.println("=============         ---------------------                  ============");
        System.out.println("=============            By. Joseph J-10                     ============");
        System.out.println("=========================================================================");
    }

}
