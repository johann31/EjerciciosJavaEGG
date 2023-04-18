/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinamultiplicacion;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class AdivinaMultiplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int num1 = (int)(Math.random() * 11);
        int num2 = (int)(Math.random() * 11);
        
        int resultado = num1 * num2;
        
         int respuesta = -1;
        
        Scanner leer = new Scanner(System.in);
        
        while (respuesta != resultado) {
            // Pedir al usuario que ingrese su respuesta
            System.out.print("¿Cuál es el resultado de " + num1 + " x " + num2 + "? ");
            respuesta = leer.nextInt();
            
            // Comprobar si la respuesta es correcta
            if (respuesta == resultado) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Respuesta incorrecta. Por favor, inténtelo de nuevo.");
            }
        }
    }
}