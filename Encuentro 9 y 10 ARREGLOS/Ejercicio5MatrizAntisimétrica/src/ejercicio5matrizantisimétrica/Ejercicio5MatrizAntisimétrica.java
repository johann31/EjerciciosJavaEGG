/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5matrizantisimétrica;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class Ejercicio5MatrizAntisimétrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        // Pedimos al usuario el tamaño de la matriz
        System.out.print("Ingrese el tamaño de la matriz: ");
        int n = leer.nextInt();

        // Pedimos al usuario los valores de la matriz
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Ingrese el valor de la fila " + (i + 1) + " y columna " + (j + 1) + ": ");
                matriz[i][j] = leer.nextInt();
            }
        }

        // Mostramos la matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        // Comprobamos si es antisimétrica
        boolean esAntisimetrica = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    esAntisimetrica = false;
                    break;
                }
            }
        }

        // Mostramos el resultado
        if (esAntisimetrica) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz NO es antisimétrica.");
        }
    }

    // Método para mostrar una matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
