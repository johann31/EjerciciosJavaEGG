/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6cuadradomagico;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class Ejercicio6CuadradoMagico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);

        // Pedimos al usuario los valores de la matriz
        int[][] matriz = new int[3][3];
        System.out.println("Introduzca los valores de la matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Fila " + (i + 1) + ", Columna " + (j + 1) + ": ");
                matriz[i][j] = leer.nextInt();
                // Verificamos que el valor introducido sea válido
                while (matriz[i][j] < 1 || matriz[i][j] > 9) {
                    System.out.println("El número introducido no es válido. Inténtelo de nuevo.");
                    System.out.print("Fila " + (i + 1) + ", Columna " + (j + 1) + ": ");
                    matriz[i][j] = leer.nextInt();
                }
            }
        }

        // Comprobamos si la matriz es un cuadrado mágico
        boolean esCuadradoMagico = true;

        // Suma de la primera fila
        int sumaFila1 = matriz[0][0] + matriz[0][1] + matriz[0][2];
        // Comparamos con las demás filas
        if (matriz[1][0] + matriz[1][1] + matriz[1][2] != sumaFila1
                || matriz[2][0] + matriz[2][1] + matriz[2][2] != sumaFila1) {
            esCuadradoMagico = false;
        }

        // Suma de la primera columna
        int sumaColumna1 = matriz[0][0] + matriz[1][0] + matriz[2][0];
        // Comparamos con las demás columnas
        if (matriz[0][1] + matriz[1][1] + matriz[2][1] != sumaColumna1
                || matriz[0][2] + matriz[1][2] + matriz[2][2] != sumaColumna1) {
            esCuadradoMagico = false;
        }

        // Suma de la diagonal principal
        int sumaDiagonal1 = matriz[0][0] + matriz[1][1] + matriz[2][2];
        // Comparamos con la diagonal secundaria
        if (matriz[0][2] + matriz[1][1] + matriz[2][0] != sumaDiagonal1) {
            esCuadradoMagico = false;
        }

        // Mostramos el resultado
        if (esCuadradoMagico) {
            System.out.println("La matriz es un cuadrado mágico.");
        } else {
            System.out.println("La matriz NO es un cuadrado mágico.");
        }
    }
}