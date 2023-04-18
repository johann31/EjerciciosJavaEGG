/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericicio10guia3encuentro4;
import java.util.Scanner;
/**
 *
 * @author johan
 */
public class Ejericicio10Guia3Encuentro4 {

    /**
     * @param args the command line arguments
     * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
    el número ingresado seguido de tantos asteriscos como indique su valor. Por
    ejemplo:
    5 *****
    3 ***
    11 ***********
    2  **

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese un número entre 1 y 20: ");
  
      for (int i = 0; i<4; i++){
          int numero = leer.nextInt();
     for (int j = 0; j<=numero; j++ ) {
            System.out.print( " * ");
        }
          System.out.println("");
    }
       
    }
}
    
    
    
    
    
    
    
    
    
    
    
    

