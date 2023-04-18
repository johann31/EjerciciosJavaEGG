/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio3;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class JavaEjercicio3 {

    /**
     * @param args the command line arguments
     * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

      System.out.print("Ingrese una frase: ");
      String frase = entrada.nextLine();

      String mayusculas = frase.toUpperCase();
      String minusculas = frase.toLowerCase();

      System.out.println("La frase en mayúsculas es: " + mayusculas);
      System.out.println("La frase en minúsculas es: " + minusculas);
    }
    
}
