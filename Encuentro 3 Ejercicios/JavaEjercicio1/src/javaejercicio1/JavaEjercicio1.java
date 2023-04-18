/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio1;

import java.util.Scanner;

/**
 *
 * @author johan
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
 * El programa deberá después mostrar el resultado de la suma
 */
public class JavaEjercicio1 {

    /**
     * @param args the command line arguments
     */
  
   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);

      int numero1, numero2, suma;

      System.out.print("Ingrese el primer número entero: ");
      numero1 = entrada.nextInt();

      System.out.print("Ingrese el segundo número entero: ");
      numero2 = entrada.nextInt();

      suma = numero1 + numero2;

      System.out.println("La suma de los dos números es: " + suma);
   }
}

  
    

