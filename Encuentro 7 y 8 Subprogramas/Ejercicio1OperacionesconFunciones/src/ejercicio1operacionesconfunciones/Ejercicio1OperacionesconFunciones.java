/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1operacionesconfunciones;

import java.util.Scanner;

/**
 *
 * @author johan
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 
 * La aplicación debe tener una función para cada operación matemática y 
 * deben devolver sus resultados para imprimirlos en el main. 
 */
public class Ejercicio1OperacionesconFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingresa el segundo numero");
        int num2 = leer.nextInt();
        System.out.println("Elige que operacion quieres realizar");
        System.out.println("\n1. SUMAR \n2. RESTAR  \n3. MULTIPLICAR \n4. DIVIDIR \n5. SALIR" );
        int op = leer.nextInt();
        switch(op){
            case 1:
                int  suma = suma(num1, num2);
                System.out.println("La suma de " + num1 + "+" + num2 + "=" + suma );
                break;
            case 2:
                int resta = resta(num1, num2);
                System.out.println("La resta de " + num1 + "-" + num2 + "=" + resta );
                break;
                
                
            case 3:
                 int mult = mult(num1, num2);
                System.out.println("La multiplicacion de " + num1 + "*" + num2 + "=" + mult );
                break;
                
                
            case 4:
                 double div = div(num1, num2);
                System.out.println("La multiplicacion de " + num1 + "/" + num2 + "=" + div );
                break;
                
            case 5:
                System.out.println("Saliendo...Nos vemos pronto.");
                break;
                
            default: System.out.println("Elige una opcion valida");
                break;
        
        }
    }
    public static int suma( int num1, int num2){
    int suma;
    suma = num1 + num2;
    return suma;
    }
    public static int resta( int num1, int num2){
    int resta;
    resta = num1 - num2;
    return resta;
    }
    public static int mult( int num1, int num2){
    int mult;
    mult = num1 * num2;
    return mult;
    }
    public static double div( int num1, int num2){
    int div;
    div = num1 / num2;
    return div;
    }
}
