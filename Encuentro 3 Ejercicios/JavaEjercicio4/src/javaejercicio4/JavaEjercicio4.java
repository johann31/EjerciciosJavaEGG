/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio4;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class JavaEjercicio4 {

    /**
     * @param args the command line arguments
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
     * La fórmula correspondiente es: F = 32 + (9 * C / 5).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura actual");
        double C = leer.nextDouble();
        double F = 32 + (9 * C / 5);
        System.out.println("La tempura en grados Fahrenheit es " + F);
        
    }
    
}
