/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2buscadordelvector;
import java.util.Scanner;
import java.util.Vector;
/**
 *
 * @author johan
 */
public class Ejercicio2BuscadorDelVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    System.out.print("Ingrese el tamaño del vector: ");
    int N = leer.nextInt();

    int[] vector = new int[N];

   
    for (int i = 0; i < vector.length; i++) {
      vector[i] = (int) (Math.random() * 101);
    }


    System.out.print("Vector generado: ");
    for (int i = 0; i < vector.length; i++) {
      System.out.print(vector[i] + " ");
    }
    System.out.println();

 
    System.out.print("Ingrese el número a buscar: ");
    int numeroBuscado = leer.nextInt();

   
    int contador = 0;
    for (int i = 0; i < vector.length; i++) {
      if (vector[i] == numeroBuscado) {
        contador++;
        System.out.println("El número " + numeroBuscado + " se encuentra en la posición " + i + " del vector.");
      }
    }

  
    if (contador > 1) {
      System.out.println("El número " + numeroBuscado + " se encontró " + contador + " veces en el vector.");
    } else if (contador == 1) {
      System.out.println("El número " + numeroBuscado + " se encontró 1 vez en el vector.");
    } else {
      System.out.println("El número " + numeroBuscado + " no se encontró en el vector.");
    }
  }
}