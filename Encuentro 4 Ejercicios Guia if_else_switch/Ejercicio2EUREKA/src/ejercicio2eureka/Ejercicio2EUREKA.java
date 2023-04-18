/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2eureka;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class Ejercicio2EUREKA {

    /**
     * @param args the command line arguments
     * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto,
     * sino mostrará un mensaje de Incorrecto. 
     * Nota: investigar la función equals() en Java.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner frase = new Scanner(System.in);
        String clave="Eureka";
        System.err.println("Ingresa la palabra clave");
        String str = frase.nextLine();
        
                 
             if (clave.equalsIgnoreCase(str)) {
            System.err.println("Correcto");
        }else {
            System.err.println("Incorrecto");
        }
       
       
    }
    
}
