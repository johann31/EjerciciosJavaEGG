/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra9encuentro456;
import java.util.Scanner;
/**
 *
 * @author johan
 */
public class EjercicioExtra9Encuentro456 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el dividendo: ");
        int dividendo = sc.nextInt();

        System.out.print("Introduce el divisor: ");
        int divisor = sc.nextInt();

        int cociente = 0;
        int residuo = dividendo;

        while (residuo >= divisor) {
            residuo -= divisor;
            cociente++;
        }

        System.out.println("El cociente es: " + cociente);
        System.out.println("El residuo es: " + residuo);
    }
}
