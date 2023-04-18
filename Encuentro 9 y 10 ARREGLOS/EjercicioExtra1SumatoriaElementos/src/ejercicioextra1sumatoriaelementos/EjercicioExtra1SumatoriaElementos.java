/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra1sumatoriaelementos;

import java.util.Scanner;

/**
 *
 * @author johan
 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N,
 * con los valores ingresados por el usuario.

 */
public class EjercicioExtra1SumatoriaElementos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del vector");
    int n = leer.nextInt();
    int suma=0;
    int[] vector= new int[n];
        System.out.println("Ingrese los valores que componen el vector");
        for (int i = 0; i < vector.length; i++) {
            vector[i]=leer.nextInt();
            suma += vector[i];
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" " + vector[i] + " " );
        }
        System.out.println("");
        System.out.println("La sumatoria del vector es: " + suma);
    }
    
}
