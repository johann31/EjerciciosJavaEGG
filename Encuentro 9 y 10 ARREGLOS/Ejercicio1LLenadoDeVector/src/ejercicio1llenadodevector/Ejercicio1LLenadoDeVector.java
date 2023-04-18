/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1llenadodevector;

/**
 *
 * @author johan
 */
public class Ejercicio1LLenadoDeVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[] numeros = new int[100];

    // Llenar el vector con los 100 primeros números enteros
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = i + 1;
    }

    // Mostrar los números en orden descendente
    for (int i = numeros.length - 1; i >= 0; i--) {
      System.out.println(numeros[i] + " ");
    }
  }
}
