/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esmultiploprocedimientos;

import java.util.Scanner;

/**
 *
 * @author johann
 * Ejercicio 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
* validando que el primer número múltiplo del segundo e imprima si el primer número
* es múltiplo del segundo, sino informe que no lo son.
 */
public class EsMultiploProcedimientos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
       int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
       int num2 = leer.nextInt();
       EsMultiplo(num1, num2);
    }
    public static void EsMultiplo(int num1, int num2){
        if (num1 % num2 == 0) {
            System.out.println("Es primer numero es multplo del segundo");
        } else {
            System.out.println("No son multiplos");
        }
    } 
          
}
