/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3contabilizacionnumeros;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class Ejercicio3ContabilizacionNumerosConComentarios{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese el tamaño del vector: ");
    int N = sc.nextInt();

    int[] numeros = new int[N];

    // Llenar el vector con valores aleatorios
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = (int) (Math.random() * 1000);
    }

    // Mostrar el vector generado
    System.out.print("Vector generado: ");
    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i] + " ");
    }
    System.out.println();

    int[] contadores = new int[6]; // un contador para cada cantidad de dígitos

    // Contar la cantidad de números de 1, 2, 3, 4 y 5 dígitos
    for (int i = 0; i < numeros.length; i++) {
      int cantidadDigitos = String.valueOf(numeros[i]).length();
      contadores[cantidadDigitos]++;
    }

    // Mostrar los resultados de la cuenta
    for (int i = 1; i <= 5; i++) {
      System.out.println("Cantidad de números de " + i + " dígito(s): " + contadores[i]);
    }
  }
}