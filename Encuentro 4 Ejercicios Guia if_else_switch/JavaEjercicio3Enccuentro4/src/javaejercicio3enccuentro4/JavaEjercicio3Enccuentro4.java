/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio3enccuentro4;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class JavaEjercicio3Enccuentro4 {

    /**
     * @param args the command line arguments
     * Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
     *  y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int nota;
        System.out.println("Ingresa una nota");
        nota = leer.nextInt();
        while (nota < 0 || nota > 10) {            
            System.out.println("La nota ingresada no esta entre el 0 y el 10");
            System.out.println("Ingrese una nota valida");
            nota=leer.nextInt();
        }
         System.out.println("Nota Valida");      
    }
    
}
