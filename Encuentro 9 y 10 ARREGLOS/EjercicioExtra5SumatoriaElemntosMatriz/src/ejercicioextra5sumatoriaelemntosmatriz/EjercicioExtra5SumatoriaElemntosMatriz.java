/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra5sumatoriaelemntosmatriz;
import java.util.Scanner;
/**
 *
 * @author johan
 * Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
 */
public class EjercicioExtra5SumatoriaElemntosMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el tambaño N de la matriz");
        int N = leer.nextInt();
        System.out.println("Ingresa el tamaño M de la matriz");
        int M = leer.nextInt();
        int suma=0;
        int[][] matriz = new int[N][M];
        for (int i = 0; i < N ; i++) {
            for (int j = 0; j < M; j++) {
               matriz[i][j] = (int) (Math.random() * 101);
                suma += matriz[i][j];
            }
        }
        System.out.println("La matriz generada es:");
        for (int i = 0; i < N ; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }
}