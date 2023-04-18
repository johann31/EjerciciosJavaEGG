/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio5;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class JavaEjercicio5 {

    /**
     * @param args the command line arguments
     * Escribir un programa que lea un número entero 
     * por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
     * Nota: investigar la función Math.sqrt().
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num, doble, triple;
        double raiz;
        System.out.println("Ingresa un numero");
        num = leer.nextInt();
        doble= num * 2;
        triple = num*3;
        raiz = Math.sqrt(num);
        System.out.println("El doble de " + num + " es " + doble + ", el triple es " + triple + " y la raiz cuadrada de " + num + " es " + raiz );
    }
     
}
