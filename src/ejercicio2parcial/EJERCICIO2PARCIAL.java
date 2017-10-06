/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2parcial;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EJERCICIO2PARCIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner ejerc2 = new Scanner(System.in);
        boolean salir = false;

        System.out.println("EXAMEN PARCIAL");
        System.out.println("ELIZABETH AGUILAR MENDOZA");
        System.out.println("");


        System.out.println("SELECCIONAR EL TIPO DE MOVIL QUE DESEES");

         {
           System.out.println("1. SAMSUNG S7");
           System.out.println("2. IPHONE 6");
           System.out.println("3. HUAWEY P8");
           System.out.println("4. SALIR DE LA APLICACION");
           
           System.out.println("ESCRIBE UNA DE LAS OPCIONES QUE DESEES:");
            int opciones = ejerc2.nextInt();
            
            switch(opciones){
               case 1:
                   System.out.println("HAS SELECCIONADO EL MOVIL SAMSUMG S7 CON LAS SIGUIENTES CARACTERISTICAS:");
                   System.out.println("PANTALLA     :   8.4");
                   System.out.println("CAMARA       :   5MP");
                   System.out.println("PROCESADOR   :   1.4 GHZ");
                   break;
               case 2:
                   System.out.println("HAS SELECCIONADO EL MOVIL IPHONE 6 CON LAS SIGUIENTES CARACTERISTICAS");
                   System.out.println("PANTALLA     :   9.4");
                   System.out.println("CAMARA       :   8MP");
                   System.out.println("PROCESADOR   :   1.4 GHZ");
                   break;
                case 3:
                   System.out.println("HAS SELECCIONADO EL HUAWEY P8 CON LAS SIGUIENTES CARACTERISTICAS");
                   System.out.println("PANTALLA     :   10.5");
                   System.out.println("CAMARA       :   10MP");
                   System.out.println("PROCESADOR   :   1.4 GHZ");
                   break;
                default:
                   System.out.println("SOLO DEBEN EXISTIR OPCIONES ENTRE 1 Y 4");
         }
         System.out.println("SELECCIONAR EL SIGUIENTE OPERADOR CON SUS RESPECTIVOS PLANES");

         {
           System.out.println("1. CLARO");
           System.out.println("2. MOVISTAR");
           System.out.println("3. ENTEL");
           System.out.println("4. SALIR DE LA APLICACION");
           
           System.out.println("ESCRIBE UNA DE LOS SIGUIENTES OPERADORES:");
            int operador = ejerc2.nextInt();
            
            switch(operador)
            {
               case 1:
                   System.out.println("HAS SELECCIONADO EL OPERADOR CLARO CON LOS SIGUIENTES PLANES:");
                   System.out.println("PRECIO       :   S/. 99");
                   System.out.println("MINUTOS      :   400 MINUTOS");
                   System.out.println("RPC          :   ILIMITADO");
                   System.out.println("INTERNET     :   2 GB");
                   System.out.println("SMS          :   500 MENSAJES");
                   break;
               case 2:
                   System.out.println("HAS SELECCIONADO EL OPERADOR MOVISTAR CON LOS SIGUIENTES PLANES");
                   System.out.println("PRECIO       :   S/. 120.00");
                   System.out.println("MINUTOS      :   900 MINUTOS");
                   System.out.println("RPC          :   ILIMITADO");
                   System.out.println("INTERNET     :   4 GB");
                   System.out.println("SMS          :   1000 MENSAJES");
                   break;
                case 3:
                   System.out.println("HAS SELECCIONADO EL OPERADOR ENTEL CON LOS SIGUIENTES PLANES");
                   System.out.println("PRECIO       :   S/. 150.00");
                   System.out.println("MINUTOS      :   IMLIMITADOS");
                   System.out.println("RPC          :   ILIMITADOS");
                   System.out.println("INTERNET     :   6 GB");
                   System.out.println("SMS          :   ILIMITADOS");
                   
                   break;
                default:
                   System.out.println("SOLO DEBEN EXISTIR OPCIONES ENTRE 1 Y 4");
    }
    
         }
         }
    }
}
