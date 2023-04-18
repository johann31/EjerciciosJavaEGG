/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra7encuentro456;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class EjercicioExtra7Encuentro456 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    int cant, num,num1, may, men;
    may = 0;
    men = 1000;
    cant = 0;
            
    double tot = 0;
          
        System.out.println("ingrese la cantidad de numeros a cargar");
        num1 = s.nextInt();
        do {
            System.out.println("ingrese un numero (1-999)");
            num = s.nextInt();
            cant ++;
            
            tot = tot + num;
            if (num > may) {
                may = num;
            }
            if (num < men) {
            men = num;
        }
            
 
            
        } while (cant < num1 );
        System.out.println("el numero mayor es " + may); 
        System.out.println("el numero menor  es " + men);
        System.out.println("el promedio es " + (tot / cant));
            }
    
}