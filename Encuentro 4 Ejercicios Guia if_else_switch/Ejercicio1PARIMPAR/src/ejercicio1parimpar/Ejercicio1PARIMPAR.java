/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1parimpar;
import java.util.Scanner;
/**
 *
 * @author johan
 */
public class Ejercicio1PARIMPAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero para saber si es par o impar");
        int numero = leer.nextInt();
        if (numero%2 != 0) {
            System.out.println("Su numero es impar");
        } else {
            System.out.println("Su numero es par");
        }
    }
    
}
