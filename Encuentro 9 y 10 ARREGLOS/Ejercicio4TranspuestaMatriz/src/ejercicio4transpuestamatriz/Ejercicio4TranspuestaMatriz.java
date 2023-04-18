/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4transpuestamatriz;

/**
 *
 * @author johan
 */
public class Ejercicio4TranspuestaMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   // Crear una matriz de 4 x 4 y llenarla con valores aleatorios
    int[][] matriz = new int[4][4];
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = (int) (Math.random() * 10);
      }
    }

    // Mostrar la matriz original
    System.out.println("Matriz original:");
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }

    // Obtener la traspuesta de la matriz y mostrarla
    int[][] traspuesta = new int[4][4];
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        traspuesta[j][i] = matriz[i][j];
      }
    }

    System.out.println("Matriz traspuesta:");
    for (int i = 0; i < traspuesta.length; i++) {
      for (int j = 0; j < traspuesta[i].length; j++) {
        System.out.print(traspuesta[i][j] + " ");
      }
      System.out.println();
    }
  }
}