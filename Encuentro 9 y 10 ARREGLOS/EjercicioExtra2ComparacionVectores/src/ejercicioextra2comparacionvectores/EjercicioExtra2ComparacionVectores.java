/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra2comparacionvectores;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class EjercicioExtra2ComparacionVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
        System.out.print("Introduce el tamaño de los vectores: ");
        int tam = leer.nextInt();

        int[] vector1 = new int[tam];
        int[] vector2 = new int[tam];

        System.out.println("Introduce los elementos del primer vector: ");
        for (int i = 0; i < tam; i++) {
            vector1[i] = leer.nextInt();
        }
 boolean iguales = true;
        System.out.println("Introduce los elementos del segundo vector: ");
        for (int i = 0; i < tam; i++) {
            vector2[i] = leer.nextInt();
             if (vector1[i] != vector2[i]) {
                iguales = false;
                break;
            }
        }

       

        for (int i = 0; i < tam; i++) {
            if (vector1[i] != vector2[i]) {
                iguales = false;
                break;
            }
        }

        if (iguales) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores son diferentes");
        }
    }
}