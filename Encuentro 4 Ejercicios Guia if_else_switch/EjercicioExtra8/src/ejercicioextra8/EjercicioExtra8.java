/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra8;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class EjercicioExtra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int cont = 0;
        int conteoPar = 0;
        int conteoImpar = 0;

        while (true) {
            System.out.print("Introduce un número entero (0 para salir): ");
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num < 0) {
                continue;
            }

            cont++;

            if (num % 5 == 0) {
                break;
            }

            if (num % 2 == 0) {
                conteoPar++;
            } else {
                conteoImpar++;
            }
        }

        System.out.println("Cantidad de números leídos: " + cont);
        System.out.println("Cantidad de números pares: " + conteoPar);
        System.out.println("Cantidad de números impares: " + conteoImpar);
    }
}