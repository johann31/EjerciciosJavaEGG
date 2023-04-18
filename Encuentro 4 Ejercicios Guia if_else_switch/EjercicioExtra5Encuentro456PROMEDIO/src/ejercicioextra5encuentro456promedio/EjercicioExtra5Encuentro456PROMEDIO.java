/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra5encuentro456promedio;
import java.util.Scanner;
/**
 *
 * @author johan
 */
public class EjercicioExtra5Encuentro456PROMEDIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int n = leer.nextInt();
        System.out.println("Ingrese las estaturas en metros");
        double metros = 0,sumasgeneral=0, sumabajos=0;
        int bajos=0;
        for (int i = 0; i < n; i++) {
            metros=leer.nextDouble();
            if (metros < 1.60) {
                bajos++;
                sumabajos=+metros;
            }
            sumasgeneral= sumasgeneral+ metros;
        }
        System.out.println("El promedio de menores de 1.60 es "+ sumabajos/bajos);
        System.out.println("El promedio general es " + sumasgeneral/n);
    
    }
    
}
