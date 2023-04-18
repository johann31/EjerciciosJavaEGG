/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra7encuentro456versonwhile;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class EjercicioExtra7Encuentro456VersonWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner leer = new Scanner(System.in);

        System.out.print("Introduce la cantidad de números a procesar: ");
        int n = leer.nextInt();

        double sum = 0;
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;

        int i = 0;
        while (i < n) {
            System.out.print("Introduce un número: ");
            double num = leer.nextDouble();

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }

            sum += num;
            i++;
        }

        double prom = sum / n;

        System.out.println("El valor mínimo es: " + min);
        System.out.println("El valor máximo es: " + max);
        System.out.println("El promedio es: " + prom);
    }
}