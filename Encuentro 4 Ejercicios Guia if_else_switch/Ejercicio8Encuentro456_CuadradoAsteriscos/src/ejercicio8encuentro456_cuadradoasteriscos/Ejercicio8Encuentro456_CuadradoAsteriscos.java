/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8encuentro456_cuadradoasteriscos;
import java.util.Scanner;
/**
 *
 * @author johan
 */
public class Ejercicio8Encuentro456_CuadradoAsteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        
        int num = leer.nextInt();
        for (int i = 1 ; i <= num ; i++) {
            for (int j=1; j<= num ; j++){
                if (i>1 && i<num && j>1 && j<num) {
                    System.out.print("   ");
                }else {
                    System.out.print("*  ");
                }
                 
            }
           System.out.println("");
        }
        
    }
    
}
