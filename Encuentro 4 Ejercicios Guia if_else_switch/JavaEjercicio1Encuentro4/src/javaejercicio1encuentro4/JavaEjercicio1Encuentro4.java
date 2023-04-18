/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio1encuentro4;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class JavaEjercicio1Encuentro4 {

    /**
     * @param args the command line arguments
     * Implementar un programa que le pida dos números enteros al usuario y
     * determine si ambos o alguno de ellos es mayor a 25.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        int num= 25;
        System.out.println("Ingresa el primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt();
        
        if (num1 > num && num2 > num) {
            System.out.println("Ambos números son mayores a 25");
        } else if (num2 > num ) {
            System.out.println("El num2 es mayor a 25");
        } else if (num1 > num){
            System.out.println("El num 1 es mayor a 25");
        } else {
            System.out.println("Ninguno de los números es mayor a 25");
        }  
    }
    
}
