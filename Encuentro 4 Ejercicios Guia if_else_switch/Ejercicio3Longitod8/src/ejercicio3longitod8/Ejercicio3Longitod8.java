/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3longitod8;
import java.util.Scanner;
/**
 *
 * @author johan
 */
public class Ejercicio3Longitod8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una palabra o frase de hasta 8 caracteres");
        String frase = leer.nextLine();
        int longitud = frase.length();
        if (longitud != 8) {
            System.out.println("Incorrecto");
        } else {
            System.out.println("Correcto");
        }
    }
    
}
