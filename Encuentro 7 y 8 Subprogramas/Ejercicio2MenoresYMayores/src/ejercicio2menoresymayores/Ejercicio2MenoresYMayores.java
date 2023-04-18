/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2menoresymayores;
import java.util.Scanner;
/**
 *
 * @author johan
 */
public class Ejercicio2MenoresYMayores {

    /**
     * @param args the command line arguments
     * Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas 
     * ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle 
     * al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
     */
    public static void main(String[] arg) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingrese una edad");
        int edad = leer.nextInt();
        IngresarNombre(nombre, edad);
    }
   
    public static void IngresarNombre(String nombre, int edad) {        
        Scanner op = new Scanner(System.in);
        if (edad<18) {
            System.out.println(nombre + " es menor de edad");
        } else{
            System.out.println(nombre +"es mayor de edad");
        }
        System.out.println("¿Desea seguir mostrando personas? (S/N)");
        String resp = op.nextLine();
        if (resp.equalsIgnoreCase("S")) {
            main(new String[]{});
            
        } else{
            return;
        }
    }
}
