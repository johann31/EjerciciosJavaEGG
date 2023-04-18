/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4equalsubstringcomparacionprimeraletraa;
import java.util.Scanner;
/**
 *
 * @author johan
 */
public class Ejercicio4EqualSubstringComparacionPrimeraLetraA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner  frase = new Scanner(System.in);
        System.out.println("Ingresa una frase. Si la primera letra es una A sera CORRECTO en caso contrario sera INCORRECTO");
        String letra = "A";
        String palabra = frase.nextLine();
        String cadena = palabra.substring(0, 1);
        if (letra.equalsIgnoreCase(cadena)) {
            System.out.println("CORRECTO");
        }else{
            System.err.println("INCORRECTO");
        }
    }
    
}
