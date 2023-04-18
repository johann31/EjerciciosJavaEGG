/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguia5declaracionarreglos;
import java.awt.BorderLayout;
import java.util.Scanner;
import java.util.Vector;
/**
 *
 * @author johan
 */
public class EjercicioGuia5DeclaracionArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    String[] vector = new String[5];
    int contador = 1;
    for (int i = 0; i <= 4; i++) {
     System.out.println("Ingresa nombre de la persona: " + contador);
      vector[i] = leer.nextLine();
      contador++;
    }
    for (int j = 0; j <= 4; j++) {
            System.out.println("[" + vector[j] + "]");
             }
    }
   
}
