/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14extra;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class Ejercicio14Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de familias: ");
        int numFamilias = leer.nextInt();

        int totalHijos = 0;
        for (int i = 1; i <= numFamilias; i++) {
            System.out.print("Ingrese la cantidad de hijos de la familia " + i + ": ");
            int numHijos = leer.nextInt();
            totalHijos += numHijos;

            for (int j = 1; j <= numHijos; j++) {
                System.out.print("Ingrese la edad del hijo " + j + " de la familia " + i + ": ");
                int edadHijo = leer.nextInt();
            }
        }

        double mediaEdadHijos = (double) totalHijos / numFamilias;
        System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdadHijos);

    }

}