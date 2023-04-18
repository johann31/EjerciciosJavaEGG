/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;
import java.util.Scanner;
/**
 *
 * @author johan
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int numero, suma = 0, i = 0;

      do {
         System.out.println("Ingrese un número: ");
         numero = sc.nextInt();

         if (numero == 0) {
            System.out.println("Se capturó el numero cero");
            break;
         }

         if (numero > 0) {
            suma += numero;
         }

         i++;
      } while (i < 20);

      System.out.println("La suma de los numeros leidos es: " + suma);
   }
}
