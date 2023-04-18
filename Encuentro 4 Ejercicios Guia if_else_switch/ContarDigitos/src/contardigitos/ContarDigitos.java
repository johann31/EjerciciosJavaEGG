/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contardigitos;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class ContarDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = leer.nextInt();
        int digitos = 0;
        while (numero != 0) {
            numero /= 10;
            digitos++;
        }

        System.out.println("El número de dígitos del número ingresado es: " + digitos);
       
    }
}
