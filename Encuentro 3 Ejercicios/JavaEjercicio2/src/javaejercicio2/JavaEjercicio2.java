/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio2;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class JavaEjercicio2 {

    /**
     * @param args the command line arguments
     * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
       String name;
       
        System.out.println("Ingresa el nombre");
        name = leer.next();
        System.out.println("Hola " + name);
        
       
    }
    
}
